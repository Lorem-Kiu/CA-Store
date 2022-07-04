package com.example.firebase8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;

public class register extends AppCompatActivity {
    EditText email, password;
    Button register;
    private FirebaseAuth firebaseAuth;

    private ProgressDialog progressDialog;

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[@#$%^&+=])" +     // at least 1 special character
                    "(?=\\S+$)" +            // no white spaces
                    ".{8,}" +                // at least 8 characters
                    "$");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        register = (Button) findViewById(R.id.register);
        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);

        Objects.requireNonNull(getSupportActionBar()).setTitle("REGISTRATION PAGE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccount();
            }
        });


    }

    private void CreateAccount() {
        String registeremail = email.getText().toString();
        String registerpassword = password.getText().toString();

        if (TextUtils.isEmpty(registeremail)) {
            Toast.makeText(register.this, "Please enter the email id and password", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(registerpassword)) {
            Toast.makeText(register.this, "Please enter the password", Toast.LENGTH_SHORT).show();
        } else if (!PASSWORD_PATTERN.matcher(registerpassword).matches()) {
            Toast.makeText(register.this, "Password contains at least 8 characters including 1 special character and no white spaces allowed", Toast.LENGTH_SHORT).show();
        } else {
            progressDialog.setTitle("Creating Account");
            progressDialog.setMessage("Please wait while we are checking the information");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            Validateemail(registeremail, registerpassword);

        }
    }

    private void Validateemail(String registeremail, String registerpassword) {
        final DatabaseReference Rootref;

        Rootref = FirebaseDatabase.getInstance().getReference();

        Rootref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (!(snapshot.child("Users Registration Details").child(registerpassword).exists())) {

                    HashMap<String, Object> userdataMap = new HashMap<>();

                    userdataMap.put("email", registeremail);
                    userdataMap.put("password", registerpassword);

                    Rootref.child("Users Registration Details").child(registerpassword).updateChildren(userdataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {

                                progressDialog.dismiss();

                                Toast.makeText(register.this, "Registration Successful", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(getApplicationContext(), personaldetails.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(register.this, "An error occurred...", Toast.LENGTH_SHORT).show();

                                progressDialog.dismiss();
                            }
                        }
                    });
                } else {
                    Toast.makeText(register.this, "This email id is already exists !! Please try again with another email", Toast.LENGTH_SHORT).show();

                    progressDialog.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}


//    private void regis(String registeremail, String registerpassword) {
//        firebaseAuth.createUserWithEmailAndPassword(registeremail, registerpassword).addOnCompleteListener(register.this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()){
//
//                    Intent intent = new Intent(getApplicationContext(), personaldetails.class);
//                    startActivity(intent);
//
//                    progressDialog.dismiss();
//
//                    Toast.makeText(register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
//
//
//                }
//                else{
//
//                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                    startActivity(intent);
//
//                    progressDialog.dismiss();
//
//                    Toast.makeText(register.this, "Registration Failed !! This " + registeremail + " email address already exists", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });





