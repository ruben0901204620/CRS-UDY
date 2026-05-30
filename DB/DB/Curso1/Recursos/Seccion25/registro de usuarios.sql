USE muestra;

/* DELIMITER //
CREATE TRIGGER guardado_registro AFTER INSERT ON registro
for each row begin

INSERT INTO usuarios (idusuarios, usuario, descripcion) VALUES (NEW.idregistro, NEW.usuario, NEW.descripcion);

end //

DELIMITER ; */

INSERT INTO registro (nombre,usuario,contrasena,descripcion,edad) VALUES ("maria","maria12345","El mejor programador de c++",22);

SELECT * FROM registro;
SELECT * FROM usuarios;





