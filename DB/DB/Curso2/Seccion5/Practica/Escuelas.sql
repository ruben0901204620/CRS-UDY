USE Escuela;

INSERT INTO Auxiliares(nombre, paterno, materno, telefono)
				VALUES('Mirexa', 'GAllegos', 'Vega', 69876233);

INSERT INTO Auxiliares(idAuxiliar,nombre, paterno, materno, telefono)
				VALUES(101, 'Mirexa', 'GAllegos', 'Vega', 69876233);

INSERT INTO Auxiliares(nombre, paterno, materno, telefono)
				VALUES('Manuel', 'Santana', 'Herrera', 5893011);

INSERT INTO Auxiliares(nombre, paterno, materno, telefono)
				VALUES(63521578, 'Reyes', 'Prieto', 'Carla');

INSERT INTO Auxiliares(nombre, paterno, materno, telefono)
				VALUES('Carla', 'Reyes', 'Prieto', 63521578 );

INSERT INTO Auxiliares
VALUES('Cristobal', 'Sotelo', 'Aguilar', 69873655);

INSERT INTO Auxiliares
VALUES('BEnaviles', 69879999, 'Guillen', 'Lida');

INSERT INTO Auxiliares
VALUES('Lida', 'Guillen', 'Benavides', 98624455);

SET IDENTITY_INSERT Auxiliares ON;

INSERT INTO Auxiliares(idAuxiliar, nombre, paterno, materno, telefono)
				VALUES(3, 'Juan', 'Leon', 'Blanco', NULL);

INSERT INTO Auxiliares(idAuxiliar, nombre, paterno, materno, telefono)
				VALUES(6, 'Fernanda', 'Ortiz', 'Sanz', NULL);

SET IDENTITY_INSERT Auxiliares OFF;

INSERT INTO Auxiliares(nombre, paterno, materno, telefono)
				VALUES('Gabriel', 'Parra', 'Bravo', 48799652),
					  ('Jorge', 'Moya', 'Soler', 63201478),
					  ('Marta', 'Nieto', 'Diez', NULL), 
					  ('Raquel', 'Hidalgo', 'Iglesias', NULL);
