package com.example.tomas.android_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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


public class Dispositives  extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispositives);


        int i = 1;

        switch (i) {
            case 1:
                Button dispositive1 = findViewById(R.id.dispositive1);
                dispositive1.setText("dispositive");
                dispositive1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

            case 2:
                Button dispositive2 = findViewById(R.id.dispositive2);
                dispositive2.setText("dispositive");
                dispositive2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

            case 3:
                Button dispositive3 = findViewById(R.id.dispositive3);
                dispositive3.setText("dispositive");
                dispositive3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

            case 4:
                Button dispositive4 = findViewById(R.id.dispositive4);
                dispositive4.setText("dispositive");
                dispositive4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

        }
    }
}
