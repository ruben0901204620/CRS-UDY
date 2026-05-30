 -- CREATE DATABASE java_curso;
 -- USE java_curso;
 
 CREATE TABLE productos (
  id INT primary key not null auto_increment,
  nombre VARCHAR(50), 
  precio INT,
  fecha_registro DATETIME
);

SELECT * FROM java_curso.productos;

INSERT INTO productos(nombre, precio, fecha_registro)
VALUES ('Bicicleta', 200, '2026-1-26'),
('Samsung', 300, '2026-1-20');


-- =============================================================================
use java_curso;

CREATE TABLE categorias (
	id INT primary key not null auto_increment,
    nombre VARCHAR(50)
);

SELECT * FROM categorias;

-- =============================================================================

ALTER TABLE productos
ADD categoria_id INT;

ALTER TABLE productos
ADD CONSTRAINT fk_productos_categoria
FOREIGN KEY (categoria_id) REFERENCES categorias(id);

SELECT * FROM java_curso.productos AS P INNER JOIN categorias AS c ON (p.categoria_id=c.id);

-- =============================================================================
USE java_curso;
ALTER TABLE productos
ADD sku VARCHAR(10) UNIQUE; -- codigo unico de x producto






