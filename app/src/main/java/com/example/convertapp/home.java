package com.example.convertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {
ImageButton jarak  ,uang, suhuu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        jarak = findViewById(R.id.jarak);
        jarak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, Distance.class);
                startActivity(i);
            }
        });

        suhuu = findViewById(R.id.suhuu);
        suhuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, Temperature.class);
                startActivity(i);
            }
        });

        uang = findViewById(R.id.uang);
        uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, Money.class);
                startActivity(i);
            }
        });
    }
}