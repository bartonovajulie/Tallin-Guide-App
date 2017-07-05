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

        places.add(new com.example.android.tallinnguideapp.Place("Kadriorg Art Museum", "This grand, baroque palace built for Peter the Great in 1718 now houses the Art Museum of Estonia's foreign collection.", R.drawable.kadriorg_museum));
        places.add(new com.example.android.tallinnguideapp.Place("Kadriorg Park", "This vast park surrounding Kadriorg Palace is without a doubt the best place in town for relaxed strolling.", R.drawable.kadriorg_park));
        places.add(new com.example.android.tallinnguideapp.Place("Kumu Art Museum", "By far the nation's largest and most cutting-edge art museum.", R.drawable.kumu_art_museum));
        places.add(new com.example.android.tallinnguideapp.Place("Russalka", "This striking monument on Kadriorg’s shore is a memorial to those lost when armoured ship Russalka sank in 1893.", R.drawable.russalka));

        // set background
        com.example.android.tallinnguideapp.PlaceAdapter adapter =
                new com.example.android.tallinnguideapp.PlaceAdapter(this, places, R.color.category_kadriorg);

        // find list view
        ListView listView = (ListView) findViewById(R.id.list);

        // set adapter on the list view
        listView.setAdapter(adapter);
    }

}