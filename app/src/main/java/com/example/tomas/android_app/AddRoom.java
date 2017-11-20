package com.example.tomas.android_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.tomas.android_app.API.SingletonAPI;

import org.json.JSONException;
import org.json.JSONObject;

public class AddRoom extends AppCompatActivity {

    EditText roomName;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_room);

        tv = findViewById(R.id.editRoom);
        tv.setMovementMethod(new ScrollingMovementMethod());

        FloatingActionButton fab = findViewById(R.id.doneB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roomName = findViewById(R.id.editRoom);
                addRoom(getApplicationContext(), roomName.getText().toString());
                //We have to pop the current Activity after created the new room to return to de previous one
            }
        });

        FloatingActionButton back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddRoom.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

    public static void addRoom(Context context, String name) {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.accumulate("name", name);
            jsonObject.accumulate("meta", "{}");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectReq = new JsonObjectRequest(Request.Method.POST,
                SingletonAPI.BASE_URL + "rooms",
                jsonObject,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("addRoom", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("addRoom", "Error: " + error.getMessage());
                    }
                });

        SingletonAPI.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjectReq, "addRoom");
    }
}
