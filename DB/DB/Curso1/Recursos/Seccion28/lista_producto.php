<?php
include('conexion_almacen.php');
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/lista_producto.css">
    <title>Lista de productos</title>
</head>

<body>
    <div class="contenedor">
        <!-- Barra superior -->
        <div class="top-bar">
            <!-- Logo -->
            <div class="logo">
                <h2>Productos en inventario</h2>
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

        <!-- Tabla de productos -->
        <div class="tabla">
            <table>
                <!-- Encabezado de la tabla -->
                <thead>
                    <tr>
                        <th>Id producto</th>
                        <th>Nombre del producto</th>
                        <th>Descripción del producto</th>
                        <th>Cantidad de producto</th>
                        <th>Fecha de ingreso del producto</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <!-- Cuerpo de la tabla -->
                <tbody>
                    <?php
                    $sql = "SELECT * FROM productos";
                    $peticion = mysqli_query($conexion, $sql);

                    while ($resultado = mysqli_fetch_array($peticion)) {
                    ?>
                        <tr>
                            <td class="center"><?php echo $resultado['idproductos']; ?></td>
                            <td><?php echo $resultado['nombre_producto']; ?></td>
                            <td><?php echo $resultado['descripcion_producto']; ?></td>
                            <td class="center"><?php echo $resultado['cantidad_producto']; ?></td>
                            <td><?php echo $resultado['fecha_registro']; ?></td>
                            <td><a href="unico.php?id=<?php echo $resultado['idproductos']; ?>">Editar</a></td>
                        </tr>
                    <?php
                    }
                    ?>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>
