-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Clientes
SELECT * FROM Customers;


-- Mostrar los Clientes que sean de Alemania
SELECT * FROM Customers
WHERE Country = 'Germany';


-- Mostrar los Clientes que sean de España
SELECT * FROM Customers
WHERE Country = 'Spain';


-- Ejercicio: 
/* 
Mostrar el nombre de la compañia, el contacto y la dirección
de los clientes que sean de Mexico
*/
SELECT CompanyName, ContactName, Address 
FROM Customers
WHERE Country = 'Mexico';