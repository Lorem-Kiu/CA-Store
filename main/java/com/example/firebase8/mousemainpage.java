package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Objects;

public class mousemainpage extends AppCompatActivity {
    Button button1, button_dellms116, button_dellvm126, button_lenovo530, button_logitechm337;
    ImageButton imageButton1, image_dellms116, image_dellvm126, image_lenovo530, image_logitechm337;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mousemainpage);
        
        button1 = (Button) findViewById(R.id.detail1);

        imageButton1 = (ImageButton) findViewById(R.id.mouse1);

        image_dellms116 = (ImageButton) findViewById(R.id.image_dellms116);

        button_dellms116 = (Button) findViewById(R.id.button_dellms116);

        button_dellvm126 = (Button) findViewById(R.id.button_dellvm126);

        image_dellvm126 = (ImageButton) findViewById(R.id.image_dellvm126);

        button_lenovo530 = (Button) findViewById(R.id.button_lenovo530);

        image_lenovo530 = (ImageButton) findViewById(R.id.image_lenovo530);

        button_logitechm337 = (Button) findViewById(R.id.button_logitechm337);

        image_logitechm337 = (ImageButton) findViewById(R.id.image_logitechm337);


        Objects.requireNonNull(getSupportActionBar()).setTitle("Mouse Page");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_hpx1000opticalmouse.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on HP X1000 Optical mouse details page", Toast.LENGTH_SHORT).show();
            }
        });
        

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_hpx1000opticalmouse.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on HP X1000 Optical mouse details page", Toast.LENGTH_SHORT).show();
            }
        });
        
        button_dellms116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_dellms116.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on DELL MS116 1000DPI USB WIRED OPTICAL MOUSE page", Toast.LENGTH_SHORT).show();
            }
        });

        image_dellms116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_dellms116.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on DELL MS116 1000DPI USB WIRED OPTICAL MOUSE page", Toast.LENGTH_SHORT).show();
            }
        });

        image_dellvm126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_dellvm126.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on DELL WM126 USB Optical LED 3-Button Wireless Mouse page", Toast.LENGTH_SHORT).show();
            }
        });

        button_dellvm126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_dellvm126.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on DELL WM126 USB Optical LED 3-Button Wireless Mouse page", Toast.LENGTH_SHORT).show();

            }
        });

        image_lenovo530.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_lenovo530mouse.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on LENOVO 530 WIRELESS MOUSE page", Toast.LENGTH_SHORT).show();
            }
        });

        button_lenovo530.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_lenovo530mouse.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on LENOVO 530 WIRELESS MOUSE page", Toast.LENGTH_SHORT).show();
            }
        });

        image_logitechm337.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_logitechm337mouse.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on LOGITECH M337 OPTICAL WIRELESS MOUSE PAGE", Toast.LENGTH_SHORT).show();
            }
        });

        button_logitechm337.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), details_logitechm337mouse.class);
                startActivity(intent);

                Toast.makeText(mousemainpage.this, "You are on LOGITECH M337 OPTICAL WIRELESS MOUSE PAGE", Toast.LENGTH_SHORT).show();
            }
        });

    }
}