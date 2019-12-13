package com.example.irapuatotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the listview we are going to poulate
        // create an array of custom location objects to pass to the adapter
        // then set the adapter to the listview
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.food_location_tittle_1),getString(R.string.food_location_description_1), R.drawable.alas_brasas));
        locations.add(new Location(getString(R.string.food_location_tittle_2),getString(R.string.food_location_description_2), R.drawable.argentino));
        locations.add(new Location(getString(R.string.food_location_tittle_3),getString(R.string.food_location_description_3), R.drawable.comicx));
        locations.add(new Location(getString(R.string.food_location_tittle_4),getString(R.string.food_location_description_4), R.drawable.flamin_wings));
        locations.add(new Location(getString(R.string.food_location_tittle_5),getString(R.string.food_location_description_5), R.drawable.oasis));
        locations.add(new Location(getString(R.string.food_location_tittle_6),getString(R.string.food_location_description_6), R.drawable.pepes));
        locations.add(new Location(getString(R.string.food_location_tittle_7),getString(R.string.food_location_description_7), R.drawable.rock_burger));
        locations.add(new Location(getString(R.string.food_location_tittle_8),getString(R.string.food_location_description_8), R.drawable.sabor_cafe));
        locations.add(new Location(getString(R.string.food_location_tittle_9),getString(R.string.food_location_description_9), R.drawable.sonora_grill));
        locations.add(new Location(getString(R.string.food_location_tittle_10),getString(R.string.food_location_description_10), R.drawable.gianni));
        final LocationAdapter<Location> itemsAdapter = new LocationAdapter<Location>(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
