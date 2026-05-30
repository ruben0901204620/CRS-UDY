-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Clientes
SELECT * FROM Customers;


/* 
Mostrar los Clientes que son
del País "Brazil" y la Ciudad de "Rio de Janeiro"
*/
SELECT * FROM Customers
WHERE Country = 'Brazil' AND City = 'Rio de Janeiro';


-- Ejercicio:
/* 
Mostrar los Productos 
donde el Precio sea mayor o igual a 40
y el Stock sea menor o igual a 20
Ordenado de manera Ascendente por el Precio y Stock
*/
SELECT * FROM Products
WHERE UnitPrice >= 40 AND UnitsInStock <= 20
ORDER BY UnitPrice, UnitsInStock;