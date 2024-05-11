package com.example.groceryapp;

//This class will contain attributes of the item_layout file. or it will act as a model class for recycler view.

public class Item
{
    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int imageView;
  private String title;
  private String description;

    public Item(int imageView, String title, String description) {
        this.imageView = imageView;
        this.title = title;
        this.description = description;
    }





}
