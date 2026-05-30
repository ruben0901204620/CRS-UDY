-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Productos
SELECT * FROM Products;


/* 
Mostrar los Productos donde 
el valor del campo Discountinued No es igual a 0 
*/
--Si es del estándar ISO
SELECT * FROM Products
WHERE Discontinued <> 0;

--No es del estándar ISO
SELECT * FROM Products
WHERE Discontinued != 0;


-- Ejercicio:
/* 
Mostrar el contacto, la dirección, el país y el teléfono
de los Clientes donde el país es diferente de USA
Ordenado por de manera Ascendente por el país
*/
--Si es del est�ndar ISO
SELECT ContactName, Address, Country, Phone
FROM Customers
WHERE Country <> 'USA'
ORDER BY Country;


--Si es del est�ndar ISO
SELECT ContactName, Address, Country, Phone
FROM Customers
WHERE Country != 'USA'
ORDER BY Country;