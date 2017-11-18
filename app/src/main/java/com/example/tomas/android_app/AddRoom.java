package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by tomas on 17/11/2017.
 */

public class AddRoom extends AppCompatActivity {
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.add_room);
//    }

    EditText roomName;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_room);

        tv=(TextView)findViewById(R.id.editRoom);
        tv.setMovementMethod(new ScrollingMovementMethod());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.doneB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                //Aaa tenemos qeu chequear si estamos fuera de una habitación o en una habitación
                //Para saber si agregar dispositivo o habitación
//                Intent intent = new Intent(AddRoom.this, MainActivity.class);
//                startActivity(intent);
                roomName=(EditText)findViewById(R.id.editRoom);
                tv.setText("Your input: \n" + roomName.getText().toString());

            }
        });

        FloatingActionButton back = (FloatingActionButton) findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                //Aaa tenemos qeu chequear si estamos fuera de una habitación o en una habitación
                //Para saber si agregar dispositivo o habitación
                Intent intent = new Intent(AddRoom.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
