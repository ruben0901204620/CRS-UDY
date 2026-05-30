package com.lpz.curso.java.springboot.backend.controllers;

import com.lpz.curso.java.springboot.backend.entities.Product;
import com.lpz.curso.java.springboot.backend.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // trabaja con API REST
public class ProductController {
    final private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> list() {
        return ResponseEntity.ok(service.findAllService()); // devuelve un list de obj productos. arreglos con jyeison
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> detailes(@PathVariable Long id) {
        Optional<Product> optionalProduct = service.findByIdService(id);

        if(optionalProduct.isPresent()) {
            return ResponseEntity.ok(optionalProduct.get());
        }

        return ResponseEntity.notFound().build(); // error 404

    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveService(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Long id) {

        Optional<Product> optionalProduct = service.findByIdService(id);
        if(optionalProduct.isPresent()) {
            Product productDB = optionalProduct.get();
            productDB.setDescription(product.getDescription());
            productDB.setName(product.getName());
            productDB.setPrice(product.getPrice());

            return ResponseEntity.status(HttpStatus.CREATED).body(service.saveService(productDB));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id) {
        Optional<Product> optionalProduct = service.deleteByIdService(id);

        if(optionalProduct.isPresent()) {
            Product productDelete = optionalProduct.orElseThrow();
            return ResponseEntity.status(HttpStatus.OK).body(productDelete);
        }

        return ResponseEntity.notFound().build();
    }








}
