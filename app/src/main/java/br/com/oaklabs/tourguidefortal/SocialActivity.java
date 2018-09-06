package br.com.oaklabs.tourguidefortal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        final ArrayList<Place> placesList = new ArrayList<Place>();

        placesList.add(new Place("Pirata Bar", "Rua dos Tabajaras, 325 - Praia de Iracema, Fortaleza - CE, 60060-510", R.drawable.social_piratabar));
        placesList.add(new Place("Barraca Crocobeach", "Av. Clóvis Arrais Maia, 3115 - Praia do Futuro, Fortaleza - CE, 60183-694", R.drawable.social_crocobeach));

        PlaceAdapter adapter = new PlaceAdapter(this,R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
