-- Usar la Base de Datos Escuela
USE Escuela;


-- Ejercicio: UPDATE sin Condicional
-- Actualizar el valor de 17 a 20
UPDATE Calificaciones
SET    calificacion = 20
WHERE  calificacion = 17;


-- Actualizar el valor donde el idAlumno es igual a 2
UPDATE Alumnos
SET    nombre = 'OSCAR',
	   paterno = 'LEON',
	   materno = 'HURTADO'
WHERE  idAlumno = 2;