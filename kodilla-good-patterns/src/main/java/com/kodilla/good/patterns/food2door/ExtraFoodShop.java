package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class ExtraFoodShop implements Process {

   private int ID = 1;
   private ArrayList<Product> ProductList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return ProductList;
    }

    public int getID() {
        return ID;
    }

    public void addProduct(Product product) {
        ProductList.add(product);

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
