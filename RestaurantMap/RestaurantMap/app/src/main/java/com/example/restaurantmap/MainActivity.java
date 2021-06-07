package com.example.restaurantmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addPlace = findViewById(R.id.addPlace);
        Button showAll = findViewById(R.id.showAll);

        addPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addPlaceIntent = new Intent(MainActivity.this, SelectMenu.class);
                startActivity(addPlaceIntent);
            }
        });

        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showAllIntent = new Intent(MainActivity.this, ShowLocation.class);
                startActivity(showAllIntent);

            }
        });

    }
}