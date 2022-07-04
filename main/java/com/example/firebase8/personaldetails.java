package com.example.firebase8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Objects;

public class personaldetails extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.firebase8.MESSAGE";

    EditText name , age, mobile, address, district, pincode;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaldetails);

        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        mobile = (EditText) findViewById(R.id.mobile);
        address = (EditText) findViewById(R.id.address);
        district = (EditText) findViewById(R.id.district);
        pincode = (EditText) findViewById(R.id.pincode);
        submit = (Button) findViewById(R.id.submit);

        Objects.requireNonNull(getSupportActionBar()).setTitle("PERSONAL DETAILS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, Object> hashMap = new HashMap<String, Object>();


                hashMap.put("name", name.getText().toString());
                hashMap.put("age", age.getText().toString());
                hashMap.put("mobile", mobile.getText().toString());
                hashMap.put("address", address.getText().toString());
                hashMap.put("district", district.getText().toString());
                hashMap.put("pincode", pincode.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("Customers").push().setValue(hashMap);

                
                
                if (name.getText().toString().isEmpty()){
                    Toast.makeText(personaldetails.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else if(age.getText().toString().isEmpty()){
                    Toast.makeText(personaldetails.this, "Please enter your age", Toast.LENGTH_SHORT).show();
                }
                if (age.length() > 2){
                    Toast.makeText(personaldetails.this, "Please enter valid age", Toast.LENGTH_SHORT).show();
                }
                else if (mobile.getText().toString().isEmpty()){
                    Toast.makeText(personaldetails.this, "Please enter your mobile number", Toast.LENGTH_SHORT).show();
                }
                else if (address.getText().toString().isEmpty()){
                    Toast.makeText(personaldetails.this, "Please enter your address", Toast.LENGTH_SHORT).show();
                }
                else if (district.getText().toString().isEmpty()){
                    Toast.makeText(personaldetails.this, "Please enter your district", Toast.LENGTH_SHORT).show();
                }
                else if (pincode.getText().toString().isEmpty()){
                    Toast.makeText(personaldetails.this, "Please enter your pincode", Toast.LENGTH_SHORT).show();
                }
                else if(mobile.length() < 10 || mobile.length() > 10){
                    Toast.makeText(personaldetails.this, "Please enter a valid mobile number", Toast.LENGTH_SHORT).show();
                }
                else if (pincode.length() < 6 || pincode.length() > 6){
                    Toast.makeText(personaldetails.this, "Please enter valid pincode", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(getApplicationContext(), login.class);
                    startActivity(intent);

                    Toast.makeText(personaldetails.this, "Personal details added successfully", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}