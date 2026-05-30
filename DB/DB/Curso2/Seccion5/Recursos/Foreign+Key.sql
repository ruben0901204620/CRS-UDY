-- Usar la Base de Datos Escuela
USE Escuela;


/* Insertar Registro con Error en los campos idAuxiliar y idColegiatura
   Los valores 100 no existen en su Tabla correspondiente */
INSERT INTO Alumnos
(idAuxiliar, idColegiatura, codigoAlumno, nombre, paterno, materno, fechaNacimiento, domicilio)
VALUES
(100, 100, 'A-100', 'Felipe', 'Mondalgo', 'Perez', '01/01/2000', 'Av. Brasil 520');


-- Corregir el error en los campo idAuxiliar y idColegiatura
INSERT INTO Alumnos
(idAuxiliar, idColegiatura, codigoAlumno, nombre, paterno, materno, fechaNacimiento, domicilio)
VALUES
(1, 1, 'A-100', 'Felipe', 'Mondalgo', 'Perez', '01/01/2000', 'Av. Brasil 520');