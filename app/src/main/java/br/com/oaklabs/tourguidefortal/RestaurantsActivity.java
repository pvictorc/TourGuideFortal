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

        placesList.add(new Place("Coco Bambu", "Av. Beira Mar, 3698", R.drawable.restaurantes_cocobambu));
        placesList.add(new Place("Vojnilô", "R. Frederico Borges, 409 - Varjota", R.drawable.restaurantes_vojnilo));
        placesList.add(new Place("Centro das Tapioqueiras", "Av. Washington Soares, 10215 (Messejana)", R.drawable.restaurantes_tapioqueiras));

        PlaceAdapter adapter = new PlaceAdapter(this,R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
