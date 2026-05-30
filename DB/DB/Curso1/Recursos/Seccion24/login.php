<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="loginStyle.css">
    <title>Login</title>
</head>

<body>
    <!-- 
    Contenedor clase principal: El contenedor principal se utiliza como base para colocar dentro del el todo 
    el contenido de la pagina web.

    Contenedor formulario: Este contenedor sirve como base para el formulario
    
    identificado con color negro y es la base de todo el formulario.

    Form: formulario donde ingresara los datos los usuarios para loguearse y asi poder ingresar a lo que vendria
    
    haciendo la pagina web.

     -action: Nos ayuda a redireccionar los datos ingresados al archivo de logueo.php una vez pulsado el boton.
     - method: Nos ayuda a mandar los datos de forma aronia.

    Contenedor subtitulo: contiene el titulo de login.
    
    label: Los label estan identificado con nombres especificos porque con estos aplicamos css correctamente.

    input: Estan especificados con nombres especificos porque con estos aplicamos css correctamente.
    -->
    <div class="principal">
        <div class="formulario">
            <form action="logueo.php" method="post">
                <div class="subtitulo">
                    <h2>Login</h2>
                </div>
                <label for="" class="tusuario">Usuario</label>
                <label for="" class="tucontraseña">Contraseña</label>
                <br><br>
                <input type="text" name="usuariophp" class="iusuario">
                <input type="password" name="contraseñaphp" id="" class="icontrseña">
                <br>
                <button>Ingresar</button>
            </form>
        </div>
    </div>

</body>

</html>