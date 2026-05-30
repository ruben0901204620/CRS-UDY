-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Productos(Products)
SELECT * FROM Products;


-- Consultar el Nombre y el Precio de los Productos
-- Aumentar en 10 el Precio
-- Disminuir en 10 el Precio
SELECT ProductName, UnitPrice, 
	   UnitPrice + 10 AS 'Columna SUMA', UnitPrice - 10 AS Resta
FROM Products;


-- Consultar la Fecha de Pedido(Order Date) de la Tabla Pedidos(Orders)
-- Aumentar en 1 día la Fecha de Pedido(Order Date)
-- Dismunir en 5 día la Fecha de Pedido(Order Date)
SELECT OrderDate,
	   OrderDate + 1 AS Suma, OrderDate - 5 AS Resta
FROM Orders;




-- Ejercicio1:
/* 
Mostrar el Nombre, Precio y Stock de los Productos
Restar el Precio en 2
donde el stock sea mayor a 100
*/
SELECT ProductName, UnitPrice, 
       UnitPrice - 2 AS Resta, UnitsInStock
FROM Products
WHERE UnitsInStock > 100;


-- Ejercicio2:
/* 
Mostrar el Nombre, Precio y Stock de los Productos
Aumentar el Precio en 15
donde el stock sea menor a 10
*/
SELECT ProductName, UnitPrice, 
       UnitPrice + 15 AS Suma, UnitsInStock
FROM Products
WHERE UnitsInStock < 10;