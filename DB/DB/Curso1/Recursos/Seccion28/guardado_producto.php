<?php
include('conexion_almacen.php');

$nombre = $_POST['nombre'];
$descripcion = $_POST['descripcion'];
$cantidad = $_POST['cantidad'];

$guardar = "INSERT INTO productos (nombre_producto, descripcion_producto, cantidad_producto) VALUE ('$nombre', '$descripcion', '$cantidad')";

$validacion = mysqli_query($conexion, $guardar);

if($validacion) {
    header("location: lista_productos.php");
} else {
    echo "Hubo un error... Algo a salido mal. :c";
}

?>