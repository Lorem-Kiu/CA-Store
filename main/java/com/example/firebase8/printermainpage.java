package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class printermainpage extends AppCompatActivity {

    ImageButton image_canonpixma_ts207, image_brotherdcp_t520w, image_hpdeskjet_1212, image_canonpixma_g3000, image_hpdeskjet_2331;

    Button button_canonpixma_ts207, button_brotherdcp_t520w, button_hpdeskjet_1212, button_canonpixma_g3000, button_hpdeskjet_2331;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printermainpage);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Printer Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image_canonpixma_ts207 = (ImageButton) findViewById(R.id.image_canonpixma_ts207);

        button_canonpixma_ts207 = (Button) findViewById(R.id.button_canonpixma_ts207);

        image_brotherdcp_t520w = (ImageButton) findViewById(R.id.image_brotherdcp_t520w);

        button_brotherdcp_t520w = (Button) findViewById(R.id.button_brotherdcp_t520w);

        image_hpdeskjet_1212 = (ImageButton) findViewById(R.id.image_hpdeskjet_1212);

        button_hpdeskjet_1212 = (Button) findViewById(R.id.button_hpdeskjet_1212);

        image_canonpixma_g3000 = (ImageButton) findViewById(R.id.image_canonpixma_g3000);

        button_canonpixma_g3000 = (Button) findViewById(R.id.button_canonpixma_g3000);

        image_hpdeskjet_2331 = (ImageButton) findViewById(R.id.image_hpdeskjet_2331);

        button_hpdeskjet_2331 = (Button) findViewById(R.id.button_hpdeskjet_2331);

        image_canonpixma_ts207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_canonpixam_ts207.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on CANON PIXMA TS207 INKJET PRINTER", Toast.LENGTH_SHORT).show();
            }
        });

        button_canonpixma_ts207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_canonpixam_ts207.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on CANON PIXMA TS207 INKJET PRINTER", Toast.LENGTH_SHORT).show();
            }
        });

        image_brotherdcp_t520w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_brotherdcp_t520w.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on BROTHER DCP-T520W PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        button_brotherdcp_t520w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_brotherdcp_t520w.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on BROTHER DCP-T520W PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        image_hpdeskjet_1212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_hpdeskjet_1212.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on HP DESKJET 1212 PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        button_hpdeskjet_1212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_hpdeskjet_1212.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on HP DESKJET 1212 PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        image_canonpixma_g3000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_canonpixma_g3000.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on CANON PIXMA G3000 PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        button_canonpixma_g3000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_canonpixma_g3000.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on CANON PIXMA G3000 PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        image_hpdeskjet_2331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_hpdeskjet_2331.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on HP DESKJET 2331 PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });

        button_hpdeskjet_2331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printer_hpdeskjet_2331.class);
                startActivity(intent);

                Toast.makeText(printermainpage.this, "You are on HP DESKJET 2331 PRINTER page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}