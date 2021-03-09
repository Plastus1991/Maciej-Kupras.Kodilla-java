package com.kodilla.good.patterns.challenges;

public class Application  {

    public static void main(String args[]) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ProductRequest productRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new Mail(), new ItemOrderService(), new ItemOrderRepository());
        productOrderService.process(productRequest);
    }
}
