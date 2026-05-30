# Buscar en un diccionario
#| Método          | Descripción                           |
#| --------------- | ------------------------------------- |
#| `get(clave)`    | Devuelve el valor de la clave         |
#| `items()`       | Devuelve una lista de pares clave:valor|
#| `keys()`        | Devuelve una lista de claves           |
#| `values()`      | Devuelve una lista de valores          |
#| `in(clave)`     | Devuelve True si la clave está en el diccionario |

persona = {
    "nombre": "Edgar",
    "edad": 21,
    "Ciudad": "Buenos Aires",
    "Pais": "Argentina",
}

print(f'persona original: {persona}')

# Devuelve el valor de la clave
persona.get("nombre")
print(f'persona.get("nombre"): {persona.get("nombre")}')

# Devuelve una lista de pares clave:valor
persona.items()
print(f'persona.items(): {persona.items()}')

# Devuelve una lista de claves
persona.keys()
print(f'persona.keys(): {persona.keys()}')

# Devuelve una lista de valores
persona.values()
print(f'persona.values(): {persona.values()}')

# Devuelve True si la clave está en el diccionario
print(f'"nombre" en persona? {"nombre" in persona}')

# Longitud de un diccionario
print(f'Longitud de persona: {len(persona)}')
print("\n")

# Recorrer un diccionario
print(f'Claves y valores de persona:')
for clave, valor in persona.items():
    print(f'{clave}: {valor}')
print("\n")

# Recorre solo las claves
print(f'Claves de persona:')
for clave in persona.keys():
    print(clave)
print("\n")

# Recorre solo los valores
print(f'Valores de persona:')
for valor in persona.values():
    print(valor)    