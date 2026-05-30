/*

Crear un DB para gestionar un sistema de inventario.
DEbes implementar un trigger que se active antes de insertar un regitro
en la tabla productos y verifique que el precio del producto sea mayor a 0.
Si el precio no es valido, el trigger debe impedir la inserccion y mostrar un mensaje de error.

*/

 /* CREATE TABLE productos (
id_producto INT AUTO_INCREMENT PRIMARY KEY,
nombre_producto VARCHAR(100) NOT NULL,
precio DECIMAL(10.2) NOT NULL
); */ 

/* DELIMITER //

CREATE TRIGGER validar_precio
BEFORE INSERT ON productos
FOR EACH ROW
BEGIN
-- validar el precio, debe ser mayor a cero.
 IF NEW.precio <= 0 THEN
 SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'El precio del producto debe ser mayor a cero.';
 END IF;
 
 END
 //
 
 DELIMITER ; */
 
 INSERT INTO productos(nombre_producto, precio)VALUES('smatTV',5000);





