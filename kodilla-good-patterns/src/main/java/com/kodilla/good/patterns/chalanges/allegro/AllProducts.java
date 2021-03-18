package com.kodilla.good.patterns.chalanges.allegro;

import java.util.ArrayList;

public class AllProducts {

    private ArrayList<Products> allProducts;


    public AllProducts(ArrayList<Products> allProducts) {
        this.allProducts = allProducts;
    }


    public ArrayList<Products> getAllProducts() {
        return allProducts;
    }

    @Override
    public String toString() {
        return "AllProducts{" +
                "allProducts=" + allProducts +
                '}';
    }
}
