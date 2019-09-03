package com.kodilla.good.patterns.food2Door;

public class MeatProduct extends Product {
    private String meatQuality;

    public MeatProduct(String productName, String meatQuality){
        super(productName);
        this.meatQuality = meatQuality;
    }
}
