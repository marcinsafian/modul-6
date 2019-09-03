package com.kodilla.good.patterns.shop;


import java.time.LocalDateTime;
import java.util.Random;

public class BicycleOrderRepository implements ProductOrderRepository {
    @Override
    public boolean createProductOrder(User user, LocalDateTime localDate, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}
