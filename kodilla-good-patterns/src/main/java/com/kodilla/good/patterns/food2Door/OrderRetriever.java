package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> collect(){
     List<OrderRequest> orderRequestList = new ArrayList<>();

     Customer customer = new Customer("Jaś Fasola");
     FoodProducer foodProducer = new HealthyShop();
        sth(orderRequestList, customer, foodProducer);

        Customer customer1 = new Customer("Mickey");
        FoodProducer foodProducer1 = new GlutenFreeShop();
        sth(orderRequestList, customer1, foodProducer1);


        return orderRequestList;
    }

    private void sth(List<OrderRequest> orderRequestList, Customer customer, FoodProducer foodProducer) {
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 2);
        productList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 3);
        productList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 1);

        orderRequestList.add(new OrderRequest(customer,foodProducer,productList));
    }
}
