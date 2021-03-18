package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    public List orderProduct(ArrayList<Product> productList, String nameProduct, int quantity) {

       List<Product> listTMP = productList.stream()
                .filter(e -> e.getName().equals(nameProduct))
                .collect(Collectors.toList());

       int stock = listTMP.get(0).getQuantity();
       Product productTMP = listTMP.get(0);
       ExtraFoodShop extraFoodShop = new ExtraFoodShop();

       if(stock >= quantity) {
           productTMP.setQuantity(productTMP.getQuantity() - quantity);
           double cost = quantity * productTMP.getPrice();
           extraFoodShop.process(cost);

       } else {
           System.out.println("Don't have enough");
       }

       return productList;

    }
}
