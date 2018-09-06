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

        placesList.add(new Place("Beach park", "Aquiraz, CE", R.drawable.lugares_beachpark));
        placesList.add(new Place("Dragão do Mar", "Rua Porto das Dunas, 2734 - Porto das Dunas, Aquiraz - CE, 61700-000", R.drawable.lugares_dragaodomar));
        placesList.add(new Place("Praia de Iracema", "Av. Beira Mar, Fortaleza, CE", R.drawable.lugares_praiadeiracema));
        placesList.add(new Place("Praia do Futuro", "Av, Zezé Diogo",R.drawable.lugares_praiadofuturo));

        PlaceAdapter adapter = new PlaceAdapter(this,R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
