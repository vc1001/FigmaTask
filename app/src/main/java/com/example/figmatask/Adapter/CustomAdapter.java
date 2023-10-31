package com.example.figmatask.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.figmatask.Model.Model;
import com.example.figmatask.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewholder>{

    List<Model> modelList;

    Context context;

    public CustomAdapter(List<Model> modelList) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
       ;
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Model model = modelList.get(position);

        holder.image.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.flavour.setText(model.getFlavour());
        holder.price.setText(model.getPrice());


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class viewholder extends RecyclerView.ViewHolder {

        TextView name;
        TextView flavour;
        TextView price;
        ImageView image;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            this.name = name;
            this.flavour = flavour;
            this.price = price;
            this.image = image;

            name = itemView.findViewById(R.id.name);
            flavour = itemView.findViewById(R.id.flavour);
            price = itemView.findViewById(R.id.price);
            image = itemView.findViewById(R.id.image);

        }
    }
    }

