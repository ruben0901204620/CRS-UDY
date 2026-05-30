USE registro;


/* DELIMITER //

 CREATE TRIGGER tabla_sesion AFTER INSERT ON perfil 
for each row begin
INSERT INTO sesion (idsesion, usuario, contrasena) VALUES(NEW.idperfil, NEW.usuario, NEW.contrasena);

end //

DELIMITER ; */

SELECT * FROM perfil;
SELECT * FROM sesion;
INSERT INTO perfil (nombre, correo, usuario, contrasena) VALUES("Ruben", "ruben@example.com", "ruben" , "12345");

/*ALTER TABLE perfil AUTO_INCREMENT = 1;*/ /*reinicia el incrementeo de idperfil*/
