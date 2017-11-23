package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tomas.android_app.API.SingletonAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

public class Routines extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routines);

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                SingletonAPI.BASE_URL + "rooms",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("getAllRoutines", response.toString());

                        Gson gson;
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gson = gsonBuilder.create();

                        Rooms rooms = gson.fromJson(response.toString(), Rooms.class);

                        Log.i("Rooms", rooms.toString());
                        int i = 1;
                        for (final Rooms.Room eachRoom : rooms.getRooms()) {
                            switch (i) {
                                case 1:
                                    Button button1 = findViewById(R.id.buttonR1);
                                    button1.setText(eachRoom.getName());
                                    button1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button1.setVisibility(View.VISIBLE);
                                    break;

                                case 2:
                                    Button button2 = findViewById(R.id.buttonR2);
                                    button2.setText(eachRoom.getName());
                                    button2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button2.setVisibility(View.VISIBLE);
                                    break;


                                case 3:
                                    Button button3 = findViewById(R.id.buttonR3);
                                    button3.setText(eachRoom.getName());
                                    button3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button3.setVisibility(View.VISIBLE);
                                    break;


                                case 4:
                                    Button button4 = findViewById(R.id.buttonR4);
                                    button4.setText(eachRoom.getName());
                                    button4.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button4.setVisibility(View.VISIBLE);
                                    break;

                                case 5:
                                    Button button5 = findViewById(R.id.buttonR5);
                                    button5.setText(eachRoom.getName());
                                    button5.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button5.setVisibility(View.VISIBLE);
                                    break;

                                case 6:
                                    Button button6 = findViewById(R.id.buttonR6);
                                    button6.setText(eachRoom.getName());
                                    button6.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button6.setVisibility(View.VISIBLE);
                                    break;

                                case 7:
                                    Button button7 = findViewById(R.id.buttonR7);
                                    button7.setText(eachRoom.getName());
                                    button7.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button7.setVisibility(View.VISIBLE);
                                    break;

                                case 8:
                                    Button button8 = findViewById(R.id.buttonR8);
                                    button8.setText(eachRoom.getName());
                                    button8.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button8.setVisibility(View.VISIBLE);
                                    break;

                                case 9:
                                    Button button9 = findViewById(R.id.buttonR9);
                                    button9.setText(eachRoom.getName());
                                    button9.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button9.setVisibility(View.VISIBLE);
                                    break;

                                case 10:
                                    Button button10 = findViewById(R.id.buttonR10);
                                    button10.setText(eachRoom.getName());
                                    button10.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button10.setVisibility(View.VISIBLE);
                                    break;

                                case 11:
                                    Button button11 = findViewById(R.id.buttonR11);
                                    button11.setText(eachRoom.getName());
                                    button11.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button11.setVisibility(View.VISIBLE);
                                    break;

                                case 12:
                                    Button button12 = findViewById(R.id.buttonR12);
                                    button12.setText(eachRoom.getName());
                                    button12.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button12.setVisibility(View.VISIBLE);
                                    break;

                                case 13:
                                    Button button13 = findViewById(R.id.buttonR13);
                                    button13.setText(eachRoom.getName());
                                    button13.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button13.setVisibility(View.VISIBLE);
                                    break;

                                case 14:
                                    Button button14 = findViewById(R.id.buttonR14);
                                    button14.setText(eachRoom.getName());
                                    button14.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {

                                        }
                                    });
                                    button14.setVisibility(View.VISIBLE);
                                    break;
                            }

                            i++;
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("getAllRooms", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(getActivity()).addToRequestQueue(jsonObjectReq, "getAllRooms");

    }
}
