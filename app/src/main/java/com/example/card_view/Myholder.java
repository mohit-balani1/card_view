package com.example.card_view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myholder extends RecyclerView.ViewHolder {


    TextView name,seat;
    public Myholder(@NonNull View itemView) {
        super(itemView);

        this.name = itemView.findViewById(R.id.Name);
        this.seat = itemView.findViewById(R.id.Cost);
    }
}
