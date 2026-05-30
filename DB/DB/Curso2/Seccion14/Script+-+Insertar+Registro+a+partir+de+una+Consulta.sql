-- Usar la Base de Datos Escuela
USE Escuela;


-- Consultar la Tabla Profesores
SELECT * FROM Profesores


-- Insertar registro mediante instrucción SELECT
INSERT INTO Profesores(nombre, paterno, domicilio)
SELECT 'Karen', 'Saens', 'Av. Mexico 160';


-- Consultar la Tabla Employees de la Base de Datos NORTHWND
-- desde la Base de Datos Escuela
SELECT FirstName, LastName, Address
FROM NORTHWND.dbo.Employees;


-- Insertar registros a partir de una consulta SELECT
INSERT INTO Profesores(nombre, paterno, domicilio)
SELECT FirstName, LastName, Address
FROM NORTHWND.dbo.Employees;


-- Consultar la Tabla Profesores
SELECT * FROM Profesores