package com.example.tomas.android_app;

/**
 * Created by tomas on 15/11/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab2Room extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2room, container, false);

        int room = 1;

        switch (room) {
            case 1: Button button1 = (Button) rootView.findViewById(R.id.button1);
                    button1.setText("roomName");
                    button1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), RoomActivity.class);
                            startActivity(intent);
                        }
                    });
                    break;

            case 2: Button button2 = (Button) rootView.findViewById(R.id.button2);
                button2.setText("roomName");
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;


            case 3: Button button3 = (Button) rootView.findViewById(R.id.button3);
                button3.setText("roomName");
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;


            case 4: Button button4 = (Button) rootView.findViewById(R.id.button4);
                button4.setText("roomName");
                button4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 5: Button button5 = (Button) rootView.findViewById(R.id.button5);
                button5.setText("roomName");
                button5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;
            case 6: Button button6 = (Button) rootView.findViewById(R.id.button6);
                button6.setText("roomName");
                button6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 7: Button button7 = (Button) rootView.findViewById(R.id.button7);
                button7.setText("roomName");
                button7.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 8: Button button8 = (Button) rootView.findViewById(R.id.button8);
                button8.setText("roomName");
                button8.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 9: Button button9 = (Button) rootView.findViewById(R.id.button9);
                button9.setText("roomName");
                button9.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 10: Button button10 = (Button) rootView.findViewById(R.id.button10);
                button10.setText("roomName");
                button10.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 11: Button button11 = (Button) rootView.findViewById(R.id.button11);
                button11.setText("roomName");
                button11.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 12: Button button12 = (Button) rootView.findViewById(R.id.button12);
                button12.setText("roomName");
                button12.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 13: Button button13 = (Button) rootView.findViewById(R.id.button13);
                button13.setText("roomName");
                button13.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;

            case 14: Button button14 = (Button) rootView.findViewById(R.id.button14);
                button14.setText("roomName");
                button14.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                    }
                });
                break;
        }

        return rootView;
    }



}