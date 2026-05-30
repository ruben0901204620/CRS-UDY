USE practica_rutina;

/*CREATE PROCEDURE `datos_1y2` ()
BEGIN
SELECT * FROM tabla1, tabla2;

END*/

/*CREATE PROCEDURE `datos2y3` ()
BEGIN
SELECT * FROM tabla2, tabla3;

END */

/*CREATE PROCEDURE `datos_1_2y3` ()
BEGIN
SELECT * FROM tabla1, tabla2, tabla3;
END */

/* INSERT INTO tabla1 (dato1, dato2, dato3) VALUES ("1", "2", "3");
INSERT INTO tabla2 (dato4, dato5, dato6) VALUES ("4", "5", "6");
INSERT INTO tabla3 (dato7, dato8, dato9) VALUES ("7", "8", "9"); */

CALL datos_1_2y3;
