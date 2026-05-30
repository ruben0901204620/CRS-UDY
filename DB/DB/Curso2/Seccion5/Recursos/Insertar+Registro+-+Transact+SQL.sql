-- Usar la Base de Datos Escuela
USE Escuela;


-- Insertar un registro correctamente en la Tabla Auxiliares
INSERT INTO Auxiliares(nombre  , paterno   , materno, telefono)
				VALUES('Mirexa', 'Gallegos', 'Vega' , 999900001);


-- Provocar error en el campo Primary Key al insertar un registro en Tabla la Auxiliares
INSERT INTO Auxiliares(idAuxiliar, nombre  , paterno   , materno, telefono)
				VALUES(101       ,'Mirexa' , 'Gallegos', 'Vega' , 999900001);


-- Insertar otro registro correctamente en la Tabla Auxiliares
INSERT INTO Auxiliares(nombre  , paterno  , materno   , telefono)
				VALUES('Manuel', 'Santana', 'Herrera' , 999900002);


-- Provocar error en el orden de los campos al insertar un registro en Tabla la Auxiliares
INSERT INTO Auxiliares(nombre   , paterno, materno , telefono)
				VALUES(999900003, 'Reyes', 'Prieto', 'Carla');


-- Corregir el Error para que se inserte correctamente
INSERT INTO Auxiliares(nombre , paterno, materno , telefono)
				VALUES('Carla', 'Reyes', 'Prieto', 999900003);


-- Insertar un registro sin especificar los nombres de las columnas
INSERT INTO Auxiliares
VALUES('Cristobal', 'Sotelo', 'Aguilar', 999900004);


-- El orden de los datos a insertar es muy importante
INSERT INTO Auxiliares
VALUES('Benavides', 999900005, 'Guillén', 'Lida');


-- Corregir el error para poder insertar
INSERT INTO Auxiliares
VALUES('Lida', 'Guillén', 'Benavides', 999900005);