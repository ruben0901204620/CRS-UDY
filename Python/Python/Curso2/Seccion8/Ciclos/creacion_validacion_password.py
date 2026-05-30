print("*** Creacion y Validacion de Psasword***")

password_permitido = 6

acceso = False

while not acceso:
    creacion_password = input("Ingrese una contrasenia: ")
    if not len(creacion_password) < password_permitido:
        print("Password valido")
        acceso = True
    else:
        print("Password invalido, vuelve a ingresar el password con minimo de 6 caracteres\n")

