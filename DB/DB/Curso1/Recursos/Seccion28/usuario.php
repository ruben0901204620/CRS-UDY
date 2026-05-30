<?php
include('conexion_almacen.php');

$nombre = $_POST['nombre'];
$edad = $_POST['edad'];
$dui = $_POST['dui'];
$telefono = $_POST['telefono'];
$cargo = $_POST['cargo'];

$peticion = "INSERT INTO empleados (nombre, edad, DUI, telefono, cargo) VALUE ('$nombre', '$edad', '$dui', '$telefono', '$cargo')";

$validacion = mysqli_query($conexion, $peticion);

if($validacion) {
    header('location:registro_completado.php');
} else {
    echo "Algo a salido mal";
}

?>