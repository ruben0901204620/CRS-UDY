package com.lpz.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

// import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
// import org.springframework.web.context.annotation.RequestScope;
// import org.springframework.web.context.annotation.SessionScope;

import com.lpz.springboot.di.app.springboot_di.models.product;

//@Component
//@RequestScope
// @SessionScope
// @Primary
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {
    private List<product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new product(1L, "Memoria corsair 32", 300L),
            new product(2L, "CPU Intel Core i9",  850L),
            new product(3L, "Teclado Razer Mini 60%", 180L),
            new product(4L, "MotherBoard Gigabyte", 490L)
        );
    }

    @Override
    public List<product> findAll() {
        return data;
    }

    @Override
    public product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
