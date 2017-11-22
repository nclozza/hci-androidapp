package com.example.tomas.android_app.devices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tomas.android_app.API.SingletonAPI;
import com.example.tomas.android_app.R;
import com.example.tomas.android_app.states.BlindsState;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

public class Blinds extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blind);

        final ToggleButton updown = findViewById(R.id.updown);
        updown.setOnCheckedChangeListener(null);
        final String deviceId = getIntent().getStringExtra("deviceId");

        final CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Up
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "down",
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
                    // Down
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "up",
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

                        BlindsState result = gson.fromJson(response.toString(), BlindsState.class);

                        Log.i("BlindsState", result.getResult().getStatus());

                        if (result.getResult().getStatus().equals("opened") || result.getResult().getStatus().equals("opening")) {
                            updown.setChecked(false);
                        } else {
                            updown.setChecked(true);
                        }

                        updown.setOnCheckedChangeListener(onCheckedChangeListener);
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
