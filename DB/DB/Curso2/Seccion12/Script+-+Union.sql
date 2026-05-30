-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Explicar Operador UNION
(
SELECT 1 AS num
UNION
SELECT 2
UNION
SELECT 3
)
	UNION
(
SELECT 3 AS num2
UNION
SELECT 4
UNION
SELECT 5
);


-- UNIR sin duplicados los Países de la 
-- Tabla Clientes(Customers) y Empleados(Employees)
SELECT Country FROM Customers
UNION 
SELECT Country FROM Employees
ORDER BY Country;