print("*** Promedio de Calificaciones ***")

# Pedir al usuario calificaciones a evaluar
calificaciones = int(input("Proporciona el no. de calificaciones a evaluar: "))
nota = []

for agregar in range(calificaciones):
    lista = float(input(f"Calificacion[{agregar}] = "))
    nota.append(lista)


print(f"\nLas calificaciones proporcionadas son: {nota}")
#suma = 0
#for recorrer in nota:
#    suma += recorrer
    # la suma de las calificaciones de [5, 6, 4]
    # suma = suma + recorrer
    # suma = 0 + 5
    # suma = 5 + 6
    # suma = 11 + 4
    # suma = 15

# suma iterable
suma = sum(nota)
promedio = suma / calificaciones
print(f"\nPromedio de las calificaciones: {promedio:.2f}")




