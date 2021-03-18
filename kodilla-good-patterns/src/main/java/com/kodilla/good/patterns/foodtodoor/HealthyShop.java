package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;

public class HealthyShop implements Process {

    private ArrayList<Product> healthyProducts = new ArrayList<>();
    private int id = 32424;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "healthyProducts=" + healthyProducts +
                ", id=" + id +
                '}';
    }

    public void addProduct(Product product) {
        healthyProducts.add(product);
    }

    public ArrayList<Product> getHealthyProducts() {
        return healthyProducts;
    }

    @Override
    public void process(double pay) {
        System.out.println("You have to pay for it  " + pay);
    }
}
