import random

print("*** Sistema Generado de ID Unico ***")
nombre = input("Cual es tu nombre? ")
apellido = input("Cual es tu apellido? ")
naciemiento = input("Cual es tu año de naciemiento (YYYY)? ")
numero_aleatorio = random.randint(1000,9999)

print(f"Hola, {nombre}")
print("\tTu nuevo numeor de identificacion (ID) generado por el sistema es: ")
print(f"\t{nombre[0:2].upper()}{apellido[0:2].upper()}{naciemiento[2:4]}{numero_aleatorio}")
print("\tFelicidades!")