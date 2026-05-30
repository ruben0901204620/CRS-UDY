<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nuevo Producto</title>
    <link rel="stylesheet" href="css/nuevo_producto.css">
</head>

<body>
    <div class="contenedor">
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

        <div class="formulario">
            <form action="guardado_producto.php" method="post">
                <h2 class="subtitulo">Ingresa un nuevo producto</h2>
                <label for="">Ingrese nombre del producto</label>
                <br>
                <input type="text" placeholder="Ej: martillo" name="nombre">
                <br><br>
                <label for="">Ingresa una descripcion del producto</label>
                <br>
                <textarea name="descripcion" id="" cols="30" rows="10" placeholder="Ej: martillo de madera de 20 cm."></textarea>
                <br><br>
                <label for="">Cantidad a ingresar</label>
                <br>
                <input type="text" placeholder="Ej: Q.12" name="cantidad">
                <br><br>
                <button>Ingresar producto</button>
            </form>
        </div>
    </div>
</body>

</html>
