package br.com.oaklabs.tourguidefortal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

    }

    public void BestPlacesActv(View view) {
        Intent bestPlaces = new Intent(MainActivity.this, BestPlacesActivity.class);
        startActivity(bestPlaces);
    }

    public void RestaurantsActv(View view) {
        Intent restaurants = new Intent(MainActivity.this, RestaurantsActivity.class);
        startActivity(restaurants);
    }

    public void HotelsActv(View view) {
        Intent hotels = new Intent(MainActivity.this, HotelsActivity.class);
        startActivity(hotels);
    }

    public void SocialActv(View view) {
        Intent social = new Intent(MainActivity.this, SocialActivity.class);
        startActivity(social);
    }

}
