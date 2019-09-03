package com.kodilla.good.patterns.shop;

import java.time.LocalDateTime;

public class BicycleOrderService implements ProductOrderService {
    @Override
    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return true;
    }
}
