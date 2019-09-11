package com.kodilla.good.patterns.food2Door2;

public class ExtraFoodShop implements ProducerOrder {
    private String nameShop;


    public ExtraFoodShop(String nameShop) {
        this.nameShop = nameShop;
    }

    @Override
    public void process(Product product, int volume) {
        System.out.print("Your order " + product.getProductName() + " is collecting");
    }

    @Override
    public String toString() {
        return "\nShop Name: " + nameShop;
    }
}
