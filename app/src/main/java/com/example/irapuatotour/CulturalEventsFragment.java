package com.example.irapuatotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class CulturalEventsFragment extends Fragment {

    public CulturalEventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the listview we are going to poulate
        // create an array of custom location objects to pass to the adapter
        // then set the adapter to the listview
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.cultural_location_name_1),getString(R.string.cultural_location_description_1), R.drawable.casadecultura));
        locations.add(new Location(getString(R.string.cultural_location_name_2),getString(R.string.cultural_location_description_2), R.drawable.fuentedanzarinas04));
        locations.add(new Location(getString(R.string.cultural_location_name_3),getString(R.string.cultural_location_description_3), R.drawable.fundadores));
        locations.add(new Location(getString(R.string.cultural_location_name_4),getString(R.string.cultural_location_description_4), R.drawable.museo));
        locations.add(new Location(getString(R.string.cultural_location_name_5),getString(R.string.cultural_location_description_5), R.drawable.temploconvento02));
        locations.add(new Location(getString(R.string.cultural_location_name_6),getString(R.string.cultural_location_description_6), R.drawable.templosanjose02));
        locations.add(new Location(getString(R.string.cultural_location_name_7),getString(R.string.cultural_location_description_7), R.drawable.temploterceraorden022));
        locations.add(new Location(getString(R.string.cultural_location_name_8),getString(R.string.cultural_location_description_8), R.drawable.galeria_van_gogh));
        locations.add(new Location(getString(R.string.cultural_location_name_9),getString(R.string.cultural_location_description_9), R.drawable.palaciomunicipal01));
        locations.add(new Location(getString(R.string.cultural_location_name_10),getString(R.string.cultural_location_description_10 ), R.drawable.peralta01));
        final LocationAdapter<Location> itemsAdapter = new LocationAdapter<Location>(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
