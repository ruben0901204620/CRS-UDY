-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Productos
SELECT * FROM Products;


/* 
Mostrar los Productos donde 
el precio No es mayor que 10
*/
SELECT * FROM Products
WHERE UnitPrice !> 10;


-- Ejercicio:
/* 
Mostrar el nombre de la producto, el precio y el stock
de los Productos donde el stock No es mayor que 100
Ordenado de manera Descendente por el stock
*/
SELECT ProductName, UnitPrice, UnitsInStock 
FROM Products
WHERE UnitsInStock !> 100
ORDER BY UnitsInStock DESC;