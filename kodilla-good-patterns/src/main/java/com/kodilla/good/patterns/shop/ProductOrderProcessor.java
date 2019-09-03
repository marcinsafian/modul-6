package com.kodilla.good.patterns.shop;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }
    public ProductOrderDTO execute (ProductOrderRequest productOrderRequest){
        boolean isSold = productOrderService.sold(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),productOrderRequest.getQuantity());
        if (isSold){
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),productOrderRequest.getQuantity());
        }else {
            System.out.println("Try later");
        }
        return new ProductOrderDTO(productOrderRequest.getUser(),productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),productOrderRequest.getQuantity(),isSold);
    }
}
