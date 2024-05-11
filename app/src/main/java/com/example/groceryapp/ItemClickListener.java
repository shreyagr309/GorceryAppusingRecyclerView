package com.example.groceryapp;

import android.view.View;


//we need to implement this ItemClickListener in MyViewHolder
public interface ItemClickListener
{

    void onCLick(View v, int position);


}
