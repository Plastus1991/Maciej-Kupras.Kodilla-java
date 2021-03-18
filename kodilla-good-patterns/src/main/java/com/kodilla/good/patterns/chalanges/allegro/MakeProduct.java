package com.kodilla.good.patterns.chalanges.allegro;

import java.util.ArrayList;

public class MakeProduct {

    public Products ProductsList() {

        Product product1 = new Product("SmartPhone", 20, 30);
        Product product2 = new Product("Monitor", 10, 30);
        Product product3 = new Product("Computer", 1, 3500);

        ArrayList<Product> Electronics = new ArrayList<>();

        Electronics.add(product1);
        Electronics.add(product2);
        Electronics.add(product3);

        Product product4 = new Product("ToothBrush", 12, 25);
        Product product5 = new Product("Soap", 12, 25);
        Product product6 = new Product("Shampoo", 12, 25);

        ArrayList<Product> HealthAndBeauty = new ArrayList<>();
        HealthAndBeauty.add(product4);
        HealthAndBeauty.add(product5);
        HealthAndBeauty.add(product6);

        Products products = new Products(Electronics, HealthAndBeauty);

        return products;

    }



}

