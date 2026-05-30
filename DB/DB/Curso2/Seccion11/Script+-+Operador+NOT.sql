-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Empleados(Employees)
SELECT * FROM Employees;


-- Consultar los Empleados(Employees)
-- Que NO sean del País de "USA"
SELECT * FROM Employees
WHERE NOT Country = 'USA';


-- Consultar los datos de la Tabla Clientes(Customers)
SELECT * FROM Customers;


-- Consultar los Clientes(Customers)
-- Que NO sean del País de "USA, Spain, France y Brazil"
-- Odernar de manera Ascendente por País
SELECT * FROM Customers
WHERE NOT Country IN ('USA', 'Spain', 'France', 'Brazil')
ORDER BY Country;


-- Ejercicio1:
/* 
Mostrar los datos de la Tabla Productos(Products)
donde el Stock NO sea mayor o igual a 20
Ordenar de manera Descendente por el Stock.
*/
SELECT * FROM Products
WHERE NOT UnitsInStock >= 20
ORDER BY UnitsInStock DESC;


-- Ejercicio2:
/* 
Mostrar los Clientes 
donde el Teléfono(Phone) NO empiece por abrir parentesis "(".
*/
SELECT * FROM Customers
WHERE NOT Phone LIKE '(%';