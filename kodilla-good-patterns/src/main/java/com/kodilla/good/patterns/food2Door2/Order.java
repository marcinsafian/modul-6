package com.kodilla.good.patterns.food2Door2;

public class Order {
    private User user;
    private Product product;
    private int volume;

    public Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.volume = volume;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getVolume() {
        return volume;
    }
}
