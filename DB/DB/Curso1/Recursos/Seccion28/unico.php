<?php
include("conexion_almacen.php");

$id = $_GET['id'];
$seleccion = "SELECT * FROM productos WHERE idproductos = '$id'";
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vista Producto</title>
    <link rel="stylesheet" href="css/unico.css"> <!-- Asegúrate de que el nombre del archivo sea correcto -->
</head>

<body>

    <div class="Contenedor">
        <!-- Barra superior (Logo + Menú) -->
        <div class="top-bar">
            <!-- Logo -->
            <div class="logo">
                <h2>Almacen</h2>
            </div>
            <!-- Menú -->
            <div class="menu">
                <ul>
                    <li><a href="index.php">Inicio</a></li>
                    <li><a href="nuevo_usuario.php">Nuevo usuario</a></li>
                    <li><a href="nuevo_producto.php">Nuevo producto</a></li>
                    <li><a href="lista_producto.php">Lista de productos</a></li>
                </ul>
            </div>
        </div>

        <!-- Título principal -->
        <div class="titulo">
            <h1>Detalles del Producto</h1>
            <h2 class="subtitulo">Gestiona el inventario fácilmente</h2>
        </div>

        <!-- Formulario de edición del producto -->
        <div class="tabla">
            <form action="actualizacion.php" method="post">
                <table>
                    <thead>
                        <tr>
                            <th>Id Producto</th>
                            <th>Nombre Producto</th>
                            <th>Descripción</th>
                            <th>Cantidad</th>
                            <th>Fecha de Registro</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                        $validacion = mysqli_query($conexion, $seleccion);
                        while ($resultado = mysqli_fetch_array($validacion)) {
                        ?>
                            <tr>
                                <td><input type="text" name="id" value="<?php echo $resultado['idproductos'] ?>" readonly></td>
                                <td><input type="text" name="nombre" value="<?php echo $resultado['nombre_producto'] ?>"></td>
                                <td><input type="text" name="descripcion" value="<?php echo $resultado['descripcion_producto'] ?>"></td>
                                <td><input type="text" name="cantidad" value="<?php echo $resultado['cantidad_producto'] ?>"></td>
                                <td><input type="text" name="fecha" value="<?php echo $resultado['fecha_registro'] ?>" readonly></td>
                                <td><button type="submit">Guardar cambios</button></td>
                            </tr>
                        <?php
                        }
                        ?>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
</body>

</html>
