package com.example.groceryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterRecyclerView extends RecyclerView.Adapter<CustomAdapterRecyclerView.ViewHolder>
{

    private List<Item> itemList;

    public CustomAdapterRecyclerView(List<Item> itemList) {
        this.itemList = itemList;
    }



    @NonNull

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Responsible for creating new view holders for your items.
        //Inflate the layout in this method

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);


        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        // Binds the data from the dataset to the views within the viewholder

        Item item= itemList.get(position);

        holder.imageView.setImageResource(item.getImageView());
        holder.desc.setText(item.getDescription());
        holder.title.setText((item.getTitle()));


    }

    @Override
    public int getItemCount() {
        //Returns the total number of items in your dataset.
        return itemList.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder
    {
        TextView desc,title;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            desc=itemView.findViewById(R.id.description);
            title=itemView.findViewById(R.id.title);
            imageView=itemView.findViewById(R.id.imageView);
        }



    }

}
