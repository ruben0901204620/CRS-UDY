-- Usar la Base de Datos NORTHWND
USE NORTHWND;


--Consultar la Tabla Empleados(Employees)
SELECT * FROM Employees;


-- Concatenar el Nombre y Apellido del Empleado(Employees)
-- en una sola columna
SELECT FirstName AS Nombre, LastName AS Apellido
FROM Employees;


-- AS es opcional
SELECT FirstName Nombre, LastName Apellido
FROM Employees;


-- Alias con Dos palabras
-- Utilizando Corchetes
SELECT FirstName [Nombre Empleado], LastName Apellido
FROM Employees;

-- Utilizando comillas simples
SELECT FirstName 'Nombre Empleado', LastName Apellido
FROM Employees;


-- Alias en la Tabla
SELECT FirstName 'Nombre Empleado', LastName Apellido
FROM Employees AS Empleado;

SELECT FirstName 'Nombre Empleado', LastName Apellido
FROM Employees Empleado;

SELECT FirstName 'Nombre Empleado', LastName Apellido
FROM Employees E;