package com.example.tugas2_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;

public class Hotel extends AppCompatActivity {

    RecyclerView recyclerViewS;

    ArrayList images = new ArrayList<>(Arrays.asList(R.drawable.grand_darmo, R.drawable.pop, R.drawable.red_planet,
            R.drawable.ibis, R.drawable.favehotel, R.drawable.swiss_bellin, R.drawable.prime_royal, R.drawable.heritage,
            R.drawable.santika, R.drawable.yellohotel));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        recyclerViewS = (RecyclerView) findViewById(R.id.recyclerViewStaggered);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerViewS.setLayoutManager(staggeredGridLayoutManager);

        HotelAdapter adapter = new HotelAdapter(Hotel.this, images);

        recyclerViewS.setAdapter(adapter);
    }
}