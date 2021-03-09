package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public Product product;
    public boolean isAvailable;

    public OrderDto(Product product, boolean isAvailable) {
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
