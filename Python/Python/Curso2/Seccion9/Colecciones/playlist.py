print("*** PlayList de Canciones ***")

# Creamos la lista vacia
lista_reproduccion = []

numero_canciones = int(input("Cuantas canciones deseas agregar: "))

# Iteramos cada elemento de la lista para agregar un nuevo elemento
for indice in range(numero_canciones):
    cancion = input(f"Proporcione la cancion {indice + 1}: ")
    lista_reproduccion.append(cancion)

# Ordenar la lista en orden alfabetico 'sort'
lista_reproduccion.sort()
# lista_reproduccion.sort(reverse=True)  Ordena de forma descendente reverse=true

# Mostrar la lista iterando sus elementos
print()
print("Lista de Reproducciones en orden alfabetico")

for elemento in lista_reproduccion:
    print(f"- {elemento}")

