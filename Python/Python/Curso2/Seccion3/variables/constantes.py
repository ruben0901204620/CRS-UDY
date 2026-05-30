import math

print("*** Constantes en python ***")
PI = 3.14159
print("El valor de PI es:", PI)

NOMBRE_BASE_DATOS = 'clientes_db'
print("Nombre de la base de datos:", NOMBRE_BASE_DATOS)

# Esto NO se debe de hacer, no se debe modificar el valor de una constante
NOMBRE_BASE_DATOS = 'listado_clientes_db'
print("No cambiar el valor de una constante:", NOMBRE_BASE_DATOS)

# Usar una constante del lenguaje python, aunque en este caso no esta en mayuscula
print("Valor de maath.pi", math.pi)