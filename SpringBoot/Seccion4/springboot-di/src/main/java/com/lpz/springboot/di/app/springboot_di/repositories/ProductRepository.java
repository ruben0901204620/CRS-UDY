package com.lpz.springboot.di.app.springboot_di.repositories;

import java.util.List;

import com.lpz.springboot.di.app.springboot_di.models.product;

public interface ProductRepository {
    List<product> findAll();
    product findById(Long id);

}
