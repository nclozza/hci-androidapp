package com.example.tomas.android_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tomas.android_app.API.SingletonAPI;
import com.example.tomas.android_app.devices.Blinds;
import com.example.tomas.android_app.devices.Door;
import com.example.tomas.android_app.devices.Lamp;
import com.example.tomas.android_app.devices.NoDeviceYet;
import com.example.tomas.android_app.devices.Timer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;


public class Dispositives extends AppCompatActivity {


    Activity dispositivesActivity = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispositives);

        String roomId = getIntent().getStringExtra("roomId");
        Log.i("roomId", roomId);

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                SingletonAPI.BASE_URL + "rooms/" + roomId + "/devices",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("getRoomDevices", response.toString());

                        Gson gson;
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gson = gsonBuilder.create();

                        Devices devices = gson.fromJson(response.toString(), Devices.class);

                        Log.i("Devices", devices.toString());
                        int i = 1;
                        for (final Devices.Device eachDevice : devices.getDevices()) {
                            switch (i) {
                                case 1:
                                    Button dispositive1 = findViewById(R.id.dispositive1);
                                    dispositive1.setText(eachDevice.getName());
                                    dispositive1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive1.setVisibility(View.VISIBLE);
                                    break;

                                case 2:
                                    Button dispositive2 = findViewById(R.id.dispositive2);
                                    dispositive2.setText(eachDevice.getName());
                                    dispositive2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive2.setVisibility(View.VISIBLE);
                                    break;

                                case 3:
                                    Button dispositive3 = findViewById(R.id.dispositive3);
                                    dispositive3.setText(eachDevice.getName());
                                    dispositive3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive3.setVisibility(View.VISIBLE);
                                    break;

                                case 4:
                                    Button dispositive4 = findViewById(R.id.dispositive4);
                                    dispositive4.setText(eachDevice.getName());
                                    dispositive4.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive4.setVisibility(View.VISIBLE);
                                    break;

                                case 5:
                                    Button dispositive5 = findViewById(R.id.dispositive5);
                                    dispositive5.setText(eachDevice.getName());
                                    dispositive5.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive5.setVisibility(View.VISIBLE);
                                    break;

                                case 6:
                                    Button dispositive6 = findViewById(R.id.dispositive6);
                                    dispositive6.setText(eachDevice.getName());
                                    dispositive6.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive6.setVisibility(View.VISIBLE);
                                    break;

                                case 7:
                                    Button dispositive7 = findViewById(R.id.dispositive7);
                                    dispositive7.setText(eachDevice.getName());
                                    dispositive7.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive7.setVisibility(View.VISIBLE);
                                    break;

                                case 8:
                                    Button dispositive8 = findViewById(R.id.dispositive8);
                                    dispositive8.setText(eachDevice.getName());
                                    dispositive8.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive8.setVisibility(View.VISIBLE);
                                    break;

                                case 9:
                                    Button dispositive9 = findViewById(R.id.dispositive9);
                                    dispositive9.setText(eachDevice.getName());
                                    dispositive9.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive9.setVisibility(View.VISIBLE);
                                    break;

                                case 10:
                                    Button dispositive10 = findViewById(R.id.dispositive10);
                                    dispositive10.setText(eachDevice.getName());
                                    dispositive10.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive10.setVisibility(View.VISIBLE);
                                    break;

                                case 11:
                                    Button dispositive11 = findViewById(R.id.dispositive11);
                                    dispositive11.setText(eachDevice.getName());
                                    dispositive11.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive11.setVisibility(View.VISIBLE);
                                    break;

                                case 12:
                                    Button dispositive12 = findViewById(R.id.dispositive12);
                                    dispositive12.setText(eachDevice.getName());
                                    dispositive12.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive12.setVisibility(View.VISIBLE);
                                    break;

                                case 13:
                                    Button dispositive13 = findViewById(R.id.dispositive13);
                                    dispositive13.setText(eachDevice.getName());
                                    dispositive13.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive13.setVisibility(View.VISIBLE);
                                    break;

                                case 14:
                                    Button dispositive14 = findViewById(R.id.dispositive14);
                                    dispositive14.setText(eachDevice.getName());
                                    dispositive14.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive14.setVisibility(View.VISIBLE);
                                    break;

                                case 15:
                                    Button dispositive15 = findViewById(R.id.dispositive15);
                                    dispositive15.setText(eachDevice.getName());
                                    dispositive15.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive15.setVisibility(View.VISIBLE);
                                    break;

                                case 16:
                                    Button dispositive16 = findViewById(R.id.dispositive16);
                                    dispositive16.setText(eachDevice.getName());
                                    dispositive16.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = getIntent(eachDevice.getTypeId());
                                            intent.putExtra("deviceId", eachDevice.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    dispositive16.setVisibility(View.VISIBLE);
                                    break;
                            }

                            i++;
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("getRoomDevices", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(getApplicationContext()).addToRequestQueue(jsonObjectReq, "getRoomDevices");

        /*
        FloatingActionButton add = findViewById(R.id.addD);
        FloatingActionButton back = findViewById(R.id.backD);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dispositives.this, AddDispo.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dispositives.this, MainActivity.class);
                startActivity(intent);
            }
        });
        */

    }

    private Intent getIntent(String deviceTypeId) {
        Intent intent;

        switch (deviceTypeId) {
            case "eu0v2xgprrhhg41g": //Blinds
                intent = new Intent(dispositivesActivity, Blinds.class);
                break;

            case "go46xmbqeomjrsjr": //Lamp
                intent = new Intent(dispositivesActivity, Lamp.class);
                break;

            case "lsf78ly0eqrjbz91": //Door
                intent = new Intent(dispositivesActivity, Door.class);
                break;

            case "ofglvd9gqX8yfl3l": //Timer
                intent = new Intent(dispositivesActivity, Timer.class);
                break;

            default:
                intent = new Intent(dispositivesActivity, NoDeviceYet.class);
        }

        return intent;
    }
}
