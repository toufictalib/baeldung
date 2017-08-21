package com.baeldung.spring;

import org.springframework.stereotype.Service;

@Service
public class DeliveryProduct implements ProductService {

    @Override
    public String getName() {
        return "Delivery Product";
    }

}
