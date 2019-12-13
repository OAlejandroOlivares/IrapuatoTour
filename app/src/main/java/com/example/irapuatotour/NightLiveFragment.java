package com.example.irapuatotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightLiveFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the listview we are going to poulate
        // create an array of custom location objects to pass to the adapter
        // then set the adapter to the listview
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.nightlive_location_tittle_1),getString(R.string.nightlive_location_description_1), R.drawable.am));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_2),getString(R.string.nightlive_location_description_2), R.drawable.dirtymartini));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_3),getString(R.string.nightlive_location_description_3), R.drawable.distrike));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_4),getString(R.string.nightlive_location_description_4), R.drawable.kilkee));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_5),getString(R.string.nightlive_location_description_5), R.drawable.mi_che_bar));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_6),getString(R.string.nightlive_location_description_6), R.drawable.mojitos));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_7),getString(R.string.nightlive_location_description_7), R.drawable.mosquito));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_8),getString(R.string.nightlive_location_description_8), R.drawable.ohiggins));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_9),getString(R.string.nightlive_location_description_9), R.drawable.penthouse));
        locations.add(new Location(getString(R.string.nightlive_location_tittle_10),getString(R.string.nightlive_location_description_10 ), R.drawable.social));
        final LocationAdapter<Location> itemsAdapter = new LocationAdapter<Location>(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
