/* DELIMITER //

CREATE VIEW ventastotales AS 
SELECT
	p.nombre_producto AS Nombre_producto,
    SUM(v.cantidad) AS Total_cantidad,
    SUM(v.cantidad * p.precio) AS Ingreso_total
    
FROM productos p

JOIN
ventas v
ON 
	p.id_producto = v.id_producto
GROUP BY
p.nombre_Producto;

//
DELIMITER ; */

SELECT * FROM ventasTotales;