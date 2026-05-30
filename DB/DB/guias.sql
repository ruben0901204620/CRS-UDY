-- Muestra solo los datos de la primera tabla, excluyendo los de la segunda tabla

DELETE FROM alumnos
WHERE idColegiatura = 1


USE NORTHWND;


-- SECCION 15
CREATE DATABASE EmpresaX
ON 
(
	NAME = EmpresaX_dat,
	FILENAME = 'D:\UDEMY\Curso2\Seccion15\BD\EmpresaX_dat.mdf',
	SIZE = 10MB,
	MAXSIZE = 50MB,
	FILEGROWTH = 5MB
)
LOG ON 
(
	NAME = EmpresaX_log,
	FILENAME = 'D:\UDEMY\Curso2\Seccion15\BD\EmpresaX_log.ldf',
	SIZE = 10MB,
	MAXSIZE = 50MB,
	FILEGROWTH = 5MB

)
GO


-- CREACIONDE ESQUEMAS (SCHEMA)
USE EmpresaX
GO

CREATE SCHEMA Persona
GO

CREATE SCHEMA Servicio
Go

CREATE SCHEMA Propiedad
Go

-- Eliminar columna 
ALTER TABLE Persona.Empleados
DROP COLUMN email
GO

-- Modifica una columna en especifico
ALTER TABLE Persona.Empleados
ALTER COLUMN nombre VARCHAR(50)
GO

-- añadir dato a la tabla
ALTER TABLE Persona.Empleados
ADD idEmpleado INT
GO

