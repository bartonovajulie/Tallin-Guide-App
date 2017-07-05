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

        places.add(new com.example.android.tallinnguideapp.Place("Freedom Square", "This open area at the edge of Old Town is a place of national symbolism and civic pride.", R.drawable.freedom_square));
        places.add(new com.example.android.tallinnguideapp.Place("Charles XI Lutheran Church", "Tallinn\'s grandest 19th-century church sets itself apart with its twin steeples, immense size and neo-Roman style.", R.drawable.kaarli_church));
        places.add(new com.example.android.tallinnguideapp.Place("St. John\'s Church", "The bright yellow, neo-Gothic church that dominates Freedom Square is a true survivor among the city\'s churches.", R.drawable.john_church));
        places.add(new com.example.android.tallinnguideapp.Place("Kiek in de Kök", "This massive, 38m-high cannon tower houses an extensive museum of the town\'s fortifications, weapons and medieval-era life.", R.drawable.kiek_kok));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_city_centre);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}