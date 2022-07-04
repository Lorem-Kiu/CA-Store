package com.example.firebase8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.firebase8.Model.User;
import com.example.firebase8.Prevalent.Prevalent;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class login extends AppCompatActivity {
    EditText email, password;
    Button login;
    FirebaseAuth firebaseAuth;
    CheckBox checkBox;
    ProgressDialog progressDialog;

    public String parentDbName = "Users Registration Details";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Paper.init(this);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        checkBox = (CheckBox) findViewById(R.id.checkBox);

        // Remember by Paper Library


//         Remember me by Firebase Auth
        AccountManager am = AccountManager.get(this); // "this" references the current Context

        Account[] accounts = am.getAccountsByType("com.google");

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);


        sharedPreferences=getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        editor=sharedPreferences.edit();

        String mail=sharedPreferences.getString("email","No Email Stored");
        String passwords=sharedPreferences.getString("passowrd","");

        email.setText(mail);
        password.setText(passwords);

        Objects.requireNonNull(getSupportActionBar()).setTitle("LOGIN PAGE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // For Remember me
                if(checkBox.isChecked()){
                    editor.putString("email",email.getText().toString());
                    editor.putString("passowrd",password.getText().toString());
                    editor.commit();
                }else{
                    editor.putString("email","");
                    editor.putString("name","");
                    editor.putString("passowrd","");
                    editor.commit();
                }

                String loginemail = email.getText().toString();

                String loginpassword = password.getText().toString();

                if (TextUtils.isEmpty(loginemail)){
                    Toast.makeText(login.this, "Please enter email", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(loginpassword)){
                    Toast.makeText(login.this, "Please enter password", Toast.LENGTH_SHORT).show();
                }
                else {

                    progressDialog.setTitle("Validating your account");
                    progressDialog.setMessage("Please wait while we are checking the  credentials");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();

                    logincheck(loginemail, loginpassword);
                }
            }
        });
    }

    private void logincheck(String loginemail, String loginpassword) {

        final DatabaseReference Rootref;

        Rootref = FirebaseDatabase.getInstance().getReference();

        Rootref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.child(parentDbName).child(loginpassword).exists()){
                    User userData = snapshot.child(parentDbName).child(loginpassword).getValue(User.class);

                    if (userData.getEmail().equals(loginemail)){
                        if (userData.getPassword().equals(loginpassword)){
                            Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();

                            progressDialog.dismiss();

                            Intent intent = new Intent(getApplicationContext(), homemainpage.class);
                startActivity(intent);
                        }
                        else{
                            Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();

                            progressDialog.dismiss();
                        }
                    }
                }
                else{
                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();

                    progressDialog.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

//    private void logincheck(String loginemail, String loginpassword) {
//        firebaseAuth.signInWithEmailAndPassword(loginemail, loginpassword).addOnSuccessListener(login.this, new OnSuccessListener<AuthResult>() {
//            @Override
//            public void onSuccess(AuthResult authResult) {
//                Toast.makeText(login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
//
//                progressDialog.dismiss();
//                Intent intent = new Intent(getApplicationContext(), homemainpage.class);
//                intent.putExtra("email", loginemail);
//                startActivity(intent);
//            }
//
//
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//
//                progressDialog.dismiss();
//
//                Toast.makeText(login.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
}