package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class laptopmainpage extends AppCompatActivity {

    ImageButton image_applemacbookair, image_dellinspiron_3501, image_dell15, image_asus, image_hp14s;

    Button button_applemacbookair, button_dellinspiron_3501, button_dell15, button_asus, button_hp14s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptopmainpage);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Laptop Pages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image_applemacbookair = (ImageButton) findViewById(R.id.image_applemacbookair);

        button_applemacbookair = (Button) findViewById(R.id.button_applemacbookair);

        image_dellinspiron_3501 = (ImageButton) findViewById(R.id.image_dellinspiron_3501);

        button_dellinspiron_3501 = (Button) findViewById(R.id.button_dellinspiron_3501);

        image_dell15 = (ImageButton) findViewById(R.id.image_dell15);

        button_dell15 = (Button) findViewById(R.id.button_dell15);

        image_asus = (ImageButton) findViewById(R.id.image_asus);

        button_asus = (Button) findViewById(R.id.button_asus);

        image_hp14s = (ImageButton) findViewById(R.id.image_hp14s);

        button_hp14s = (Button) findViewById(R.id.button_hp14s);


        image_applemacbookair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_applemackbookair.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on APPLE MACBOOK AIR LAPTOP page", Toast.LENGTH_SHORT).show();
            }
        });

        button_applemacbookair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_applemackbookair.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on APPLE MACBOOK AIR LAPTOP page", Toast.LENGTH_SHORT).show();
            }
        });


        image_dellinspiron_3501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_dellinspiron_3501.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on DELL INSPIRON 3501 INTEL i-3 1005G1 page", Toast.LENGTH_SHORT).show();
            }
        });

        button_dellinspiron_3501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_dellinspiron_3501.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on DELL INSPIRON 3501 INTEL i-3 1005G1 page", Toast.LENGTH_SHORT).show();
            }
        });


        image_dell15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_dell15.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on DELL 15 i-5 1135G7 page", Toast.LENGTH_SHORT).show();
            }
        });

        button_dell15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_dell15.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on DELL 15 i-5 1135G7 page", Toast.LENGTH_SHORT).show();
            }
        });


        image_asus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_asus.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on ASUS CHROMEBOOK CELERON DUAL CORE page", Toast.LENGTH_SHORT).show();
            }
        });

        button_asus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_asus.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on ASUS CHROMEBOOK CELERON DUAL CORE page", Toast.LENGTH_SHORT).show();
            }
        });

        image_hp14s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_hp14s.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on HP 14S 11TH GEN INTEL CORE i-3", Toast.LENGTH_SHORT).show();
            }
        });

        button_hp14s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptop_hp14s.class);
                startActivity(intent);

                Toast.makeText(laptopmainpage.this, "You are on HP 14S 11TH GEN INTEL CORE i-3", Toast.LENGTH_SHORT).show();
            }
        });
    }
}