package com.example.tomas.android_app.devices;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tomas.android_app.API.SingletonAPI;
import com.example.tomas.android_app.R;
import com.example.tomas.android_app.states.TimerState;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

public class Timer extends AppCompatActivity {

    private Context context = this;

     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        final ToggleButton startstop = findViewById(R.id.startstop);
        final TimePicker timePicker = findViewById(R.id.timePicker);
        startstop.setOnCheckedChangeListener(null);
        timePicker.setOnTimeChangedListener(null);
        timePicker.setIs24HourView(true);

         final ProgressDialog progress = new ProgressDialog(this);
         progress.setTitle(R.string.loading_title);
         progress.setMessage(this.getString(R.string.loading_text));
         progress.setCancelable(false);
         progress.show();

        final String deviceId = getIntent().getStringExtra("deviceId");

        final CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "start",
                            new JSONObject(),
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {
                                    Log.d("runActionInDevice", response.toString());
                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    VolleyLog.d("runActionInDevice", "Error: " + error.getMessage());
                                }
                            });

                    SingletonAPI.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectReq, "runActionInDevice");

                } else {
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "stop",
                            new JSONObject(),
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {
                                    Log.d("runActionInDevice", response.toString());
                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    VolleyLog.d("runActionInDevice", "Error: " + error.getMessage());
                                }
                            });

                    SingletonAPI.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectReq, "runActionInDevice");
                }
            }
        };

        final TimePicker.OnTimeChangedListener onTimeChangedListener = new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                int minutes = i * 60 + i1;
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.accumulate("0", minutes);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                        SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "setInterval",
                        jsonObject,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                Log.i("runActionInDevice", response.toString());
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                VolleyLog.d("runActionInDevice", "Error: " + error.getMessage());
                            }
                        });

                SingletonAPI.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectReq, "runActionInDevice");
            }
        };

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "getState",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("runActionInDevice", response.toString());

                        Gson gson;
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gson = gsonBuilder.create();

                        TimerState result = gson.fromJson(response.toString(), TimerState.class);

                        Log.i("TimerState", result.getResult().getStatus());

                        int minutes;

                        if (result.getResult().getStatus().equals("inactive")) {
                            startstop.setChecked(false);
                            minutes = result.getResult().getInterval();
                        } else {
                            startstop.setChecked(true);
                            minutes = result.getResult().getRemaining();
                        }

                        if (Build.VERSION.SDK_INT < 23) {
                            timePicker.setCurrentHour(minutes / 60);
                            minutes %= 60;
                            timePicker.setCurrentMinute(minutes);
                        } else {
                            timePicker.setHour(minutes / 60);
                            minutes %= 60;
                            timePicker.setMinute(minutes);
                        }

                        startstop.setOnCheckedChangeListener(checkedChangeListener);
                        timePicker.setOnTimeChangedListener(onTimeChangedListener);
                        progress.dismiss();

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("runActionInDevice", "Error: " + error.getMessage());

                        progress.dismiss();

                        AlertDialog.Builder builder;
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            builder = new AlertDialog.Builder(context, android.R.style.Theme_Material_Dialog_Alert);
                        } else {
                            builder = new AlertDialog.Builder(context);
                        }
                        builder.setTitle(R.string.server_problem_title)
                            .setMessage(R.string.server_problem_text)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    onBackPressed();
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                    }
                });

        SingletonAPI.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectReq, "runActionInDevice");
    }
}

