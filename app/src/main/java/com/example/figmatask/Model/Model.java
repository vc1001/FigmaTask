package com.example.figmatask.Model;

public class Model {

   private int image;
    private String name,flavour,price;

    public Model(int image, String name, String flavour, String price) {
        this.image = image;
        this.name = name;
        this.flavour = flavour;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

