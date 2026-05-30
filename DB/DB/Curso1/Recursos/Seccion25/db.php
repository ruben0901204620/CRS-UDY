<?php

$conexion = mysqli_connect("127.0.0.1:3307", "root","","muestra");
// Iniciamos la conexion mediante la variable "$conexion" y utilizamos los datos de inico de sesion.
// Utilizamos "mysqli_connect" para ingresar los datos de sesion dentro de la base de datos.

/* Destro de los parametros de "mysqli_query" encontramos los datos de inicio de sision.
de la siguiente manera: "("servidor", "usuario","contraseña","DB");"

El campo "contraseña" no posee ningun parametro ya que el usuario ingresado contiene contraseña en la base de datos.
*/
?>