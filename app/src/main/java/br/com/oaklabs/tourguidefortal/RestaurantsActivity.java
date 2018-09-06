package br.com.oaklabs.tourguidefortal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        final ArrayList<Place> placesList = new ArrayList<Place>();

        placesList.add(new Place(getString(R.string.restaurants01), getString(R.string.restaurants01_address), R.drawable.restaurantes_cocobambu));
        placesList.add(new Place(getString(R.string.restaurants02), getString(R.string.restaurants02_address), R.drawable.restaurantes_vojnilo));
        placesList.add(new Place(getString(R.string.restaurants03), getString(R.string.restaurants03_address), R.drawable.restaurantes_tapioqueiras));

        PlaceAdapter adapter = new PlaceAdapter(this, R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
