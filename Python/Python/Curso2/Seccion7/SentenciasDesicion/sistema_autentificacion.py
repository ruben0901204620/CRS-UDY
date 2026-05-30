print("*** Sistema de Autentificacion ***")

USUARIO_CONSTANTE = 'root'
PASSWORD_CONSTANTE = 123

ingreso_usuario = input("Ingrese el usuario: ")
ingreso_password = int(input("Ingrese el password: "))
acceso = None

if ingreso_usuario == USUARIO_CONSTANTE and ingreso_password == PASSWORD_CONSTANTE:
    acceso = 'Bienvenido al sistema!'
elif ingreso_usuario == USUARIO_CONSTANTE and ingreso_password != PASSWORD_CONSTANTE:
    acceso = 'password invalidoingreso_usuario'
elif ingreso_usuario != USUARIO_CONSTANTE and ingreso_password == PASSWORD_CONSTANTE:
    acceso = 'usuario invalido'
else:
    acceso = 'usuario y password invalidos'

print(acceso)
