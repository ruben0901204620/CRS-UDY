/*Ejercicio 1: Creacion de una tabla para un sistema de biblioteca

Enunciado:
Estas desarrollando una base de datos pata gestionar una biblioteca.

Crea una tabla llamada libros que almacene la siguiente informacion:
- ID del libro: Un identificador unico para cada libro (entero,  clave primaria).
- Titulo: El titulo del libro (cadena de texto, hasta 255 caracteres, no nulo).
- Fecha de publicacion: Lafecha en que se publico el libro.
- Genero: El genero literario del libro (cadena de texto, hasta 50 caracteres).
*/

CREATE DATABASE cursos;
USE cursos;

CREATE TABLE Libros (
id_libro INT PRIMARY KEY, -- Indentificador unico.
Titulo VARCHAR(255) NOT NULL, -- Titulo del libro.
Autor VARCHAR(200) NOT NULL, -- Autor del libro.
Fecha_public DATE, -- Fecha de publicacion del libro.
Genero VARCHAR(50) -- Genero literario.

);

SELECT * FROM Libros;