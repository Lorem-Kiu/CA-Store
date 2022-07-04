package com.example.firebase8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.firebase8.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class homemainpage extends AppCompatActivity {

    ImageButton keyboard, mouse, laptop, printer, cpu, monitor;

    ActivityMainBinding activityMainBinding;

    BottomNavigationView bottomNavigationView;

    AlertDialog.Builder alertBuilder;


    @SuppressLint({"CutPasteId", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        setContentView(R.layout.activity_homemainpage);
//        replaceFramgment(new HomeFragment());

//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

//        bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            switch (item.getItemId()){
//                case R.id.homenav:
//                    replaceFramgment(new HomeFragment());
//
//                    break;
//
//                case R.id.wishlistnav:
//                    replaceFramgment(new WishlistFragment());
//
//                    Intent intent = new Intent(getApplicationContext(), Wishlist.class);
//                    startActivity(intent);
//
//                    break;
//
//                case R.id.myaccountnav:
//                    replaceFramgment(new ProfileFragment());
//
//                    Intent intent1 = new Intent(getApplicationContext(), Profilepage.class);
//                    startActivity(intent1);
//
//                    break;
//
//            }
//
//            return true;
//        });

        Objects.requireNonNull(getSupportActionBar()).setTitle("HOME PAGE");


        keyboard = (ImageButton) findViewById(R.id.keyboardimg);
        mouse = (ImageButton) findViewById(R.id.mouseImg);
        laptop = (ImageButton) findViewById(R.id.laptopimg);
        printer = (ImageButton) findViewById(R.id.printerimg);
        cpu = (ImageButton) findViewById(R.id.cpuimg);
        monitor = (ImageButton) findViewById(R.id.monitorimg);


        keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), keyboardmainpage.class);
                startActivity(intent);
            }
        });

        mouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mousemainpage.class);
                startActivity(intent);
            }
        });

        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), laptopmainpage.class);
                startActivity(intent);
            }
        });

        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), monitormainpage.class);
                startActivity(intent);
            }
        });

        cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cpumainpage.class);
                startActivity(intent);
            }
        });

        printer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), printermainpage.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.logout_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.logout:

                alertBuilder = new AlertDialog.Builder(homemainpage.this);

                alertBuilder.setTitle("CA STORE");

                alertBuilder.setMessage("Do you want to close the application ?");

                alertBuilder.setCancelable(false);

                alertBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);

                        Toast.makeText(homemainpage.this, "You are LOGGED OUT now", Toast.LENGTH_SHORT).show();

                    }
                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(homemainpage.this, "You are still on the application", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();


        }

        return super.onOptionsItemSelected(item);
    }
}

//    private void replaceFramgment(Fragment Fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
////        fragmentTransaction.replace(R.id.framlayout, Fragment);
//        fragmentTransaction.commit();
//
//    }


