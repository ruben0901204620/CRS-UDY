print("*** Suma con Argumentos Varaibles ***")

# Funcion sumar que acepta args variables
def suma(*args):
    total = 0
    for numero in args:
        total += numero
    return total

# Llamamos a la funcion sumar
resultado = suma(1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10)
print(f"El resultado de la suma es: {resultado}")