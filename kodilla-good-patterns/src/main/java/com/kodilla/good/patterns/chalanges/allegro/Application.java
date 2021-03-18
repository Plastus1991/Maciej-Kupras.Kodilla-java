package com.kodilla.good.patterns.chalanges.allegro;

import java.util.ArrayList;

public class Application {

    public static void main(String args[]) {

        MakeProduct makeProduct = new MakeProduct();

        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(makeProduct.ProductsList());

        AllProducts allProducts = new AllProducts(productsArrayList);

        Buy buy = new Buy();
        System.out.println("Currently stock after buy: " + buy.buyProduct(allProducts.getAllProducts(), 10, "Monitor"));

    }

}
