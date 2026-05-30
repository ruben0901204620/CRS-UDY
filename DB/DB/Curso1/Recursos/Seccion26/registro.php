<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilos.css">
    <title>Registro</title>
</head>
<body>
    <div class="principal">
        <div class="formulario">
            <form action="guardado.php" method="post">
                <div class="titulo">
                    <h1>Registrate</h1>
                </div>
                <label for="" class="lnombre">Ingresa un nombre</label>
                <br>
                <input type="text" name="nombre">
                <br>
                <label for="" class="lcorreo">Ingresa un correo</label>
                <br>
                <input type="email" name="email">
                <br>
                <label for="" class="lusuario">Ingresa un usuario</label>
                <br>
                <input type="text" name="usuario">
                <br>
                <label for="" class="lcontrasena">Ingresa una contraseña</label>
                <br>
                <input type="text" name="contrasena">
                <br>
                <button>Registrate</button>
            </form>
        </div>
    </div>
    
</body>
</html>