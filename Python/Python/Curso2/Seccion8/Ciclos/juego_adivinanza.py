import  random

print("*** Juego de Adivinanza ***")

numero_secreto = random.randint(1, 50)
intentos = 0
INTENTOS_MAXIMOS = 5
adivinado = False

while not adivinado:
    numero = int(input("Ingrese un valor: "))
    if numero != numero_secreto:
        if numero > numero_secreto:
            print("Numero incorrecto, es un numero menor, intentelo de nuevo\n")
        else:
            print("Numero incorrecto, es un numero mayor, intentelo de nuevo\n")
        intentos += 1
        if intentos > INTENTOS_MAXIMOS:
            print(f"Lo siento, has agotado el numero de intentos permitidos:{INTENTOS_MAXIMOS}")
            print(f"el numero correcto era: {numero_secreto}")
            adivinado = True
    else:
        if numero == numero_secreto:
            print(f"Felicidades, haz encontrado el numero secreto en {intentos} intentos")
            adivinado = True



