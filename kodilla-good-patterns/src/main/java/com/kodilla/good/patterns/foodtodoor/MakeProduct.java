package com.kodilla.good.patterns.foodtodoor;

public class MakeProduct {

    public void makeProducts() {

        Product product = new Product("Product1", 12, 33);
        Product product1 = new Product("Product2", 5, 22);
        Product product2 = new Product("Product3", 555, 12);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        extraFoodShop.addProduct(product);
        healthyShop.addProduct(product1);
        glutenFreeShop.addProduct(product2);

        System.out.println(extraFoodShop.getExtraFood());

        Order order = new Order();

        System.out.println(order.orderProduct(extraFoodShop.getExtraFood(), "Product1", 10));

    }
}
