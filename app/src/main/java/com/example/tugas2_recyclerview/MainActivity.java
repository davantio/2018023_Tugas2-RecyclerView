package com.example.tugas2_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kuliner = (Button)findViewById(R.id.btn_linear);

        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Kuliner.class);
                startActivity(a);
            }
        });

        Button hotel = (Button)findViewById(R.id.btn_staggered);

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, Hotel.class);
                startActivity(b);
            }
        });

        Button wisata = (Button)findViewById(R.id.btn_grid);

        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, Wisata.class);
                startActivity(c);
            }
        });
    }
}