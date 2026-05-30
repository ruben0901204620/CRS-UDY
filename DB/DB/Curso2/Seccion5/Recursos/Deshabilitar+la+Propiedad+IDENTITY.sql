-- Usar la Base de Datos Escuela
USE Escuela;


-- Habilitar la inserción del dato en el campo IDENTITY
SET IDENTITY_INSERT Auxiliares ON;


-- Insertar registro con el valor de 3 en el campo IDENTITY idAuxiliar
INSERT INTO Auxiliares(idAuxiliar, nombre, paterno, materno, telefono)
				VALUES(3, 'Juan', 'Leon', 'Blanco', NULL);


-- Insertar registro con el valor de 6 en el campo IDENTITY idAuxiliar
INSERT INTO Auxiliares(idAuxiliar, nombre, paterno, materno, telefono)
				VALUES(6, 'Fernanda', 'Ortiz', 'Sanz', NULL);


-- Deshabilitar la inserción del dato en el campo IDENTITY
SET IDENTITY_INSERT Auxiliares OFF;