package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddDispo extends AppCompatActivity {
    EditText dispName;
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_dispo);

//        tv=(TextView)findViewById(R.id.editRoom);
//        tv.setMovementMethod(new ScrollingMovementMethod());
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.doneAD);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                dispName=(EditText)findViewById(R.id.editDisp);
////                tv.setText("Your input: \n" + dispName.getText().toString());
//
//            }
//        });
//
//        FloatingActionButton back = (FloatingActionButton) findViewById(R.id.backAD);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(AddDispo.this, RoomActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}
