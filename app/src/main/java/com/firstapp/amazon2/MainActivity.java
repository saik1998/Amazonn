package com.firstapp.amazon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView amazon,notification,serach,profile;

    TextView text1,text2,text3,text4,text5;

    Button b1,b2,b3,b4,btnreturn,btncreate,btnyourorder,btnyouradd,btntop,btnmanage;
    Button btnamazon,btnview,btnvisit;

    ImageView imag1,imag2,imag3,imag4,imag5,imag6;
    TextView textView1,textView2,textView3,textView4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.following);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Follow this page ", Toast.LENGTH_SHORT).show();
            }
        });
        textView2=findViewById(R.id.who);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Who are following the page  ", Toast.LENGTH_SHORT).show();
            }
        });
        textView3=findViewById(R.id.seeeditfraeme);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "see Edit the Page ", Toast.LENGTH_SHORT).show();
            }
        });

        imag1=findViewById(R.id.smartphones);
        imag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "order to mobiles", Toast.LENGTH_SHORT).show();
            }
        });
        imag2=findViewById(R.id.bookcases);
        imag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "order to bookcases", Toast.LENGTH_SHORT).show();
            }
        });
        imag3=findViewById(R.id.jewelerrers);
        imag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "order to jewelerrers", Toast.LENGTH_SHORT).show();
            }
        });
        imag4=findViewById(R.id.makeup);
        imag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "order to makeupKit", Toast.LENGTH_SHORT).show();
            }
        });
        imag5=findViewById(R.id.sofas);
        imag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "order to sofas", Toast.LENGTH_SHORT).show();
            }
        });
        imag6=findViewById(R.id.swings);
        imag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "order to swings & Charis", Toast.LENGTH_SHORT).show();
            }
        });


        amazon=findViewById(R.id.amazon);
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to Amazon", Toast.LENGTH_SHORT).show();

            }
        });
        notification=findViewById(R.id.notification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "see all the notifications", Toast.LENGTH_SHORT).show();

            }
        });
        serach=findViewById(R.id.search);
        serach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "search here", Toast.LENGTH_SHORT).show();

            }
        });
        profile=findViewById(R.id.contact);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "see profile", Toast.LENGTH_SHORT).show();

            }
        });

        text1=findViewById(R.id.yourorders);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "select your orders", Toast.LENGTH_SHORT).show();
            }
        });
        text2=findViewById(R.id.yourwishlist);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "your collection list", Toast.LENGTH_SHORT).show();

            }
        });
        text3=findViewById(R.id.youraccounts);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "your account", Toast.LENGTH_SHORT).show();

            }
        });
        text4=findViewById(R.id.buyagain);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Buy Again", Toast.LENGTH_SHORT).show();

            }
        });
        text5=findViewById(R.id.seeall);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "see all the list", Toast.LENGTH_SHORT).show();

            }
        });


        b1=findViewById(R.id.Yourorder);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "select your orders", Toast.LENGTH_SHORT).show();

            }
        });
        b2=findViewById(R.id.Buyagain);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thank you visit again", Toast.LENGTH_SHORT).show();

            }
        });
        b3=findViewById(R.id.Youraccount);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "see once your account", Toast.LENGTH_SHORT).show();

            }
        });
        b4=findViewById(R.id.Yourwish);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "your collection list", Toast.LENGTH_SHORT).show();

            }
        });

        btnreturn=findViewById(R.id.Returnhomepage);
        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "see Homepage", Toast.LENGTH_SHORT).show();

            }
        });
        btncreate=findViewById(R.id.Createlist);
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Create your own List", Toast.LENGTH_SHORT).show();

            }
        });
        btnyourorder=findViewById(R.id.YourOrders);
        btnyourorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your Collections", Toast.LENGTH_SHORT).show();

            }
        });
        btnyouradd=findViewById(R.id.Youraddresses);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your Loaction", Toast.LENGTH_SHORT).show();

            }
        });
        btntop=findViewById(R.id.Topup);
        btntop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Top up your balance", Toast.LENGTH_SHORT).show();

            }
        });
        btnmanage=findViewById(R.id.Manage);
        btnmanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Manage yoyr Profile", Toast.LENGTH_SHORT).show();

            }
        });
        btnamazon=findViewById(R.id.AmazonPay);
        btnamazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "AmazonPay", Toast.LENGTH_SHORT).show();

            }
        });
        btnview=findViewById(R.id.Viewamazon);
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "View Amazon Pay Balance", Toast.LENGTH_SHORT).show();

            }
        });
        btnvisit=findViewById(R.id.visit);
        btnvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thank You Visit Again", Toast.LENGTH_SHORT).show();

            }
        });










    }
}