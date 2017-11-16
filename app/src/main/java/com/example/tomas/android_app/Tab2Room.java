package com.example.tomas.android_app;

/**
 * Created by tomas on 15/11/2017.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

public class Tab2Room extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2room, container, false);
        return rootView;
    }
}