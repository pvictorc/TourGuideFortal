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

        placesList.add(new Place(getString(R.string.social01), getString(R.string.social01_address), R.drawable.social_piratabar));
        placesList.add(new Place(getString(R.string.social02), getString(R.string.social02_address), R.drawable.social_crocobeach));

        PlaceAdapter adapter = new PlaceAdapter(this, R.layout.list_item, placesList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
