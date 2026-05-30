/*

Crea una vista llamada "ResumenVenta" que combine las tablas productos y ventas
para mostrar el siguiente formato:
- nombre
- precio
- cantidad_venida
- total_ventas
- fecha_venta

donde:
- total_venta se calcula como precio * cantidad_vendida

*/

/* DELIMITER //

CREATE VIEW ResumenVentas AS
SELECT 
p.nombre_producto,
p.precio,
v.cantidad AS cantidad_vendida,
(p.precio * v.cantidad) AS Total_ventas,
v.fecha
FROM productos p
JOIN
ventas v

ON
p.id_producto = v.id_producto
//
DELIMITER ; */

SELECT nombre_producto, precio, cantidad_vendida, total_ventas, fecha 
FROM resumenVentas 
WHERE total_ventas > 10
ORDER BY total_ventas DESC;






























