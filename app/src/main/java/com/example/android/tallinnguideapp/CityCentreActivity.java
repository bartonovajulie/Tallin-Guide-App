package com.example.android.tallinnguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class CityCentreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        final ArrayList<com.example.android.tallinnguideapp.Place> places = new ArrayList<com.example.android.tallinnguideapp.Place>();

        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.freedom_square), getString(R.string.freedom_square_description), R.drawable.freedom_square));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.charles_church), getString(R.string.charles_church_description), R.drawable.kaarli_church));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.john_church), getString(R.string.john_church_description), R.drawable.john_church));
        places.add(new com.example.android.tallinnguideapp.Place(getString(R.string.kiek_kok), getString(R.string.kiek_kok), R.drawable.kiek_kok));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_city_centre);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}