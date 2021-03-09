package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService,
                               OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(ProductRequest productRequest) {
        boolean isOrdered = orderService.order(productRequest.getProduct());

        if(isOrdered) {
            informationService.inform(productRequest.getProduct());
            orderRepository.createOrder(productRequest.getProduct());
            return new OrderDto(productRequest.getProduct(), true);
        } else {
            return new OrderDto(productRequest.getProduct(), false);
        }
    }


}
