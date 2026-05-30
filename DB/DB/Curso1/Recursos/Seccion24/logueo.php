<?php
// iniciamos el lenguaje php.
include('db.php'); # incluimos la conexion al archivo.

# Iniciamos variables para almacenar los datos del formulario.
$usuario = $_POST['usuariophp'];
$contrasena = $_POST['contraseñaphp'];

# iniciamos una sesion.
session_start();

# Globalizar una variable.
$_SESSION['usuario']=$usuario;

# Realizamos una peticion a la base de datos usando lenguaje SQL.
$logueo = "SELECT * FROM usuarios WHERE usuarioDB ='$usuario' AND contraseñaDB='$contrasena'";

# Validamos que los datos hayan sido recogidos correctamente.
$validacion = mysqli_query($conexion,$logueo);

# Guardamos los datos en un array
$filas = mysqli_fetch_row($validacion);

# Verificamos si los datos son correctos, mediante una sentencia.
if($filas > 0) {
    header('location:inicio.php');
} else {
    echo "ha ocurrido un error al loguearte, vuelve a intentarlo mas tarde.";
}
mysqli_free_result($validacion);

?>