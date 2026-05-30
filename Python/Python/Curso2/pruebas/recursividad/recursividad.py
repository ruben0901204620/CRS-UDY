# Función para despegar una nave al espacio.
def contar_atras(numero):
    if numero == 0:
        print("¡Despegue!")
    else:
        print(numero)
        contar_atras(numero - 1)
    
contar_atras(5)

# Funcion para calcular el factorial de un numero

def factorial(numero):
    if numero == 0:
        return 1
    else:
        return numero * factorial(numero -1)

numero = 5
print(f"El factorial del numero {numero} es: {factorial(numero)}")

# sumar un numero de 1 a n (recursivo)
def suma_recursiva(numero):
    if numero == 1:
        return 1
    else:
        return numero + suma_recursiva(numero - 1)

numero = 5
print(f"El numero {numero} es igual a {suma_recursiva(numero)}")


        
    