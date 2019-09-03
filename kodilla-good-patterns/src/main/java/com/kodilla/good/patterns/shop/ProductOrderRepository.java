package com.kodilla.good.patterns.shop;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean createProductOrder(User user, LocalDateTime localDate, Product product, int quantity);
}
