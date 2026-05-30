<?php

include("db.php"); // Incluimos la conexion de la base de datos para aplicar la muestra de los datos.

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilo.css">
    <title>Muestra</title>
</head>

<body>
    <!-- 
    contenedor principal: Tiene el rol de base de toda nuestra estructura HTML despues de body.
    contenedor tabla: Sirve apra dar forma a la tabla donde se mostraran los datos.
    contenedor titulo: Sirve como base para el titulo de la tabla.
    contenedor table: Especifica la tabla donde se ostrara los datos.
-->
    <div class="principal">
        <div class="tabla">
            <div class="titulo">
                <h1>Usuarios Registrados</h1>
            </div>
            <table>
                <tr>
                    <td class="unico">Usuario</td>
                    <td>Usuario</td>
                    <td>Descripcion</td>
                    <td>Rango</td>
                </tr>
                <?php

                // hacemos la peticion de datos a la tala usuarios.
                $sql = "SeLECT * FROM usuarios";
                // VAlidamos la conexion y los datos para verificar si estos se han guardado correctamente.
                $validacion = mysqli_query($conexion, $sql);

                /*
                    Iniciamos el ciclo while y en su sentencia pondre el numero de registro de la base de datos 
                    como registro el ciclo no cierra hasta despues de establecer los campos de la tabla y con 
                    echo mandamos a llamar los datos guardados en el array y mostrarlos en la tabla los datos 
                    extraidos de la base de datos. 
                */
                while ($muestra = mysqli_fetch_array($validacion)) {

                ?>
                    <tr>
                        <td> <?php echo $muestra['usuario'] ?> </td>
                        <td> <?php echo $muestra['descripcion'] ?> </td>
                        <td> <?php echo $muestra['rango'] ?> </td>
                    <?php
                } // Se cierra el cilo para dar por finalizado el conteo de la tabla de la base de datos.
                    ?>
                    </tr>

            </table>
        </div>
    </div>

</body>

</html>