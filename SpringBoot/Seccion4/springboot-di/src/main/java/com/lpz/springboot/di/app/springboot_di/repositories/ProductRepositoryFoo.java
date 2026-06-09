package com.lpz.springboot.di.app.springboot_di.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lpz.springboot.di.app.springboot_di.models.product;

@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<product> findAll() {
        return Collections.singletonList(new product(1L, "Monitor Azuz 27", 600L));
    }

    @Override
    public product findById(Long id) {
        return new product(id, "Monitor Azuz 27", 600L);
    }


}
