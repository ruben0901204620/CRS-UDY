package com.lpz.curso.java.springboot.backend.services;

import com.lpz.curso.java.springboot.backend.entities.Product;
import com.lpz.curso.java.springboot.backend.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService{

    final private ProductRepository repository;

    public ProductServiceImplement(ProductRepository repository) {

        this.repository = repository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAllService() {
        return (List<Product>) repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findByIdService(Long id){
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Product saveService(Product product) {
        return repository.save(product);
    }

    @Transactional
    @Override
    public Optional<Product> deleteByIdService(Long id) {

        Optional<Product> productOptional = repository.findById(id);

        if(productOptional.isPresent()) {
            repository.deleteById(id);
            return productOptional;
        }



        return Optional.empty();
    }
}
