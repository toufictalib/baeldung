package com.baeldung.spring.qualifier;

import org.springframework.stereotype.Service;

@Service
public class WholesaleProduct implements ProductService {
    @Override
    public String getName() {
        return "Wholesale Product";
    }

}