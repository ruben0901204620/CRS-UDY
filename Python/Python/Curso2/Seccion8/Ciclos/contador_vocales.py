print("*** Contador de Vocales ***")

cadena = "hola mundo"
conteo = 0

for letra in cadena:
    if letra in 'aeiou':
        conteo += 1

if conteo == 0:
    print("No hubo vocales")
else:
    print(f"El número de vocales es: {conteo}")


