-- Usar la Base de Datos NORTHWND
USE NORTHWND;


-- Consultar los datos de la Tabla Clientes
-- Ordenado Contacto(ContactName)
SELECT * FROM Customers
ORDER BY ContactName;


-- Consultar el Cliente con nombre "Ana Trujillo"
-- Utilizando el Operador de Comparación "ES IGUAL A"
SELECT * FROM Customers
WHERE ContactName = 'Ana Trujillo';


-- Consultar el Cliente con nombre "Ana Trujillo"
-- Utilizando el Operador Lógico "LIKE"
SELECT * FROM Customers
WHERE ContactName LIKE 'Ana Trujillo';


-- Consultar los datos de la Tabla Clientes
-- Ordenado Contacto(ContactName)
SELECT * FROM Customers
ORDER BY ContactName;


/*
Consultar los datos de la Tabla Clientes
Donde el Contacto(ContactName) inicie con la palabra "Carlos"
Ordenado Contacto(ContactName)
*/
SELECT * FROM Customers
WHERE ContactName LIKE 'Carlos%'
ORDER BY ContactName;


/*
Consultar los datos de la Tabla Clientes
Donde el Cargo(Contact Title) Termine con el palabra "Manager"
Ordenado Nombre de Contacto
*/
SELECT * FROM Customers
WHERE ContactTitle LIKE '%Manager'
ORDER BY ContactTitle;


/*
Consultar los datos de la Tabla Clientes
Donde el Contacto(ContactName) contenga la palabra "Pedro"
Ordenado Contacto(ContactName)
*/
SELECT * FROM Customers
WHERE ContactName LIKE '%Pedro%'
ORDER BY ContactName;


-- Consultar los datos de la Tabla Clientes
-- Ordenado Contacto(ContactName)
SELECT * FROM Customers
ORDER BY ContactName;


-- Consultar los datos de la Tabla Clientes
-- Donde el Contacto(ContactName) sea "Carlos González"
-- Ordenado Contacto(ContactName)
SELECT * FROM Customers
WHERE ContactName = 'Carlos González';


SELECT * FROM Customers
WHERE ContactName LIKE '%Gonz_lez';


SELECT * FROM Customers
WHERE ContactName LIKE '%Gonz_le_';


-- Ejercicio1:
/* 
Mostrar los Clientes 
donde la dirección(Address) contenga avenidas(Av.)
y los numeros restantes.
*/
SELECT * FROM Customers
WHERE Address LIKE 'Av.%';


-- Ejercicio2:
/* 
Mostrar los Clientes 
donde el Teléfono(Phone) empiece por 3 números seguido del guion
y los numeros restantes.
*/
SELECT * FROM Customers
WHERE Phone LIKE '___-%';