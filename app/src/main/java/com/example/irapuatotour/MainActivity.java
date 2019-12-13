package com.example.irapuatotour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        // create a page adapter with our custom class
        PagerAdapter pagerAdapter = new MyTabsAdapter(getSupportFragmentManager(),this);
        // set adapter to the viewpager
        viewPager.setAdapter(pagerAdapter);
        TabLayout tabs  = findViewById(R.id.tab_bar);
        //set the tab layout to the viewpager
        tabs.setupWithViewPager(viewPager);
    }
}
