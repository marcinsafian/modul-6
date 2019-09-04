package com.kodilla.good.patterns.food2Door;

public class Appi {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processAllOrders(new OrderRetriever().collect());
    }
}
