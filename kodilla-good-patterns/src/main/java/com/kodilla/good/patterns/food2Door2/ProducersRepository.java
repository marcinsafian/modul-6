package com.kodilla.good.patterns.food2Door2;

import java.util.HashMap;
import java.util.Map;

public class ProducersRepository {
    Map<ProducerOrder,ProductCollection> registerProducers = new HashMap<>();

    public void addProducer(ProducerOrder producerOrder, ProductCollection productCollection){
        registerProducers.put(producerOrder, productCollection);
    }
    public void showProduct(){
        for (Map.Entry<ProducerOrder, ProductCollection> c: registerProducers.entrySet()){
            System.out.println(c.getKey());
            for (Product currentProduct : c.getValue().getProductList()){
                if (currentProduct.getQuantity()>0);
                System.out.println(currentProduct.toString());
            }
        }
    }
    public boolean isAvailableProduct(Product product, int volume){
        for (Map.Entry<ProducerOrder, ProductCollection> c: registerProducers.entrySet()){
            for (Product currentProduct : c.getValue().getProductList()){
                if (currentProduct.equals(product) && currentProduct.getQuantity() > volume){
                    product.setQuantity(volume);
                    return true;
                };
            }
        }
        return false;
    }
    public ProducerOrder getSuperProduct(Product product){
        for (Map.Entry<ProducerOrder, ProductCollection> c: registerProducers.entrySet()){
            for (Product currentProduct : c.getValue().getProductList()){
                if (currentProduct.equals(product)){
                    return c.getKey();
                }
            }
        }
        return null;
    }

}
