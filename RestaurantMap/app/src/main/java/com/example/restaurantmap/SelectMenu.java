package com.example.restaurantmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectMenu extends AppCompatActivity {
    TextView placeName;
    TextView mapLocation;
    Button mapShow;
    Button getCurrentLocation;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);

        placeName = findViewById(R.id.PlaceName);
        mapLocation = findViewById(R.id.MapLocation);
        mapShow = findViewById(R.id.mapShow);
        getCurrentLocation = findViewById(R.id.getCurrentLocation);
        saveButton = findViewById(R.id.saveButton);

        mapShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showOnMap = new Intent(SelectMenu.this, ShowLocation.class);
                startActivity(showOnMap);
            }
        });

        getCurrentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placeSearchIntent = new Intent(SelectMenu.this, PlaceSearch.class);
                startActivity(placeSearchIntent);
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}