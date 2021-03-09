package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public ProductRequest retrieve() {
        Product product = new Product("Product1", 10);

        return new ProductRequest(product);
    }
}
