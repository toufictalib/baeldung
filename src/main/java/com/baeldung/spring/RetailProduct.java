package com.baeldung.spring;

import org.springframework.stereotype.Service;

@Service
public class RetailProduct implements ProductService {

    public RetailProduct() {
    }

    @Override
    public String getName() {
        return "Retail Product";
    }

}
