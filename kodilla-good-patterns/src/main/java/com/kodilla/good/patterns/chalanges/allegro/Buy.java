package com.kodilla.good.patterns.chalanges.allegro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Buy {

    public List<Products> buyProduct(ArrayList<Products> product, int quantity, String productName) {

        List<Product> product3 = product.stream()
                .flatMap(e -> e.getElectronics().stream())
                .filter(f -> f.getProductName().equals(productName))
                .collect(Collectors.toList());

        Product product2 = product3.get(0);
        int stock = product3.get(0).getQuantity();

        if (stock >= quantity) {
            product2.setQuantity(product2.getQuantity() - quantity);
        } else {
            System.out.println("We only have " + stock + " in stock");
        }

        return product;


    }
}
