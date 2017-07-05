package com.example.android.tallinnguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class NommeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        final ArrayList<com.example.android.tallinnguideapp.Place> places = new ArrayList<com.example.android.tallinnguideapp.Place>();

        places.add(new com.example.android.tallinnguideapp.Place("Glehn Park", "The park around Glehn\'s Castle in the Nõmme suburb is popular for walking, star gazing and winter skiing.", R.drawable.glehn_park));
        places.add(new com.example.android.tallinnguideapp.Place("Glehn\'s Castle", "Built by Nikolai von Glehn in 1886 and set a forested park, this castle provides a perfect escape from city centre bustle.", R.drawable.glehn_castle));
        places.add(new com.example.android.tallinnguideapp.Place("Glehn\'s Cemetery", "Find this family cemetery on the former estate of Nikolai von Glehn.", R.drawable.glehn_cemetry));
        places.add(new com.example.android.tallinnguideapp.Place("Nõmme Market", "Nõmme Market is a colourful market bulging with domestic products.", R.drawable.nomme_market));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_nomme);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}