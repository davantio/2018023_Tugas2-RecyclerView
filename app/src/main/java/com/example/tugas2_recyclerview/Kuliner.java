package com.example.tugas2_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Kuliner extends AppCompatActivity {
    RecyclerView recyclerViewL;
    String s1[], s2[],s3[];
    int images[] = {R.drawable.pecel,R.drawable.rawon,R.drawable.rujak,R.drawable.tahutek,R.drawable.ltg_balap,R.drawable.ltg_kupang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        recyclerViewL = findViewById(R.id.recyclerViewLinear);

        s1 = getResources().getStringArray(R.array.kuliner);
        s2 = getResources().getStringArray(R.array.harga);
        s3 = getResources().getStringArray(R.array.rating);
        KulinerAdapter appAdapter = new KulinerAdapter(this,s1,s2,s3,images);
        recyclerViewL.setAdapter(appAdapter);
        recyclerViewL.setLayoutManager(new
                LinearLayoutManager(this));
    }
}