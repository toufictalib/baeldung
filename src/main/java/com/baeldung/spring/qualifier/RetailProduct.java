package com.baeldung.spring.qualifier;

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
