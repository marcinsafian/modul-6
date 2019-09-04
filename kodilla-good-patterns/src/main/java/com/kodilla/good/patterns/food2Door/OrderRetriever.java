package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> collect(){
     List<OrderRequest> orderRequestList = new ArrayList<>();

     Customer customer = new Customer("Jaś Fasola");
     FoodProducer foodProducer = new GlutenFreeShop();
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 2);
        productList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 3);
        productList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 1000);

        orderRequestList.add(new OrderRequest(customer,foodProducer,productList));

        Customer customer1 = new Customer("Mickey");
        FoodProducer foodProducer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 2);
        productList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 3);
        productList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 1);

        orderRequestList.add(new OrderRequest(customer1, foodProducer1, productsList1));

        return orderRequestList;
    }
}
