package com.example.firebase8;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv1);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);

        Objects.requireNonNull(getSupportActionBar()).setTitle("CA STORE");
        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#45B8AC"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);

        // Go to Registration page
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), register.class);
                startActivity(intent);

                startActivity(new Intent(getApplicationContext(), register.class));

                Toast.makeText(MainActivity.this, "You are now on Registration Page", Toast.LENGTH_SHORT).show();
            }
        });


        // Go to login page
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "You are now on Login Page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}