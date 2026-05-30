SELECT * FROM productos;
/*

Ejercicio: Creacion de un procedimiento almacenado para filtrar productos por precio
contexto:
Tienes una base de datos de inventario con una tabla llmada productos que contiene
informacion de productos en una tienda.

La tabla tiene la siguiente estructura:
- id (INT): Identificador unico del productto.
- nombre(VAARCHAR): Nombre del producto.
- Categoria(VARCHAR): categoria del producto.
- Precio (INT): CCantidad en stock del producto.
- stock(INT): Cantidad en stock del producto.
Objetivo del ejercicio:
Debes crear un procedimiento almacenado que reciba un parametro de entrada llamada precio_minimo.
Este procedimiento debe seleccionar y mostrar todos los productos cuyo predio sea mayor o igual
a precio_minimo.

*/

/*DELIMITER //
	CREATE PROCEDURE Obtenerproductosprecio(IN precio_minimo INT)
    BEGIN
    SELECT id,nombre,categoria,precio,stock FROM productos WHERE precio >= precio_minimo;
    END //
DELIMITER;*/

CALL Obtenerproductosprecio(5);
    
    
    
    
    
    