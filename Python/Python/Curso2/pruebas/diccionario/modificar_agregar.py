# Modificar y agregar elementos
#| Método          | Descripción                           |
#| --------------- | ------------------------------------- |
#| `update(dicc)`  | Agrega todos los elementos de otro diccionario |
#| `setdefault(clave, valor)` | Agrega un elemento si no existe |


persona = {
    "nombre": "Edgar",
    "edad": 21,
    "Ciudad": "Buenos Aires",
    "Pais": "Argentina",
}
print(f'Persona original: {persona}')

# Agrega un elemento
persona.update({"nombre": "Omar", "Pais": "Colombia"})
persona["edad"] = 30
print(f'Persona actualizada: {persona}')

# Agrega una clave si no existe
persona.setdefault("oficio", "Ingeniero") 
print(f'diccionario actualizado: {persona}')


inventario = {
    101: {"nombre": "Camisa", "precio": 25.99, "stock": 50},
    102: {"nombre": "Pantalón", "precio": 39.99, "stock": 30},
    103: {"nombre": "Zapatos", "precio": 49.99, "stock": 20}
}





