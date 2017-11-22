package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
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

public class Tab2Room extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab2room, container, false);

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                SingletonAPI.BASE_URL + "rooms",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("getAllRooms", response.toString());

                        Gson gson;
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gson = gsonBuilder.create();

                        Rooms rooms = gson.fromJson(response.toString(), Rooms.class);

                        Log.i("Rooms", rooms.toString());
                        int i = 1;
                        for (final Rooms.Room eachRoom : rooms.getRooms()) {
                            switch (i) {
                                case 1:
                                    Button button1 = rootView.findViewById(R.id.button1);
                                    button1.setText(eachRoom.getName());
                                    button1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button1.setVisibility(View.VISIBLE);
                                    break;

                                case 2:
                                    Button button2 = rootView.findViewById(R.id.button2);
                                    button2.setText(eachRoom.getName());
                                    button2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button2.setVisibility(View.VISIBLE);
                                    break;


                                case 3:
                                    Button button3 = rootView.findViewById(R.id.button3);
                                    button3.setText(eachRoom.getName());
                                    button3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button3.setVisibility(View.VISIBLE);
                                    break;


                                case 4:
                                    Button button4 = rootView.findViewById(R.id.button4);
                                    button4.setText(eachRoom.getName());
                                    button4.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button4.setVisibility(View.VISIBLE);
                                    break;

                                case 5:
                                    Button button5 = rootView.findViewById(R.id.button5);
                                    button5.setText(eachRoom.getName());
                                    button5.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button5.setVisibility(View.VISIBLE);
                                    break;

                                case 6:
                                    Button button6 = rootView.findViewById(R.id.button6);
                                    button6.setText(eachRoom.getName());
                                    button6.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button6.setVisibility(View.VISIBLE);
                                    break;

                                case 7:
                                    Button button7 = rootView.findViewById(R.id.button7);
                                    button7.setText(eachRoom.getName());
                                    button7.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button7.setVisibility(View.VISIBLE);
                                    break;

                                case 8:
                                    Button button8 = rootView.findViewById(R.id.button8);
                                    button8.setText(eachRoom.getName());
                                    button8.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button8.setVisibility(View.VISIBLE);
                                    break;

                                case 9:
                                    Button button9 = rootView.findViewById(R.id.button9);
                                    button9.setText(eachRoom.getName());
                                    button9.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button9.setVisibility(View.VISIBLE);
                                    break;

                                case 10:
                                    Button button10 = rootView.findViewById(R.id.button10);
                                    button10.setText(eachRoom.getName());
                                    button10.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button10.setVisibility(View.VISIBLE);
                                    break;

                                case 11:
                                    Button button11 = rootView.findViewById(R.id.button11);
                                    button11.setText(eachRoom.getName());
                                    button11.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button11.setVisibility(View.VISIBLE);
                                    break;

                                case 12:
                                    Button button12 = rootView.findViewById(R.id.button12);
                                    button12.setText(eachRoom.getName());
                                    button12.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button12.setVisibility(View.VISIBLE);
                                    break;

                                case 13:
                                    Button button13 = rootView.findViewById(R.id.button13);
                                    button13.setText(eachRoom.getName());
                                    button13.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
                                        }
                                    });
                                    button13.setVisibility(View.VISIBLE);
                                    break;

                                case 14:
                                    Button button14 = rootView.findViewById(R.id.button14);
                                    button14.setText(eachRoom.getName());
                                    button14.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), Dispositives.class);
                                            intent.putExtra("roomId", eachRoom.getId());
                                            startActivity(intent);
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

        return rootView;
    }

}