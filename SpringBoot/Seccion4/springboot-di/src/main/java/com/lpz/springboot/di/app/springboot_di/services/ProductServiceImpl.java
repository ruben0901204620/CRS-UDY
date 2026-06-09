package com.lpz.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lpz.springboot.di.app.springboot_di.models.product;
import com.lpz.springboot.di.app.springboot_di.repositories.ProductRepository;
//import com.lpz.springboot.di.app.springboot_di.repositories.ProductRepositoryImpl;

//@Component
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private Environment environment;

    // @Autowired
    // @Qualifier("productFoo")
    private ProductRepository repository /*= new ProductRepositoryImpl() */;

    //  public void setRepository(ProductRepository repository) {
    //     this.repository = repository;
    // }

    public ProductServiceImpl(/*(@Qualifier"productList")*/ ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * environment.getProperty("config.price.tax", Double.class);
            // product newProduct = new product(p.getId(),p.getName(), priceImp.longValue());

            product newProduct = (product)p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;

                // p.setPrice(priceTax.longValue());
                // return p;
            
        }).collect(Collectors.toList());
    }

    @Override
    public product findById(Long id) {
        return repository.findById(id);
    }
    
}
