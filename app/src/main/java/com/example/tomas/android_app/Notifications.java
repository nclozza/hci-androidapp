package com.example.tomas.android_app;

import android.content.SharedPreferences;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Notifications extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noti);
        final CheckBox ch = findViewById(R.id.checkBox);
        final CheckBox ch2 = findViewById(R.id.checkBox2);
        final CheckBox ch3 = findViewById(R.id.checkBox3);
        final CheckBox ch4 = findViewById(R.id.checkBox4);

        final SharedPreferences mSettings = getApplication().getSharedPreferences("notifications", 0);
        String blindsNotification = mSettings.getString("blindsNotifications", null);
        String doorNotification = mSettings.getString("doorNotifications", null);
        String lampNotification = mSettings.getString("lampNotifications", null);
        String timerNotification = mSettings.getString("timerNotifications", null);

        ch.setChecked(doorNotification.equals("true"));
        ch2.setChecked(lampNotification.equals("true"));
        ch3.setChecked(blindsNotification.equals("true"));
        ch4.setChecked(timerNotification.equals("true"));

        final SharedPreferences.Editor editor = mSettings.edit();

        ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch.isChecked()) {
                    editor.putString("doorNotifications", "true");
                    editor.apply();

                } else {
                    editor.putString("doorNotifications", "false");
                    editor.apply();
                }
            }
        });

        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch2.isChecked()) {
                    editor.putString("lampNotifications", "true");
                    editor.apply();

                } else {
                    editor.putString("lampNotifications", "false");
                    editor.apply();
                }
            }
        });

        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch3.isChecked()) {
                    editor.putString("blindsNotifications", "true");
                    editor.apply();

                } else {
                    editor.putString("blindsNotifications", "false");
                    editor.apply();
                }
            }
        });

        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch4.isChecked()) {
                    editor.putString("timerNotifications", "true");
                    editor.apply();

                } else {
                    editor.putString("timerNotifications", "false");
                    editor.apply();
                }
            }
        });

    }


}
