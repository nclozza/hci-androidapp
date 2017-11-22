package com.example.tomas.android_app;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
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

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private static int lastI = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Create the adapter that will return a fragment for each of the two
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);

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
                //Where 0 is FAVORITOS and 1 is HABITACIONES

                if (currentTab == 1) {
                    lastI = 1;
                    Intent intent = new Intent(MainActivity.this, AddRoom.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                } else if (currentTab == 0){
                    Intent intent = new Intent(MainActivity.this, SelectRoomToDisplay.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });

        //RoomsAPI.getAllRooms(this);
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);

        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                //do stuff
                return true;
            case R.id.action_routines:
                Intent intent2 = new Intent(MainActivity.this, Routines.class);
                startActivity(intent2);
                return true;
            case R.id.action_notification:
                Intent intent3 = new Intent(MainActivity.this, Notifications.class);
                startActivity(intent3);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Tab1Fav tab1 = new Tab1Fav();
                    return tab1;
                case 1:
                    Tab2Room tab2 = new Tab2Room();
                    return tab2;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
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
}
