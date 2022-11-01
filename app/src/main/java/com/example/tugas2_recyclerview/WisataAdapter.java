package com.example.tugas2_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder>{
    ArrayList images;
    Context context;

    public WisataAdapter(Context context, ArrayList images){
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wisata, parent, false);

        WisataAdapter.WisataViewHolder viewHolder = new WisataAdapter.WisataViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.WisataViewHolder holder, int position) {
        int res = (int) images.get(position);
        holder.images.setImageResource(res);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        ImageView images;

        public WisataViewHolder(View view) {
            super(view);
            images = (ImageView) view.findViewById(R.id.imageView);
        }
    }
}
