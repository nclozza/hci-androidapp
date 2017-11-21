package com.example.tomas.android_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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

            case 5:
                Button dispositive5 = findViewById(R.id.dispositive5);
                dispositive5.setText("dispositive");
                dispositive5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

            case 6:
                Button dispositive6 = findViewById(R.id.dispositive6);
                dispositive6.setText("dispositive");
                dispositive6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

            case 7:
                Button dispositive7 = findViewById(R.id.dispositive7);
                dispositive7.setText("dispositive");
                dispositive7.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;

            case 8:
                Button dispositive8 = findViewById(R.id.dispositive8);
                dispositive8.setText("dispositive");
                dispositive8.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 9:
                Button dispositive9 = findViewById(R.id.dispositive9);
                dispositive9.setText("dispositive");
                dispositive9.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 10:
                Button dispositive10 = findViewById(R.id.dispositive10);
                dispositive10.setText("dispositive");
                dispositive10.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 11:
                Button dispositive11 = findViewById(R.id.dispositive11);
                dispositive11.setText("dispositive");
                dispositive11.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 12:
                Button dispositive12 = findViewById(R.id.dispositive12);
                dispositive12.setText("dispositive");
                dispositive12.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 13:
                Button dispositive13 = findViewById(R.id.dispositive13);
                dispositive13.setText("dispositive");
                dispositive13.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 14:
                Button dispositive14 = findViewById(R.id.dispositive14);
                dispositive14.setText("dispositive");
                dispositive14.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 15:
                Button dispositive15 = findViewById(R.id.dispositive15);
                dispositive15.setText("dispositive");
                dispositive15.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;


            case 16:
                Button dispositive16 = findViewById(R.id.dispositive16);
                dispositive16.setText("dispositive");
                dispositive16.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                    }
                });
                break;
            
        }
    }
}
