package com.example.irapuatotour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
// Custom Adapter to populate the list view with an array of custom location objects
public class LocationAdapter<T> extends ArrayAdapter<Location> {

    public LocationAdapter(@NonNull Context context, ArrayList<Location> _locations) {
        super(context,0,_locations);
    }

    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview = convertView;
        if(listitemview == null){
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.location_item,parent,false);
        }
        Location currentlocation = getItem(position);
        TextView description_tv = listitemview.findViewById(R.id.description_textview);
        TextView tittle_tv = listitemview.findViewById(R.id.tittle_textview);
        tittle_tv.setText(currentlocation.getName());
        description_tv.setText(currentlocation.getDescription());
        ImageView imageView = listitemview.findViewById(R.id.imagen);
        imageView.setImageResource(currentlocation.getResource());
        imageView.setVisibility(View.VISIBLE);
        return listitemview;
    }
}
