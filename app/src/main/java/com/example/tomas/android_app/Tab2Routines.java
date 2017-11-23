package com.example.tomas.android_app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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
import com.example.tomas.android_app.states.RoutinesState;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

public class Tab2Routines extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2routines, container, false);

        final ProgressDialog progress = new ProgressDialog(getContext());
        progress.setTitle(R.string.loading_title);
        progress.setMessage(this.getString(R.string.loading_text));
        progress.setCancelable(false);

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                SingletonAPI.BASE_URL + "routines",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("getAllRoutines", response.toString());

                        Gson gson;
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gson = gsonBuilder.create();

                        RoutinesState routinesState = gson.fromJson(response.toString(), RoutinesState.class);

                        Log.i("AddRoutine", routinesState.toString());
                        int i = 1;
                        for (final RoutinesState.Routine eachRoutine : routinesState.getRoutines()) {
                            switch (i) {
                                case 1:
                                    Button button1 = getActivity().findViewById(R.id.buttonR1);
                                    button1.setText(eachRoutine.getName());
                                    button1.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button1.setVisibility(View.VISIBLE);
                                    break;

                                case 2:
                                    Button button2 = getActivity().findViewById(R.id.buttonR2);
                                    button2.setText(eachRoutine.getName());
                                    button2.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button2.setVisibility(View.VISIBLE);
                                    break;

                                case 3:
                                    Button button3 = getActivity().findViewById(R.id.buttonR3);
                                    button3.setText(eachRoutine.getName());
                                    button3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button3.setVisibility(View.VISIBLE);
                                    break;

                                case 4:
                                    Button button4 = getActivity().findViewById(R.id.buttonR4);
                                    button4.setText(eachRoutine.getName());
                                    button4.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button4.setVisibility(View.VISIBLE);
                                    break;

                                case 5:
                                    Button button5 = getActivity().findViewById(R.id.buttonR5);
                                    button5.setText(eachRoutine.getName());
                                    button5.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button5.setVisibility(View.VISIBLE);
                                    break;

                                case 6:
                                    Button button6 = getActivity().findViewById(R.id.buttonR6);
                                    button6.setText(eachRoutine.getName());
                                    button6.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button6.setVisibility(View.VISIBLE);
                                    break;

                                case 7:
                                    Button button7 = getActivity().findViewById(R.id.buttonR7);
                                    button7.setText(eachRoutine.getName());
                                    button7.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button7.setVisibility(View.VISIBLE);
                                    break;

                                case 8:
                                    Button button8 = getActivity().findViewById(R.id.buttonR8);
                                    button8.setText(eachRoutine.getName());
                                    button8.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button8.setVisibility(View.VISIBLE);
                                    break;

                                case 9:
                                    Button button9 = getActivity().findViewById(R.id.buttonR9);
                                    button9.setText(eachRoutine.getName());
                                    button9.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button9.setVisibility(View.VISIBLE);
                                    break;

                                case 10:
                                    Button button10 = getActivity().findViewById(R.id.buttonR10);
                                    button10.setText(eachRoutine.getName());
                                    button10.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button10.setVisibility(View.VISIBLE);
                                    break;

                                case 11:
                                    Button button11 = getActivity().findViewById(R.id.buttonR11);
                                    button11.setText(eachRoutine.getName());
                                    button11.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button11.setVisibility(View.VISIBLE);
                                    break;

                                case 12:
                                    Button button12 = getActivity().findViewById(R.id.buttonR12);
                                    button12.setText(eachRoutine.getName());
                                    button12.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button12.setVisibility(View.VISIBLE);
                                    break;

                                case 13:
                                    Button button13 = getActivity().findViewById(R.id.buttonR13);
                                    button13.setText(eachRoutine.getName());
                                    button13.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
                                        }
                                    });
                                    button13.setVisibility(View.VISIBLE);
                                    break;

                                case 14:
                                    Button button14 = getActivity().findViewById(R.id.buttonR14);
                                    button14.setText(eachRoutine.getName());
                                    button14.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            progress.show();
                                            executeRoutine(getActivity(), eachRoutine, progress);
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

    public static void executeRoutine(final Activity activity, final RoutinesState.Routine routine, final ProgressDialog progressDialog) {

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                SingletonAPI.BASE_URL + "routines/" + routine.getId() + "/execute",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("executeRoutine", response.toString());
                        progressDialog.dismiss();
                        MainActivity.sendNotification(activity.getString(R.string.routine_executed), routine.getName());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("executeRoutine", "Error: " + error.getMessage());

                        progressDialog.dismiss();

                        AlertDialog.Builder builder;
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            builder = new AlertDialog.Builder(activity, android.R.style.Theme_Material_Dialog_Alert);
                        } else {
                            builder = new AlertDialog.Builder(activity);
                        }
                        builder.setTitle(R.string.server_problem_title)
                                .setMessage(R.string.server_problem_text)
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                })
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .show();
                    }
                });

        SingletonAPI.getInstance(activity).addToRequestQueue(jsonObjectReq, "executeRoutine");
    }
}
