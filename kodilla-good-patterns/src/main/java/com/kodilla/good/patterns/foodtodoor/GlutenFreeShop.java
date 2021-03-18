package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;

public class GlutenFreeShop implements Process {


    private ArrayList<Product> glutenFree = new ArrayList<>();
    private int id = 73743;

    public int getId() {
        return id;
    }

    public ArrayList<Product> getGlutenFree() {
        return glutenFree;
    }

    public void addProduct(Product product) {
        glutenFree.add(product);
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "glutenFree=" + glutenFree +
                ", id=" + id +
                '}';
    }

    @Override
    public void process(double pay) {
        System.out.println("You have to pay for it  " + pay);
    }
}
