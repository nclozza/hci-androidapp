package com.example.tomas.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by tomas on 17/11/2017.
 */

public class Notifications extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noti);
        final CheckBox ch = findViewById(R.id.checkBox);
        final CheckBox ch2= findViewById(R.id.checkBox2);
        final CheckBox ch3 = findViewById(R.id.checkBox3);
        final CheckBox ch4 = findViewById(R.id.checkBox4);
        final CheckBox ch5 = findViewById(R.id.checkBox5);

        ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch.isChecked())
                    Log.i("LA PRIMERA", "OK");
                else
                    Log.i("LA PRIMERA", "NO OK");
            }
        });

        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch.isChecked())
                    Log.i("LA SEGUNDA", "OK");
                else
                    Log.i("LA SEGUNDA", "NO OK");
            }
        });

        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch.isChecked())
                    Log.i("LA TERCERA", "OK");
                else
                    Log.i("LA TERCERA", "NO OK");
            }
        });

        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch.isChecked())
                    Log.i("LA CUARTA", "OK");
                else
                    Log.i("LA CUARTA", "NO OK");
            }
        });

        ch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch.isChecked())
                    Log.i("LA QUINTA", "OK");
                else
                    Log.i("LA QUINTA", "NO OK");
            }
        });

    }


}
