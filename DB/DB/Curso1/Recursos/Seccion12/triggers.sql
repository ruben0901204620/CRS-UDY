/*

Crearas un trigger que registre automaticamente un log (registtro de auditoria)
cada vez que un nuevo usuario sea agregado a una tabla de usuarios.

*/

/* CREATE TABLE usuarios (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(52),
CORREO VARCHAR(100),
cureado_en TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE auditoria_usuario(
id INT AUTO_INCREMENT PRIMARY KEY,
usuario_id INT,
accion VARCHAR(20),
fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP
); */

/* DELIMITER //
CREATE TRIGGER after_user_inseert
AFTER INSERT ON usuarios
FOR EACH ROW
BEGIN 
	INSERT INTO auditoria_usuarios (usuario_id, accion) VALUES (NEW.id,'Insercion de datos');
    END;
    
//

DELIMITER ; */

INSERT INTO usuarios(nombre, correo)VALUES('Juan Perez','juanP@gail.com')
















    
    
    