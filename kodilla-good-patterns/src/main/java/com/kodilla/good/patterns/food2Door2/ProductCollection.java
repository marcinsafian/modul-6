package com.kodilla.good.patterns.food2Door2;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> productList = new ArrayList<>();
    public boolean addProduct (Product product){
        if(productList.contains(product)) {
            System.out.println("Product is ordered");
            return false;
        }
            productList.add(product);
            return true;
    }
    public List<Product> getProductList(){
        return productList;
    }
}

