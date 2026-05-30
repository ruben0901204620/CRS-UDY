-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Productos(Products)
SELECT * FROM Products;


-- Consultar el Nombre, Precio y Stock de los Productos
-- Calcular el costeInventario(Precio * Stock)
SELECT ProductName, UnitPrice, UnitsInStock, 
	   UnitPrice * UnitsInStock AS costeInventario
FROM Products;


-- División
SELECT 10 / 2 --Resultado 5
SELECT 21 / 2 --Resultado 10

SELECT CAST(21 AS DECIMAL(7,2)) / 2 --Resultado 10.5

SELECT 0 / 0 --Error


-- Ejercicio:
/* 
Mostrar la Cantidad, Precio y Stock de la Tabla [Order Details]
Calcular el Monto Total(Cantidad * Precio - Descuento)
*/
SELECT Quantity, UnitPrice, Discount,
		Quantity * (UnitPrice - (UnitPrice * Discount)) montoTotal
FROM [Order Details];