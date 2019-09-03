package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducer {
    private Map<Product,Integer> productList;

    public ExtraFoodShop(){
        productList = createProductList();
    }
    private Map<Product,Integer>createProductList(){
        Map<Product,Integer> productList = new HashMap<>();
        productList.put(new MeatProduct("pork chop","pork"),10);
        productList.put(new MeatProduct("knuckle","pork"),2);
        productList.put(new GrainProduct("millet",true),7);
        productList.put(new GrainProduct("oatmeal",false),0);

        return productList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrder) {
        for (Map.Entry<Product, Integer> entry : productOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}
