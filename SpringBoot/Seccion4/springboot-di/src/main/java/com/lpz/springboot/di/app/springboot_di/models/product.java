package com.lpz.springboot.di.app.springboot_di.models;

public class product implements Cloneable {
    private Long id;
    private String name;
    private Long price;

    public product(){

    }

    public product (Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Long price) {
        this.price = price;
    } 

    public Long getPrice() {
        return price;
    }

    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            return new product(id, name, price);
        }
    }


    


}
