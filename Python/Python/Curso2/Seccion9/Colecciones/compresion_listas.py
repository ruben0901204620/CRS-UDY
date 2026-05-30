print("*** Comprension de Listas ***")

# Una lista con el cuadrado de cada nunero
numeros = [1, 2, 3, 4, 5]
cuadrados = [x**2 for x in numeros]
print(cuadrados)

# Lista de numeros pares
numeros = range(10+1)
pares = [x for x in numeros if x % 2 == 1]
print(pares)

# Lista saludando a cada nombre
nombres = ['Ana', 'Geronimo', 'Carlos']
saludando = [f'hola {nombre}' for nombre in nombres]
print(saludando)
