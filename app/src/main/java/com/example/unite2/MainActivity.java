package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Uyg2Goster(View view) {
            Intent i = new Intent(MainActivity.this, Uyg2.class);
            startActivity (i);
    }

    public void goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg5.class);
        startActivity (i);
    }

    public void uyg6Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg6_2.class);
        startActivity (i);
    }

    public void uyg8Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg8.class);
        startActivity (i);
    }

    public void uyg9Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg9.class);
        startActivity (i);
    }

    public void uyg10Goster(View view) {
        Intent i = new Intent(MainActivity.this, uyg10.class);
        startActivity (i);
    }
}