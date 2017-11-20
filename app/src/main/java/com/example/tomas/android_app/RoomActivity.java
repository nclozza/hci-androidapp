package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tomas.android_app.R;

/**
 * Created by tomas on 20/11/2017.
 */

public class RoomActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_act);

        FloatingActionButton add = findViewById(R.id.addD);
        FloatingActionButton back = findViewById(R.id.backD);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoomActivity.this, AddDispo.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoomActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
