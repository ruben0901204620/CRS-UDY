-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Productos
SELECT * FROM Products;


-- Mostrar los Productos que tengan un precio menor que 10
SELECT * FROM Products
WHERE UnitPrice < 10;


-- Ejercicio:
/* 
Mostrar el nombre de la producto, el precio y el stock
de los Productos que tengan un stock menor a 10
*/
SELECT ProductName, UnitPrice, UnitsInStock 
FROM Products
WHERE UnitsInStock < 10;