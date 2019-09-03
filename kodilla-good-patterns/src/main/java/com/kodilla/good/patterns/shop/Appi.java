package com.kodilla.good.patterns.shop;

public class Appi {
    public static void main(String[] args) {
        ProductOrderRequestCollector productOrderRequestCollector = new ProductOrderRequestCollector();
        ProductOrderRequest productOrderRequest = productOrderRequestCollector.collect();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new BicycleOrderService(), new BicycleOrderRepository());
        productOrderProcessor.execute(productOrderRequest);
    }
}
