package com.kodilla.good.patterns.shop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestCollector {
    public ProductOrderRequest collect(){
        User user = new User("Someone123","Jaś","Kowalski");
        LocalDateTime orderDate = LocalDateTime.of(2019,12,03,12,45);
        Product product = new Product("MTB","Super fajny rower",new BigDecimal("1000"));
        int quantity = 1;

        System.out.println("... product request:");
        System.out.println("User: " + user.getUserName() +
                " Date: " + orderDate + "\n" +
                product + ", quantity=" + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}
