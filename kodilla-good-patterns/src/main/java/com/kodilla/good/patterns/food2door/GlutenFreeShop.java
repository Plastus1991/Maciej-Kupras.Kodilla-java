package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class GlutenFreeShop implements Process {

    private int ID = 3;
    private ArrayList<Product> ProductsList = new ArrayList<>();



    public void addProduct(Product product) {
        ProductsList.add(product);
    }

    @Override
    public boolean process() {
        CreateProduct createProduct = new CreateProduct();
        if(createProduct.create() > 0) {
            return true;

        } else {
            return false;
        }

    }
}
