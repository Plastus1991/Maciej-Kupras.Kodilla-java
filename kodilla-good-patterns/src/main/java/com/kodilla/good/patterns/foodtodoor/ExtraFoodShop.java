package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;

public class ExtraFoodShop implements Process {

    private ArrayList<Product> extraFood = new ArrayList<>();
    private int id = 1234;

    public ArrayList<Product> getExtraFood() {
        return extraFood;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "extraFood=" + extraFood +
                ", id=" + id +
                '}';
    }

    public void addProduct(Product product) {
        extraFood.add(product);
    }

    @Override
    public void process(double pay) {
        System.out.println("You have to pay for it  " + pay );
    }
}
