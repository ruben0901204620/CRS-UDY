<?php 

include("db.php");

$nombre = $_POST["nombre"];
$correo = $_POST["email"];
$usuario = $_POST["usuario"];
$contrasena = $_POST["contrasena"];

$peticion = "INSERT INTO perfil(nombre, correo, usuario, contrasena)VALUES('$nombre', '$correo', '$usuario', '$contrasena')";

$validacion = mysqli_query($conexion, $peticion);

if($validacion) {
    header('location:perfil.php');
} else {
    echo "No se ha podido registrar al usuario, intentelo de nuevo dentro de unos minutos.";
}


?>