-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Explicar Operador EXCEPT
(
SELECT 1 AS num
UNION
SELECT 2
UNION
SELECT 3
)
	EXCEPT
(
SELECT 3 AS num2
UNION
SELECT 4
UNION
SELECT 5
);


-- Mostrar los Paises de la Tabla Clientes(Customers)
-- Que no están en la Tabla Empleados(Employees)
SELECT Country FROM Customers
EXCEPT
SELECT Country FROM Employees
ORDER BY Country;