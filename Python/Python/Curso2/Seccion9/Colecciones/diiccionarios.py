print("*** Diccionario en Python ***")

# Crear un diccionario de persona con clave y valor
persona = {
    'nombre': 'Sergio',
    'edad': 30,
    'ciudad': 'Mexico'
}
print(f"Diccionario de persona: {persona}")

# Acceder a los elementos del diccionario
print(f"Nombre: {persona['nombre']}")
print(f"Edad: {persona.get('edad')}")
print(f"Ciudad: {persona.get('ciudad')}")

# Modificar un valor del diccionario
persona['edad'] = 35
print(f"Diccionario de persona: {persona}")

# Agregar un nuevo elemento
persona['profesion'] = 'imgeniero'
print(f"Diccionario de persona: {persona}")

# Eliminar un elemento
del persona['ciudad']
print(f"Diccionario de persona: {persona}")

persona.pop('profesion')
print(f"Diccionario de persona: {persona}")

# Iterar los elementos de un diccioanrio (llave, valor)
for llave, valor in persona.items(): # realiza un unpaking
    print(f"Llave: {llave}, valor: {valor}")

print("\nValores del diccionario")
# Obtener los valores
for valor in persona.values():
    print(f"- valor: {valor}")

print("\nLlaves del diccionario")
# Obtener las llaves
for llave in persona.keys():
    print(f"- llave: {llave}")

