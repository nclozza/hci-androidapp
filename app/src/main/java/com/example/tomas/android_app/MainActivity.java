package com.example.tomas.android_app;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("StaticFieldLeak")
    private static Context context;
    SharedPreferences getSharedPreferences;
    SharedPreferences.Editor editor;

    private static int lastI = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager mViewPager = findViewById(R.id.container);

        mViewPager.setAdapter(mSectionsPagerAdapter);
                final TabLayout tabLayout = findViewById(R.id.tabs);
        Log.i("LAST I = ", String.valueOf(lastI));

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        mViewPager.setCurrentItem(lastI);
        lastI = 0;

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentTab = tabLayout.getSelectedTabPosition();
                if (currentTab == 0) {
                    lastI = 0;
                    Intent intent = new Intent(MainActivity.this, AddRoom.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);

                } else if (currentTab == 1) {
                    lastI = 1;
                    Intent intent = new Intent(MainActivity.this, AddRoutine.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });

        getSharedPreferences = getSharedPreferences("notifications", 0);

        String doorNotifications = getSharedPreferences.getString("doorNotifications", null);
        String lampNotifications = getSharedPreferences.getString("lampNotifications", null);
        String blindsNotifications = getSharedPreferences.getString("blindsNotifications", null);
        String timerNotifications = getSharedPreferences.getString("timerNotifications", null);
        String routinesNotifications = getSharedPreferences.getString("routinesNotifications", null);

        if (doorNotifications == null || lampNotifications == null
                || blindsNotifications == null || timerNotifications == null
                    || routinesNotifications == null) {
            editor = getSharedPreferences.edit();
            editor.putString("doorNotifications", "true");
            editor.putString("lampNotifications", "true");
            editor.putString("blindsNotifications", "true");
            editor.putString("timerNotifications", "true");
            editor.putString("routinesNotifications", "true");
            editor.apply();
        }

    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        context = this;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                return true;

            case R.id.action_notification:
                Intent intent3 = new Intent(MainActivity.this, Notifications.class);
                startActivity(intent3);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Tab1Room tab1 = new Tab1Room();
                    return tab1;
                case 1:
                    Tab2Routines tab2 = new Tab2Routines();
                    return tab2;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "FAVORITES";
                case 1:
                    return "ROOMS";
            }
            return null;
        }
    }

    public static void sendNotification(String title, String text) {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                        .setContentTitle(title)
                        .setContentText(text);

        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(001, mBuilder.build());
    }
}