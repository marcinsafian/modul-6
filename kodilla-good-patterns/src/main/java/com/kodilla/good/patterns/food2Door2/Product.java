package com.kodilla.good.patterns.food2Door2;

public class Product {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int volume) {
        this.quantity = quantity-volume;
    }

    @Override
    public String toString() {
        return "Product " + productName +
                ", quantity " + quantity;
    }
}
