package com.example.firebase8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Objects;

public class Profilepage extends AppCompatActivity {
    TextView name, age, mobile, address, district, pincode;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);

        Objects.requireNonNull(getSupportActionBar()).setTitle("PROFILE PAGE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = (TextView) findViewById(R.id.name);
        age = (TextView) findViewById(R.id.age);
        mobile = (TextView) findViewById(R.id.mobile);
        address = (TextView) findViewById(R.id.address);
        district = (TextView) findViewById(R.id.district);
        pincode = (TextView) findViewById(R.id.pincode);
    }
}