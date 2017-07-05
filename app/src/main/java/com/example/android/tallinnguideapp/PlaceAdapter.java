package com.example.android.tallinnguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * ArrayAdapter = superclass, PlaceAdapter = subclass
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /* Resource ID for the background color for this list of places */
    private int mColorResourceId;

    // Constructor
    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID
        TextView nameOfPlaceTextView = (TextView) listItemView.findViewById(R.id.place_name_text_view);
        // set this text on the name TextView
        nameOfPlaceTextView.setText(currentPlace.getNameOfPlace());

        // Find the TextView in the list_item.xml layout with the ID
        TextView descriptionOfPlaceTextView = (TextView) listItemView.findViewById(R.id.place_description_text_view);
        // set this text on the number TextView
        descriptionOfPlaceTextView.setText(currentPlace.getDescriptionOfPlace());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            // Set the ImageView to the image resource specified in the current Place
            imageView.setImageResource(currentPlace.getImageResourceId());
            // Make the imageView visible (if there was a item which didn't have an image and the imageView had been hidden)
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
