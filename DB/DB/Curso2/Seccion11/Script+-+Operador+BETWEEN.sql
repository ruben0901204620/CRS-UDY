-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Productos(Products)
SELECT * FROM Products;


-- Consultar los Productos
-- Donde el Precio se encuentre en el rango de 10 hasta 20
-- Ordenar de manera Ascendente por el Precio.
SELECT * FROM Products
WHERE UnitPrice BETWEEN 10 AND 20
ORDER BY UnitPrice;


-- Consultar los datos de la Tabla Ordenes(Orders)
SELECT * FROM Orders;


/*
Consultar los datos de la Tabla Ordenes(Orders)
Donde la Fecha de Orden(OrderDate) 
se encuentre en el rango "01/09/1996" hasta "31/10/1996"
Ordenar de manera Ascendente por la Fecha de Orden(OrderDate).
*/
-- Consultar con numeros(Formato YMD)
SELECT * FROM Orders
WHERE OrderDate BETWEEN '19960901' AND '19961031'
ORDER BY OrderDate;


-- Consultar con numeros(Formato DMY)
SELECT * FROM Orders
WHERE OrderDate BETWEEN '01091996' AND '31101996'
ORDER BY OrderDate;


-- Consultar con guion(Formato D-M-Y)
SELECT * FROM Orders
WHERE OrderDate BETWEEN '01-09-1996' AND '31-10-1996'
ORDER BY OrderDate;


-- Consultar con línea diagonal(Formato D/M/Y)
SELECT * FROM Orders
WHERE OrderDate BETWEEN '01/09/1996' AND '31/10/1996'
ORDER BY OrderDate;


-- Las opciones para DATEFORMAT son mdy, dmy, ymd, ydm, myd o dym.
SET DATEFORMAT dmy;


-- No aplica con números
SELECT * FROM Orders
WHERE OrderDate BETWEEN '01091996' AND '31101996'
ORDER BY OrderDate;


-- Consultar con guion(Formato D-M-Y)
SELECT * FROM Orders
WHERE OrderDate BETWEEN '01-09-1996' AND '31-10-1996'
ORDER BY OrderDate;


-- Consultar con línea diagonal(Formato D/M/Y)
SELECT * FROM Orders
WHERE OrderDate BETWEEN '01/09/1996' AND '31/10/1996'
ORDER BY OrderDate;


/*
Consultar los datos de la Tabla Ordenes(Orders)
Donde el País de Envío(ShipCountry) 
se encuentre en el rango de "Germany" hasta "Mexico"
Ordenar de manera Ascendente por el País de Envío(ShipCountry).
*/
SELECT * FROM Orders
WHERE ShipCountry BETWEEN 'Germany' AND 'Mexico'
ORDER BY ShipCountry;



-- Ejercicio1:
/* 
Mostrar los datos de la Tabla Productos(Products)
donde el Stock se encuentre en el rango de 20 hasta 30
Ordenar de manera Ascendente por el Stock.
*/
SELECT * FROM Products
WHERE UnitsInStock BETWEEN 20 AND 30
ORDER BY UnitsInStock;


-- Ejercicio2:
/* 
Consultar los datos de la Tabla Ordenes(Orders)
Donde la Fecha de Envío(ShippedDate) 
se encuentre en el rango "01/01/1998" hasta "01/03/1998"
Ordenar de manera Ascendente por la Fecha de Envío(ShippedDate).
*/
SELECT * FROM Orders
WHERE ShippedDate BETWEEN '19980101' AND '19980301'
ORDER BY ShippedDate;