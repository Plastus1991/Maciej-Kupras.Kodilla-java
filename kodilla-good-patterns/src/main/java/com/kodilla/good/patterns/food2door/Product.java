package com.kodilla.good.patterns.food2door;

public class Product {

    private String nameProduct;
    private int quantityOfProduct;

    public Product(String nameProduct, int quantityOfProduct) {
        this.nameProduct = nameProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
}
