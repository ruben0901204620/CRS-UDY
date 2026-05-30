-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Clientes
SELECT * FROM Customers;


/* 
Mostrar los Clientes
que sean de la ciudad de "Sao Paulo, Madrid, Lisboa o Tokio"
*/
--Tokio no se muestra porque no existe registro de Tokio
SELECT * FROM Customers
WHERE City IN ('Sao Paulo', 'Madrid', 'Lisboa', 'Tokio')
ORDER BY City;


-- Ejercicio:
/* 
Mostrar los Productos 
donde el Precio sea "10, 20, 30 o 40"
Ordenado de manera Ascendente por el Precio
*/
SELECT * FROM Products
WHERE UnitPrice IN (10, 20, 30, 40)
ORDER BY UnitPrice;