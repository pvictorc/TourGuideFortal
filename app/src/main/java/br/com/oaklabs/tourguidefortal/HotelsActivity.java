package br.com.oaklabs.tourguidefortal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        final ArrayList<Place> placesList = new ArrayList<Place>();

        placesList.add(new Place(getString(R.string.hotels01), getString(R.string.hotels01_address), R.drawable.hoteis_vilagale));
        placesList.add(new Place(getString(R.string.hotels02), getString(R.string.hotels02_address), R.drawable.hoteis_marinapark));

        PlaceAdapter adapter = new PlaceAdapter(this, R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
