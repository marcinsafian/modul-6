package com.kodilla.good.patterns.shop;

import java.time.LocalDateTime;

public class ProductOrderDTO {
    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;
    private boolean isSold;

    public ProductOrderDTO(User user, LocalDateTime orderDate, Product product, int quantity, boolean isSold) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}
