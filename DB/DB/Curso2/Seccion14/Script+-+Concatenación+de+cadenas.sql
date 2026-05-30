-- Usar la Base de Datos NORTHWND
USE NORTHWND;


--Consultar la Tabla Empleados(Employees)
SELECT * FROM Employees


-- Concatenar el Nombre y Apellido del Empleado(Employees)
-- en una sola columna
SELECT FirstName + LastName AS Name
FROM Employees


-- Poner un espacio entre el nombre y el apellido
SELECT FirstName + ' ' + LastName AS Name
FROM Employees


-- Poner una coma con espacio entre el nombre y el apellido
SELECT FirstName + ', ' + LastName AS Name
FROM Employees