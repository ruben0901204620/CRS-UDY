print("*** El Mayor de Dos Numeros ***")

# Pedir valores al usuario
numero1 = int(input("Ingrese el primero valor: "))
numero2 = int(input("Ingrese el segundo valor: "))

# Mostrar reultado de numero mayor
if not numero1 > numero2:
    print(f"El numero mayor es: {numero2}")
else:
    print(f"El numero mayor es: {numero1}")