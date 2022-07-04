package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class keyboardmainpage extends AppCompatActivity {

    Button button_cosmicbyte, button_logitechk480, button_redgearshadow, button_hpk500f, button_zebronic;
    ImageButton image_cosmicbyte, image_logitechk480, image_redgearshadow, image_hpk500f, image_zebronic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboardmainpage);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Keyboard Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button_cosmicbyte = (Button) findViewById(R.id.button_cosmicbyte);

        image_cosmicbyte = (ImageButton) findViewById(R.id.image_cosmicbyte);

        button_logitechk480 = (Button) findViewById(R.id.button_logitechk480);

        image_logitechk480 = (ImageButton) findViewById(R.id.image_logitechk480);

        button_redgearshadow = (Button) findViewById(R.id.button_redgearshadow);

        image_redgearshadow = (ImageButton) findViewById(R.id.image_redgearshadow);

        button_hpk500f = (Button) findViewById(R.id.button_hpk500f);

        image_hpk500f = (ImageButton) findViewById(R.id.image_hpk500f);

        button_zebronic = (Button) findViewById(R.id.button_zebronic);

        image_zebronic = (ImageButton) findViewById(R.id.image_zebronic);


        button_cosmicbyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_cosmicbyte.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on COSMIC BYTE KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });

        image_cosmicbyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_cosmicbyte.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on COSMIC BYTE KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });
        
        button_logitechk480.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_logitech_k480.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on LOGITECH K480 WIRELESS KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });

        image_logitechk480.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_logitech_k480.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on LOGITECH K480 WIRELESS KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });
        
        button_redgearshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_redgearshadow.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on REDGEAR SHADOW BLADE MECHANICAL KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });

        image_redgearshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_redgearshadow.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on REDGEAR SHADOW BLADE MECHANICAL KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });
        
        button_hpk500f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_hp_k500f.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on HP K500F WIRED GAMING KEYBOARD", Toast.LENGTH_SHORT).show();
            }
        });

        image_hpk500f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_hp_k500f.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on HP K500F WIRED GAMING KEYBOARD", Toast.LENGTH_SHORT).show();
            }
        });

        button_zebronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_zebronic.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on ZEBRONIC ZEB-KM2100 USB KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });

        image_zebronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboard_zebronic.class);
                startActivity(intent);

                Toast.makeText(keyboardmainpage.this, "You are on ZEBRONIC ZEB-KM2100 USB KEYBOARD page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}