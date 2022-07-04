package com.example.firebase8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class laptop_asus extends AppCompatActivity implements PaymentResultListener {
    ViewPager viewPager;

    TextView productname, modelname, color, screensize, harddisk, ram, brand, operatingsystem, price, warranty, processortype, manufacturer;

    Button addToCart, buyNow;

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_asus);

        Objects.requireNonNull(getSupportActionBar()).setTitle("ASUS CHROMEBOOK CELERON DUAL CORE LAPTOP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progressDialog = new ProgressDialog(this);

        productname = (TextView) findViewById(R.id.productname);
        modelname = (TextView) findViewById(R.id.modelname);
        color = (TextView) findViewById(R.id.color);
        screensize = (TextView) findViewById(R.id.screensize);
        harddisk = (TextView) findViewById(R.id.harddisk);
        ram = (TextView) findViewById(R.id.ram);
        brand = (TextView) findViewById(R.id.brand);
        price = (TextView) findViewById(R.id.price);
        warranty = (TextView) findViewById(R.id.warranty);
        operatingsystem = (TextView) findViewById(R.id.operatingsystem);
        processortype = (TextView) findViewById(R.id.processortype);
        manufacturer = (TextView) findViewById(R.id.manufacturer);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.lp_asus_1);
        imageList.add(R.drawable.lp_asus_2);
        imageList.add(R.drawable.lp_asus_3);
        imageList.add(R.drawable.lp_asus_4);

        MyAdapter myAdapter = new MyAdapter(imageList);

        viewPager.setAdapter(myAdapter);

        addToCart = (Button) findViewById(R.id.addtocard);
        buyNow = (Button) findViewById(R.id.buynow);

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addingToCartList();
            }
        });
    }
    private void addingToCartList() {
        Calendar calForDate = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat currentDate = new SimpleDateFormat("MMM dd, yyyy");

        String saveCurrentDate = currentDate.format(calForDate.getTime());

        @SuppressLint("SimpleDateFormat") SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm:ss a");

        String saveCurrentTime = currentTime.format(calForDate.getTime());

        DatabaseReference cartListRef = FirebaseDatabase.getInstance().getReference().child("Cart List");

        final HashMap<String, Object> cartMap  = new HashMap<>();
        cartMap.put("product Name", productname.getText().toString());
        cartMap.put("model Name", modelname.getText().toString());
        cartMap.put("color", color.getText().toString());
        cartMap.put("screen size", screensize.getText().toString());
        cartMap.put("hard disk", harddisk.getText().toString());
        cartMap.put("brand", brand.getText().toString());
        cartMap.put("date", saveCurrentDate);
        cartMap.put("time", saveCurrentTime);
        cartMap.put("price", price.getText().toString());
        cartMap.put("warranty", warranty.getText().toString());
        cartMap.put("ram", ram.getText().toString());
        cartMap.put("operating system", operatingsystem.getText().toString());
        cartMap.put("processor type", processortype.getText().toString());
        cartMap.put("manufacturer", manufacturer.getText().toString());

        cartListRef.child("User Cart LAPTOP Cart List").child("ASUS CHROMEBOOK CELERON DUAL CORE LAPTOPP").updateChildren(cartMap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(laptop_asus.this, "Added to cart", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(laptop_asus.this, "An Error Occurred", Toast.LENGTH_SHORT).show();
                }
            }
        });



        // RazorPay Payment

        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paymentNow("19990");

                progressDialog.setTitle("Redirecting to RazorPay");
                progressDialog.setMessage("Please wait while we are redirecting you to RazorPay Payment Gateway");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();

                Toast.makeText(laptop_asus.this, "You are now on RazorPay Payment Gateway", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void paymentNow(String amount) {

        final Activity activity = this;

        Checkout checkout = new Checkout();

        checkout.setKeyID("rzp_live_X7P9CbJCDbSFo1");
        checkout.setImage(R.drawable.lp_asus_1);

        double finalAmount = Float.parseFloat(amount) * 100;

        try {


            JSONObject options = new JSONObject();

            options.put("name", "AMOL RATHOD");

            options.put("description", "Reference No. #123456");

            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png");

//                options.put("order_id", "order_DBJOWzybf0sJbb");//from response of step 3.

            options.put("theme.color", "#3399cc");

            options.put("currency", "INR");

            options.put("amount", finalAmount + " ");//pass amount in currency subunits

            options.put("prefill.email", "makerofking18@gmail.com");

            options.put("prefill.contact","9657383030");

            JSONObject retryObj = new JSONObject();

            retryObj.put("enabled", true);

            retryObj.put("max_count", 4);

            options.put("retry", retryObj);

            checkout.open(activity, options);



        } catch(Exception e) {
            Log.e("TAG", "Error in starting RazorPay");
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, "Payment Successful \nPayment ID : " + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {

        Toast.makeText(this, "Payment failed due to : " + s, Toast.LENGTH_SHORT).show();

        progressDialog.dismiss();

    }
}