package com.lpz.springboot.di.app.springboot_di.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lpz.springboot.di.app.springboot_di.models.product;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class ProductRepositoryJson implements ProductRepository {

    private List<product> list;

    public ProductRepositoryJson() {
        Resource resource = new ClassPathResource("json/product.json");
        ObjectMapper objMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objMapper.readValue(resource.getFile(), product[].class));
        } catch (JacksonException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<product> findAll() {
        return list;
    }

    @Override
    public product findById(Long id) {
        return list.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();  
    }

}
