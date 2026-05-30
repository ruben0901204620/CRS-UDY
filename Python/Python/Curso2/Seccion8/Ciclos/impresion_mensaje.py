print("*** Repeticion de un Mensaje ***")

mensaje = input("Proporciona un mensaje a repetir: ")
numero_de_repeticiones = int(input("Proporciona el numero de repeticiones:"))

# Iterar sobre el rango de repeticiones
for i in range(numero_de_repeticiones): # Si la variable i no se usara, comunmente se usa -
    print(f"{i+1} - {mensaje}")
