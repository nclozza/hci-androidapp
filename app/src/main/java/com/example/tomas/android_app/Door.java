package com.example.tomas.android_app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Door extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.door);


        Button open = findViewById(R.id.open);
        open.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


        Button close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


        Button lock = findViewById(R.id.lock);
        lock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


        Button unlock = findViewById(R.id.unlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
