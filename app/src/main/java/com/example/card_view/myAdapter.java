package com.example.card_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<Myholder> {
    Context context;
    ArrayList<model> models;

    public myAdapter(Context context, ArrayList<model> models) {

        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.name.setText(models.get(position).getName());
        holder.seat.setText(models.get(position).getSeat());


    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
