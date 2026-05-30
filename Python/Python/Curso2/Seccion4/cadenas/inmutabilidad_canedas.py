# Inmutabilidad en cadenas
cadena1 = 'Hola mundo'
# cadena1[0] = 'h' no podemos modificar los caracteres
cadena2 = cadena1
cadena1 = 'adios'
print(cadena1)
print(cadena2)
