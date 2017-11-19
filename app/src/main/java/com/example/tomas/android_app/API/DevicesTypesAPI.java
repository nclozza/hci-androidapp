package com.example.tomas.android_app.API;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class DevicesTypesAPI {

    private static String BASE_URL = "http://10.0.2.2:8080/api/";

    /**
     * Retrieve all device types
     */
    public static void getAllDeviceTypes(Context context) {

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                BASE_URL + "devicetypes",
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("getAllDeviceTypes", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("getAllDeviceTypes", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "getAllDeviceTypes");
    }

    /**
     * Retrieve a specific device type
     * @param deviceTypeId The device type id
     */
    public static void getDeviceType(Context context, String deviceTypeId) {

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.GET,
                BASE_URL + "devicetypes" + deviceTypeId,
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("getDeviceType", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("getDeviceType", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "getDeviceType");
    }
}
