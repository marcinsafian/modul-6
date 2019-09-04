package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements FoodProducer {
    private Map<Product,Integer> productList;

    public HealthyShop() {
        productList = createProductList();
    }

        private Map<Product, Integer> createProductList () {
            Map<Product, Integer> productList = new HashMap<>();
            productList.put(new GlutenFreeProduct("pasta", "Noodles made from rice flour"), 25);
            productList.put(new GlutenFreeProduct("corn crisps", "Crisps made from corn flour"), 15);
            productList.put(new GrainProduct("spaghetti pasta", true), 20);
            productList.put(new GrainProduct("spelt flour", true), 4);

            return productList;
    }
    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() >= 2 && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Healthy Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}
