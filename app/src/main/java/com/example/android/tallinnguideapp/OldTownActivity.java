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

        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.town_hall), getString(R.string.town_hall_description), R.drawable.town_hall));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.catherine_passage), getString(R.string.catherine_passage_description), R.drawable.passage));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.toompea_castle), getString(R.string.toompea_castle_description), R.drawable.toompea_castle));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.nevsky_cathedral), getString(R.string.nevsky_cathedral_description), R.drawable.nevsky_cathedral));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_old_town);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}