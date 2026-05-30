/*
Ejericio 2: Creacoin de una tabla para registro de ventas

Enunciado:
Necesitas una tabla para registrar las ventas en una tienda.

Crea una tabla  llamada ventas con los siguientes campos:
- ID de ventas: Un identificador unico para cada venta (entero, clave primaria).
- Fecha de la venta: La fecha y hora de la venta.
- Monto total: El monto total de la venta (numero decimal con dos decimales),
- metodo de pago: El etodo utilizado (cadena de texto, hasta 20 carcteres).
- ID de pago: El metodo utilizado (cadena de texto, hasta 20 caracteres).
- ID del cliente: Identificador del cleinte asociado a la venta (entero).
*/
CREATE TABLE ventas (
  id_venta INT PRIMARY KEY, -- ID de tabla.
  fecha_venta DATETIME, -- Fecha de las ventas.
  monto_total DECIMAL(10,2), -- Monto de vetnta.
  metodo_pago VARCHAR(20), -- Metodo de pago
  id_cliente INT -- ID del cliente
); 

SELECT * FROM ventas;