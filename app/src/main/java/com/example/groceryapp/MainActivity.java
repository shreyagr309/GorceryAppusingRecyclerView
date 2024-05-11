package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    RecyclerView recyclerView;

    List<Item> list;
    CustomAdapterRecyclerView customAdapterRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        list=new ArrayList<>();//polymorphism?

        Item item1=new Item(R.drawable.beverage,"Beverage","Please select beverages");
        Item item2=new Item(R.drawable.bread,"Bread","Please select Bread");
        Item item3=new Item(R.drawable.fruit,"Fruits","Please select Fruits");
        Item item4=new Item(R.drawable.milk,"Milk","Please select Milk");
        Item item5=new Item(R.drawable.popcorn,"Popcorn","Please select Popcorns");
        Item item6=new Item(R.drawable.vegitables,"Vegetables","Please select vegetables");


        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        customAdapterRecyclerView=new CustomAdapterRecyclerView(list);
        recyclerView.setAdapter(customAdapterRecyclerView);



    }


}