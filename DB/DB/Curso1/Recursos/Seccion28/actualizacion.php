<?php
include("conexion_almacen.php");

$id = $_POST['id'];
$nombre = $_POST['nombre'];
$descripcion = $_POST['descripcion'];
$cantidad = $_POST['cantidad'];
// $fecha = $_POST['fecha'];

$actualizacion = "UPDATE productos SET nombre_producto = '$nombre', descripcion_producto = '$descripcion', cantidad_producto = '$cantidad' WHERE idproductos = '$id'";

$validacion = mysqli_query($conexion, $actualizacion);
if($validacion) {
    header('location:lista_producto.php');
} else {
    echo "Ha ocurrido un error al actualizar los datos.";
}

?>