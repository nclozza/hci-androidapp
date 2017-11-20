package com.example.tomas.android_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Blind extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blind);


        Button on = findViewById(R.id.on);
        on.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


        Button off = findViewById(R.id.off);
        off.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
