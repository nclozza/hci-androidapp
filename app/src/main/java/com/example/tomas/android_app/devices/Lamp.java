package com.example.tomas.android_app.devices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tomas.android_app.API.SingletonAPI;
import com.example.tomas.android_app.R;
import com.example.tomas.android_app.states.LampState;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;


public class Lamp extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lamp);

        final ToggleButton onoff = findViewById(R.id.onoff);
        final SeekBar brightness = findViewById(R.id.brightness);
        onoff.setOnCheckedChangeListener(null);
        final String deviceId = getIntent().getStringExtra("deviceId");

        final CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                        SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "turnOn",
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
                        SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "turnOff",
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

                        LampState result = gson.fromJson(response.toString(), LampState.class);

                        Log.i("BlindsState", result.getResult().getStatus());

                        if (result.getResult().getStatus().equals("off")) {
                            onoff.setChecked(false);
                        } else {
                            onoff.setChecked(true);
                        }

                        onoff.setOnCheckedChangeListener(onCheckedChangeListener);
                        brightness.setProgress(result.getResult().getBrightness());
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