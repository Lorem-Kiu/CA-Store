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

public class monitormainpage extends AppCompatActivity {

    ImageButton image_appleimac, image_samsung32inch, image_lg24inch, image_samsung24inch, image_dell24;

    Button button_appleimac, button_samsung32inch, button_lg24inch, button_samsung24inch, button_dell24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitormainpage);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Monitor Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image_appleimac = (ImageButton) findViewById(R.id.image_appleimac);

        button_appleimac = (Button) findViewById(R.id.button_appleimac);

        image_samsung32inch = (ImageButton) findViewById(R.id.image_samsung32inch);

        button_samsung32inch = (Button) findViewById(R.id.button_samsung32inch);

        image_lg24inch = (ImageButton) findViewById(R.id.image_lg24inch);

        button_lg24inch = (Button) findViewById(R.id.button_lg24inch);

        image_samsung24inch = (ImageButton) findViewById(R.id.image_samsung24inch);

        button_samsung24inch = (Button) findViewById(R.id.button_samsung24inch);

        image_dell24 = (ImageButton) findViewById(R.id.image_dell24monitor);

        button_dell24 = (Button) findViewById(R.id.button_dell24monitor);


        image_appleimac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_appleimac.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on APPLE iMAC MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });

        button_appleimac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_appleimac.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on APPLE iMAC MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });


        image_samsung32inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_samsung32inch.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on SAMSUNG 32 INCHES MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });

        button_samsung32inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_samsung32inch.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on SAMSUNG 32 INCHES MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });


        image_lg24inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_lg24inch.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on LG 24 INCHES 24MP60G MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });

        button_lg24inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_lg24inch.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on LG 24 INCHES 24MP60G MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });


        image_samsung24inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_samsung24inch.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on SAMSUNG ODYSSEY 24 INCHES MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });

        button_samsung24inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_samsung24inch.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on SAMSUNG ODYSSEY 24 INCHES MONITOR page", Toast.LENGTH_SHORT).show();
            }
        });


        image_dell24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_dell24monitor.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on DELL 24 MONITOR S2421HN page", Toast.LENGTH_SHORT).show();
            }
        });

        button_dell24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitor_dell24monitor.class);
                startActivity(intent);

                Toast.makeText(monitormainpage.this, "You are on DELL 24 MONITOR S2421HN page", Toast.LENGTH_SHORT).show();
            }
        });

    }
}