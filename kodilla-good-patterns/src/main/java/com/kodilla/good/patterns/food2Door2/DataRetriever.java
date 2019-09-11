package com.kodilla.good.patterns.food2Door2;


public class DataRetriever {
    public void retrieve() {

        ProducerOrder producerExtraFoodShopProducer = new ExtraFoodShop("ExtraFoodShopProducer");
        ProducerOrder producerHealthyShop = new HealthyShop("HealthyShop");
        ProducerOrder producerGlutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

        Product product = new Product("Bananas",  50);
        Product product1 = new Product("Pineapple",  85);
        Product product2 = new Product("Tomato",  35);
        Product product3 = new Product("Bread",  80);
        Product product4 = new Product("Coffee",  250);
        Product product5 = new Product("Tea",  50);
        Product product6 = new Product("Bread",  750);
        Product product7 = new Product("Cookie",  150);
        Product product8 = new Product("Orange", 50);
        Product product9 = new Product("Cheese", 100);
        Product product10 = new Product("Potato", 40);

        ProductCollection productsOfExtraFoodShopProducer = new ProductCollection();
        ProductCollection productsOfHealthyShopProducer = new ProductCollection();
        ProductCollection productsOfGlutenFreeShopProducer = new ProductCollection();

        productsOfExtraFoodShopProducer.addProduct(product);
        productsOfExtraFoodShopProducer.addProduct(product1);
        productsOfExtraFoodShopProducer.addProduct(product2);
        productsOfExtraFoodShopProducer.addProduct(product3);
        productsOfExtraFoodShopProducer.addProduct(product4);

        productsOfHealthyShopProducer.addProduct(product5);
        productsOfHealthyShopProducer.addProduct(product6);
        productsOfHealthyShopProducer.addProduct(product7);

        productsOfGlutenFreeShopProducer.addProduct(product8);
        productsOfGlutenFreeShopProducer.addProduct(product9);
        productsOfGlutenFreeShopProducer.addProduct(product10);

        ProducersRepository registerProducers = new ProducersRepository();

        registerProducers.addProducer(producerExtraFoodShopProducer, productsOfExtraFoodShopProducer);
        registerProducers.addProducer(producerHealthyShop, productsOfHealthyShopProducer);
        registerProducers.addProducer(producerGlutenFreeShop, productsOfGlutenFreeShopProducer);

        Order order = new Order(new User("John", "Doe",
                "MickeyMouse", "rat@nyt.com")
                , product8, 2);

        Processor processor = new Processor(new MailSend(), registerProducers);
        processor.process(order);

    }
}
