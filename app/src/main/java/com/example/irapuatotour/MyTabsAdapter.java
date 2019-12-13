package com.example.irapuatotour;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class MyTabsAdapter extends FragmentPagerAdapter {
    private Context context;

    public MyTabsAdapter(FragmentManager fm,Context _context) {
        super(fm);
        //passgin context to we can have access to the string resources of the project
        context = _context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //set tittle to each tab from it's position
        switch (position){
            case 0:
                return context.getResources().getString(R.string.night_live_tab_tittle);
            case 1:
                return context.getResources().getString(R.string.food_tab_tittle);
            case 2:
                return context.getResources().getString(R.string.cultural_events_tab_tittle);
            case 3:
                return context.getResources().getString(R.string.shopping_tab_tittle);
            default:
                return null;
        }
    }

    @Override
    public Fragment getItem(int i) {
        //set each fragment to each viewpager tab layout
        switch (i){
            case 0:
                return new NightLiveFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new CulturalEventsFragment();
            case 3:
                return new ShoppingFragment();
            default:
                return null;
        }
    }
}
