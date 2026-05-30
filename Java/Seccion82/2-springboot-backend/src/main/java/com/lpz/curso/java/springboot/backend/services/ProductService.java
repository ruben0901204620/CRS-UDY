package com.lpz.curso.java.springboot.backend.services;

import com.lpz.curso.java.springboot.backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAllService();
    Optional<Product> findByIdService(Long id);
    Product saveService(Product product);
    Optional<Product> deleteByIdService(Long id);



}
