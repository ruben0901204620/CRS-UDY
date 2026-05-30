-- Usar la Base de Datos Escuela
USE Escuela;


/* Insertar registro en la Tabla Profesores_Alumnos 
   con campos con Primary Key Compuestas */
INSERT INTO Profesores_Alumnos(idProfesor, idAlumno)
						VALUES(1, 2), (1, 3), (1, 4),
							  (2, 5), (2, 6), (2, 7),
							  (3, 8), (3, 9), (3, 10),
							  (4, 11);