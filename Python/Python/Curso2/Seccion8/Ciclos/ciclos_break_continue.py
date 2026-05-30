print("*** Break y continue ***")

# Ejemplo con break
print("palabra break")
for numero in range(1, 10):
    if numero % 2 == 0: # numero par
        print(numero)
        break # Salimos del cilo inmediatamente

# Ejemplo con continue
print("\nPalabra continue")
for numero in range(1,9):
    if numero % 2 == 1: # numero impar
        continue
    print(numero) # numeros pares
