package com.kodilla.good.patterns.food2Door2;

public class Processor {

    private IsSold saleInformation;
    private ProducersRepository registerProducers;

    public Processor(IsSold saleInformation, ProducersRepository registerProducers) {
        this.saleInformation = saleInformation;
        this.registerProducers = registerProducers;
    }

    public ProducerOrder getProducerOfProduct(Product product) {
        return registerProducers.getSuperProduct(product);
    }

    public void process(Order order) {

        registerProducers.showProduct();
        boolean isAvailable = registerProducers.isAvailableProduct(order.getProduct(), order.getVolume());
        getProducerOfProduct(order.getProduct()).process(order.getProduct(), order.getVolume());
        saleInformation.information(order, isAvailable);
        if (!isAvailable) {
            System.out.println("We have big trouble");
        }
    }
}
