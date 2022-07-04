package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class cpumainpage extends AppCompatActivity {

    ImageButton image_lenovoideacentre, image_kanget, image_electrobot_bolt, image_electrobot_gaming, image_applemacmini;

    Button button_lenovoideacentre, button_kanget, button_electrobot_bolt, button_electrobot_gaming, button_applemacmini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpumainpage);

        Objects.requireNonNull(getSupportActionBar()).setTitle("CPU Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image_lenovoideacentre = (ImageButton) findViewById(R.id.image_lenovoideacentre);

        button_lenovoideacentre = (Button) findViewById(R.id.button_lenovoideacentre);

        image_kanget = (ImageButton) findViewById(R.id.image_kanget);

        button_kanget = (Button) findViewById(R.id.button_kanget);

        image_electrobot_bolt = (ImageButton) findViewById(R.id.image_electrobot_bolt);

        button_electrobot_bolt = (Button) findViewById(R.id.button_electrobot_bolt);

        image_electrobot_gaming = (ImageButton) findViewById(R.id.image_electrobot_gaming);

        button_electrobot_gaming = (Button) findViewById(R.id.button_electrobot_gaming);

        image_applemacmini = (ImageButton) findViewById(R.id.image_applemacmini);

        button_applemacmini = (Button) findViewById(R.id.button_applemacmini);


        image_lenovoideacentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_lenovoideacentre.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on LENOVO IDEACENTRE 3 DESKTOP CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        button_lenovoideacentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_lenovoideacentre.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on LENOVO IDEACENTRE 3 DESKTOP CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        image_kanget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_kanget.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on KANGET ASSEMBLE DESKTOP PC CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        button_kanget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_kanget.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on KANGET ASSEMBLE DESKTOP PC CPU page", Toast.LENGTH_SHORT).show();
            }
        });


        image_electrobot_bolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_electrobot_bolt.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on ELECTROBOT BOLT GAMING PC CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        button_electrobot_bolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_electrobot_bolt.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on ELECTROBOT BOLT GAMING PC CPU page", Toast.LENGTH_SHORT).show();
            }
        });


        image_electrobot_gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_electrobot_gaming.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on ELECTROBOT GAMING TURBO PC CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        button_electrobot_gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_electrobot_gaming.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on ELECTROBOT GAMING TURBO PC CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        image_applemacmini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_applemacmini.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on APPLE MAC MINI CPU page", Toast.LENGTH_SHORT).show();
            }
        });

        button_applemacmini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpu_applemacmini.class);
                startActivity(intent);

                Toast.makeText(cpumainpage.this, "You are on APPLE MAC MINI CPU page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}