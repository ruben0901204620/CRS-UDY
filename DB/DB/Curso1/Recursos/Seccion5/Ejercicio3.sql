/*
Ejercicio 3: Filtrar estudiantes por nota.

Enunciado:
Tienes una tabla llamada estudiantes con la siguiente estructura:
- Estudiante ID.
- Nombre.
- Edad.
- Nota Final.

Escribe una consulta SQL que seleccione los nombres y las notas finales de los estudiantes
que tienen una nota mayor o igual a 80.

*/

CREATE TABLE estudiantes (
id_estudiante INT PRIMARY KEY,
nombre VARCHAR(45),
edad INT (100),
nota_final INT(100)
);

SELECT * FROM estudiantes;
SELECT nombre , nota_final FROM estudiantes WHERE nota_final >= 80;



