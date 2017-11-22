package com.example.tomas.android_app.devices;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
import com.example.tomas.android_app.states.DoorState;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

public class Door extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.door);


        final ToggleButton openclose = findViewById(R.id.openclose);
        final ToggleButton lock = findViewById(R.id.lock);
        openclose.setOnCheckedChangeListener(null);
        lock.setOnCheckedChangeListener(null);
        final String deviceId = getIntent().getStringExtra("deviceId");

        final CompoundButton.OnCheckedChangeListener onCheckedChangeListenerOpenClose = new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Opened
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "close",
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
                    // Closed
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "open",
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

        final CompoundButton.OnCheckedChangeListener onCheckedChangeListenerLock = new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Unlocked
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "lock",
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
                    // Locked
                    JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                            SingletonAPI.BASE_URL + "devices/" + deviceId + "/" + "unlock",
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

                        DoorState result = gson.fromJson(response.toString(), DoorState.class);

                        Log.i("DoorState", result.getResult().getStatus());

                        if (result.getResult().getStatus().equals("closed")) {
                            openclose.setChecked(true);
                        } else {
                            openclose.setChecked(false);
                        }

                        if (result.getResult().getLock().equals("locked")) {
                            lock.setChecked(true);
                        } else {
                            lock.setChecked(false);
                        }

                        openclose.setOnCheckedChangeListener(onCheckedChangeListenerOpenClose);
                        lock.setOnCheckedChangeListener(onCheckedChangeListenerLock);
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
