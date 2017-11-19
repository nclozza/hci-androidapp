package com.example.tomas.android_app.API;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class RoutinesAPI {

    private static String BASE_URL = "http://10.0.2.2:8080/api/";

    /**
     * Retrieve all routines
     */
    public static void getAllRoutines(Context context) {

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                BASE_URL + "routines",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("getAllRoutines", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("getAllRoutines", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "getAllRoutines");
    }


    /**
     * Creates a new routine
     * @param name The routine name
     * @param actions The actions to perform
     */
    public static void createRoutine(Context context, String name, String actions) {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.accumulate("name", name);
            jsonObject.accumulate("actions", actions);
            jsonObject.accumulate("meta", "{}");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.POST,
                BASE_URL + "routines",
                jsonObject,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("createRoutine", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("createRoutine", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "createRoutine");
    }

    /**
     * Delete an existing routine
     * @param routineId The routine id
     */
    public static void deleteRoutine(Context context, String routineId) {

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.DELETE,
                BASE_URL + "routines/" + routineId,
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("deleteRoutine", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("deleteRoutine", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "deleteRoutine");
    }

    /**
     * Executes a specific routine
     * @param routineId The routine id
     */
    public static void executeRoutine(Context context, String routineId) {

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.PUT,
                BASE_URL + "routines/" + routineId + "/execute",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("executeRoutine", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("executeRoutine", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "executeRoutine");
    }
}
