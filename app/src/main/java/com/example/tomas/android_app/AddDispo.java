package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddDispo extends AppCompatActivity {
    EditText dispName;
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_dispo);

        tv= findViewById(R.id.editDisp);

        FloatingActionButton done = findViewById(R.id.doneAD);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispName= findViewById(R.id.editDisp);
                tv.setText("Your input: \n" + dispName.getText().toString());
                /* Uncomment this when correct adddispo called
                Intent intent = new Intent(AddDispo.this, MainActivity.class);
                startActivity(intent);
                */
            }
        });

        FloatingActionButton back = findViewById(R.id.backAD);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddDispo.this, Dispositives.class);
                startActivity(intent);
            }
        });

    }
}
