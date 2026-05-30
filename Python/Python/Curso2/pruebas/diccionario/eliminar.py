# Eliminar elementos
#| Método          | Descripción                           |
#| --------------- | ------------------------------------- |
#| `pop(clave)`    | Elimina el primer elemento con la clave |
#| `popitem()`     | Elimina y devuelve el primer elemento |
#| `clear()`       | Elimina todos los elementos           |

persona = {
    "nombre": "Edgar",
    "edad": 21,
    "Ciudad": "Buenos Aires",
    "Pais": "Argentina",
}

print(f'Persona original: {persona}')

# Elimina un elemento
persona.pop("nombre")
print(f'Persona modificada: {persona}')

# Elimina el ultimo elemento
persona.popitem()
print(f'Persona modificada: {persona}')

# Elimina todos los elementos
persona.clear()
print(f'Persona modificada: {persona}') 