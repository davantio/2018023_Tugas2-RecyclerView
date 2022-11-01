package com.example.tugas2_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class Wisata extends AppCompatActivity {

    RecyclerView recyclerViewG;

    ArrayList images = new ArrayList<>(Arrays.asList(R.drawable.atlantis, R.drawable.ciputrawaterpark, R.drawable.kbs,
            R.drawable.november, R.drawable.sampoerna, R.drawable.tamankenjeran, R.drawable.tugu));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        recyclerViewG= (RecyclerView) findViewById(R.id.recyclerViewGrid);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewG.setLayoutManager(gridLayoutManager);

        WisataAdapter adapter = new WisataAdapter(Wisata.this, images);

        recyclerViewG.setAdapter(adapter);
    }
}