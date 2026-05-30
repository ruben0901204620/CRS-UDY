<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/nuevo_usuario.css">
    <title>Nuevo usuario</title>
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

        <div class="titulo">
            <h1>Registro</h1>
            <h2 class="subtitulo"></h2>
        </div>
    </div>

    <div class="formulario">
        <form action="usuario.php" method="post">
            <h2 class="logotipo">Ingrese los datos del empleado</h2>
            <label for="">Nombre</label>
            <br>
            <input type="text" name="nombre">
            <br><br>
            <label for="">Edad</label>
            <br>
            <input type="text" name="edad">
            <br><br>
            <label for="">DUI</label>
            <br>
            <input type="text" name="dui">
            <br><br>
            <label for="">Telefono</label>
            <br>
            <input type="text" name="telefono">
            <br><br>
            <label for="">Cargo</label>
            <br>
            <input type="text" name="cargo">
            <br><br>
            <button>Registrar empleado</button>
        </form>
    </div>
    
</body>
</html>