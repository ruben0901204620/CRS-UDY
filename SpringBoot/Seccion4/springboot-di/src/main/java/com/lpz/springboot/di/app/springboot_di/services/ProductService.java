package com.lpz.springboot.di.app.springboot_di.services;

import java.util.List;

import com.lpz.springboot.di.app.springboot_di.models.product;

public interface ProductService {
    List<product> findAll();
    product findById(Long id);

}
