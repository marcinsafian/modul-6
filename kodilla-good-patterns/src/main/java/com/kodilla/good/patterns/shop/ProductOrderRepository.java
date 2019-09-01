package com.kodilla.good.patterns.shop;

import java.time.LocalDate;

public interface ProductOrderRepository {
    boolean createProductOrder(User user, LocalDate localDate, Product product, int quantity);
}
