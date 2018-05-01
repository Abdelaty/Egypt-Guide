package com.example.abdel.egyptguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter {
    PlacesAdapter(Context context, ArrayList<Images> lists) {
        super(context, 0, lists);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }
        Images currentArtist = (Images) getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView);
        // Get the Place Name
        // set this text on the name TextView
        assert currentArtist != null;
        nameTextView.setText(currentArtist.getmPlacesName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // Get the image resource ID
        // set the image to imageView
        imageView.getDrawable();


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


