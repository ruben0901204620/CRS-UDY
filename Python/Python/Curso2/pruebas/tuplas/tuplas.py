# Una tupla es una colección ordenada e inmutable.
# Es como una lista, pero no se puede modificar después de crearla.

# Crear una tupla
persona = ("Raul", 21, "Guatemala")
coordenadas = (10, 20)
colores = "rojo", "verde", "azul" # Es valido sin paréntesis

# Crear una tupla con uns solo elemento
x = (12.5) # esto es un entero
print(x)
y = (15,) # este si es una tupla
print(y)

# Indice y acceso
print(persona[0]) # Raul
print(persona[-1]) # Guatemala

# No se puede modificar una tupla
#persona[0] = "Edgar" -> TypeError: 'tuple' object does not support item assignment

# Metodos de tuplas
#| Método          | Descripción                           |
#| --------------- | ------------------------------------- |
#| `.count(x)`     | Cuenta cuántas veces aparece `x`      |
#| `.index(x)`     | Devuelve la posición de `x`           |
#| `.append(x)`    | Agrega un elemento al final           |
#| `.extend(lista)`| Agrega todos los elementos de otra lista|
#| `.insert(i, x)` | Inserta en una posición específica    |
#| `.remove(x)`    | Elimina el primer elemento igual a `x` |
#| `.pop([i])`     | Elimina el último o el que está en la posición `i` |
#| `.clear()`      | Elimina todos los elementos           |
#| `.copy()`       | Devuelve una copia de la tupla        |

# Lista a tupla
lista = [1, 2, 3]
tupla = tuple(lista)

# Tupla a lista
nueva_lista = list(tupla)

# Desempaquetar una tupla (unpacking)
persona = ("Ruben", "Lopez", 24)
nombre, apellido, edad = persona
print(f"Nombre: {nombre}, Apellido: {apellido}, Edad: {edad}")











