package com.example.tugas2_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder>{
    ArrayList images;
    Context context;

    public HotelAdapter(Context context, ArrayList images){
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public HotelAdapter.HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel, parent, false);

        HotelAdapter.HotelViewHolder viewHolder = new HotelAdapter.HotelViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.HotelViewHolder holder, int position) {
        int res = (int) images.get(position);
        holder.images.setImageResource(res);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageView images;

        public HotelViewHolder(View view) {
            super(view);
            images = (ImageView) view.findViewById(R.id.imageView);
        }
    }
}
