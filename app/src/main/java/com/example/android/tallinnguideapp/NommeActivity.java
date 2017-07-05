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

        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.glehn_park), getString(R.string.glehn_park_description), R.drawable.glehn_park));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.glehn_castle), getString(R.string.glehn_castle_description), R.drawable.glehn_castle));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.glehn_cemetry), getString(R.string.glehn_cemetry_description), R.drawable.glehn_cemetry));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.nomme_market), getString(R.string.nomme_market_description), R.drawable.nomme_market));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_nomme);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}