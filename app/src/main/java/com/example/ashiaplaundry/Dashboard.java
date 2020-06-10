package com.example.ashiaplaundry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {
    CardView pc,ct,st,mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        pc = findViewById(R.id.pickup);
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,Pickup.class);
                startActivity(log);
            }
        });
        ct = findViewById(R.id.contact);
        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,Contact.class);
                startActivity(log);
            }
        });
        st = findViewById(R.id.status);
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,Status.class);
                startActivity(log);
            }
        });
        mp = findViewById(R.id.maps);
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(Dashboard.this ,MapsActivity.class);
                startActivity(log);
            }
        });
    }
}
