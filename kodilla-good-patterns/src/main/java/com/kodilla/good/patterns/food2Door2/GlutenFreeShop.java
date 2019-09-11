package com.kodilla.good.patterns.food2Door2;

public class GlutenFreeShop implements ProducerOrder{
    private String name;

    public GlutenFreeShop(String name) {
        this.name = name;
    }
    @Override
    public void process(Product product, int volume) {
        System.out.print("\nYour order " + product.getProductName() + " is collecting");
    }

    @Override
    public String toString() {
        return "\nShop Name: " + name;
    }
}
