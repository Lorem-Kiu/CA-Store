package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        getSupportActionBar().setTitle("WISHLIST PAGE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}