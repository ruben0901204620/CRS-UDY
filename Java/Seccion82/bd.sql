CREATE DATABASE db_springboot_82;

USE db_springboot_82;

CREATE TABLE products (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    description VARCHAR(100),
    price INT
)


/* 

SE CREA EN POSTMAN

{
    "name": "Televisor SAmsung 50",
    "descriptiopn:": "Exelente TV tecnologia OLED",
    "price": "8000"
} */