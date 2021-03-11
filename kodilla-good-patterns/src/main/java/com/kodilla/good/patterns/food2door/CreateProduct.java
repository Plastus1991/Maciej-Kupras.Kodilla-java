package com.kodilla.good.patterns.food2door;

public class CreateProduct {

    public int create() {

        Product product1 = new Product("Product1", 22);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        extraFoodShop.addProduct(product1);

        int quantity = extraFoodShop.getProductList().get(0).getQuantityOfProduct();


        return quantity;


    }
}
