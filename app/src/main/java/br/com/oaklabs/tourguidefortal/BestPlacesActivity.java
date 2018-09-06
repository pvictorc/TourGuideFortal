package br.com.oaklabs.tourguidefortal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class BestPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_places);


        final ArrayList<Place> placesList = new ArrayList<Place>();

        placesList.add(new Place(getString(R.string.places01), getString(R.string.places01_address), R.drawable.lugares_beachpark));
        placesList.add(new Place(getString(R.string.places02), getString(R.string.places02_address), R.drawable.lugares_dragaodomar));
        placesList.add(new Place(getString(R.string.places03), getString(R.string.places03_address), R.drawable.lugares_praiadeiracema));
        placesList.add(new Place(getString(R.string.places04), getString(R.string.places04_address), R.drawable.lugares_praiadofuturo));

        PlaceAdapter adapter = new PlaceAdapter(this, R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
