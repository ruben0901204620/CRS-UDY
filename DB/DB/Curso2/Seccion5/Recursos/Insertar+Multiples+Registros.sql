-- Usar la Base de Datos Escuela
USE Escuela;


-- Insertar Múltiples Resgistros en la Tabla Auxiliares
INSERT INTO Auxiliares(nombre, paterno, materno, telefono)
				VALUES('Gabriel', 'Parra', 'Bravo', 999900006),
				      ('Jorge', 'Moya', 'Soler', 999900007),
					  ('Marta', 'Nieto', 'Diez', NULL),
					  ('Raquel', 'Hidalgo', 'Iglesias', NULL);