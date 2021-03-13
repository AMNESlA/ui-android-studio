package com.example.nike.model;

public class BestSeller {

    private String name;
    private String imageurl;
    private String rating;
    private String price;

    public BestSeller(String name, String imageurl, String rating, String price) {
        this.name = name;
        this.imageurl = imageurl;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
