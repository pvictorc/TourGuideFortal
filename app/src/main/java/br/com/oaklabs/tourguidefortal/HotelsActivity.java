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

        placesList.add(new Place("Vila Galé", "Av. Dioguinho, 4189 - Praia do Futuro, Fortaleza - CE, 60183-707", R.drawable.hoteis_vilagale));
        placesList.add(new Place("Marina Park Hotel", "Av. Presidente Castelo Branco, 400 - Moura Brasil, Fortaleza - CE, 60312-060", R.drawable.hoteis_marinapark));

        PlaceAdapter adapter = new PlaceAdapter(this,R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
