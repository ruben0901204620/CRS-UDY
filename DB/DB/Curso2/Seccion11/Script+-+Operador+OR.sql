-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Clientes
SELECT * FROM Customers;


/* 
Mostrar los Clientes que son
que son del País "Mexico" o "Argentina"
*/
--Las 2 expresiones son Verdaderas
SELECT * FROM Customers
WHERE Country = 'Brazil' OR Country = 'Argentina'
ORDER BY Country;


/* 
Mostrar los Clientes que son
que son del País "France" o "Perú"
*/
--Solo 1 expresión es Verdaderas
SELECT * FROM Customers
WHERE Country = 'France' OR Country = 'Perú'
ORDER BY Country;


/* 
Mostrar los Clientes que son
que son del País "France" y la ciudad de "Paris" o el País de "Austria"
*/
--Varias expresiones sin paréntesis
SELECT * FROM Customers
WHERE Country = 'France' AND City = 'Paris' OR Country = 'Austria'
ORDER BY Country, City;


--Utilizar paréntesis y cambiar el orden de evaluación
SELECT * FROM Customers
WHERE Country = 'France' AND (City = 'Paris' OR Country = 'Austria')
ORDER BY Country, City;


--Validar la expresión dentro del paréntesis
SELECT * FROM Customers
WHERE City = 'Paris' OR Country = 'Austria'
ORDER BY Country, City;


-- Ejercicio:
/* 
Mostrar los Productos 
donde el Precio sea mayor a 100 o menor a 9
Ordenado de manera Descendente por el Precio
*/
SELECT * FROM Products
WHERE UnitPrice > 100 OR UnitPrice < 9
ORDER BY UnitPrice DESC;