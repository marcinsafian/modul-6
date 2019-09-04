package com.kodilla.good.patterns.food2Door;

import java.util.*;

public class GlutenFreeShop implements FoodProducer {
    private Map<Product,Integer> productList;
    private List poisonList;

    public GlutenFreeShop(){
        productList = createProductList();
        poisonList = createPoisonList();
    }
    private Map<Product, Integer> createProductList(){
        Map<Product, Integer> productList = new HashMap<>();
        productList.put(new GlutenFreeProduct("bread", "Bread made from coconut flour"), 50);
        productList.put(new GlutenFreeProduct("rice", "extraordinary white rice"), 150);
        productList.put(new GlutenFreeProduct("cookies", "amaranth cookies with dactyls"), 20);
        productList.put(new GlutenFreeProduct("coconut flour", "finely ground coconut flour"), 4);

        return productList;
    }
    private List<Customer> createPoisonList(){
        List<Customer> poisonList = new ArrayList<>();
        poisonList.add(new Customer("Micky Mouse"));

        return poisonList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (!poisonList.contains(customer) && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productOrders) {
        for (Map.Entry<Product, Integer> entry : productOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Gluten Free Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}
