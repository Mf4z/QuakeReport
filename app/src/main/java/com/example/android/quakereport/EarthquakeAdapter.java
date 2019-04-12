package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter <Earthquake>{

    public EarthquakeAdapter(Context context, List<Earthquake> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Earthquake curQuake = getItem(position);

        TextView magCol = listItemView.findViewById(R.id.tv_magnitude);
        magCol.setText(curQuake.getmMagnitude());

        TextView locCol = listItemView.findViewById(R.id.tv_location);
        locCol.setText(curQuake.getmLocation());

        TextView locDate = listItemView.findViewById(R.id.tv_date);
        locDate.setText(curQuake.getmDate());



        return listItemView;
    }
}
