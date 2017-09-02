package com.baeldung.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LearningManager {

    @Autowired
    @Qualifier("wholesaleProduct")
    private ProductService wholesaleService;

    private ProductService retailService;

    private DeliveryProduct deliveryProduct;

    @Autowired
    public LearningManager(@Qualifier("retailProduct") ProductService productService) {
        this.retailService = productService;
    }

    @Autowired
    @Qualifier("deliveryProduct")
    public void setDeliveryProduct(DeliveryProduct deliveryProduct) {
        this.deliveryProduct = deliveryProduct;
    }

    public void display() {
        System.out.println(wholesaleService.getName());
        System.out.println(retailService.getName());
        System.out.println(deliveryProduct.getName());
    }

}