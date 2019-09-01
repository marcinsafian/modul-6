package com.kodilla.good.patterns.shop;

import java.time.LocalDate;

public class BicycleOrderRepository implements ProductOrderRepository {
    @Override
    public boolean createProductOrder(User user, LocalDate localDate, Product product, int quantity) {
        return true;
    }
}
