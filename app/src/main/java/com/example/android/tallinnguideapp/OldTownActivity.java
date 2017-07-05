package com.example.android.tallinnguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class OldTownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        final ArrayList<com.example.android.tallinnguideapp.Place> places = new ArrayList<com.example.android.tallinnguideapp.Place>();

        places.add(new com.example.android.tallinnguideapp.Place("Tallinn Town Hall", "Nothing says power like the impressive, Gothic Town Hall that dominates medieval Tallinn\'s main square.", R.drawable.town_hall));
        places.add(new com.example.android.tallinnguideapp.Place("St. Catherine\'s Passage", "Easily the most picturesque of Old Town\'s lanes, this half-hidden walkway runs behind what used to be St. Catherine's Church.", R.drawable.passage));
        places.add(new com.example.android.tallinnguideapp.Place("Toompea Castle", "Perched on a limestone cliff and towering over the rest of the city, Toompea Castle has always been the seat of power in Estonia.", R.drawable.toompea_castle));
        places.add(new com.example.android.tallinnguideapp.Place("St. Alexander Nevsky Cathedral", "This spectacular, onion-domed structure perched atop Toompea Hill is Estonia\'s main Russian Orthodox cathedral.", R.drawable.nevsky_cathedral));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_old_town);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}