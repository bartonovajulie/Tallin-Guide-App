package com.example.android.tallinnguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class KadriorgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        final ArrayList<com.example.android.tallinnguideapp.Place> places = new ArrayList<com.example.android.tallinnguideapp.Place>();

        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.kardiorg_museum), getString(R.string.kardiorg_museum_description), R.drawable.kadriorg_museum));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.kardiorg_park), getString(R.string.kardiorg_park_description), R.drawable.kadriorg_park));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.kumu_museum), getString(R.string.kumu_museum_description), R.drawable.kumu_art_museum));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.russalka), getString(R.string.russalka_description), R.drawable.russalka));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_kadriorg);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}