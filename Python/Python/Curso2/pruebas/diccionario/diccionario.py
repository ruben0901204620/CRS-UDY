# Un diccionario es una colección no ordenada
# (en versiones antiguas de Python) de pares clave:valor.

persona = {
    "nombre": "Edgar",
    "edad": 21,
    "Ciudad": "Buenos Aires",
    "Pais": "Argentina",

}

# A diferencia de las listas (lista[0])
# en un diccionario accedés con la clave, no con índice:
print(f'{persona["nombre"]}')

#| Método           | Descripción                             |
#| ---------------- | --------------------------------------- |
#| `.get(clave)`    | Devuelve el valor o `None` si no existe |
#| `.pop(clave)`    | Elimina y devuelve el valor             |
#| `.keys()`        | Devuelve las claves                     |
#| `.values()`      | Devuelve los valores                    |
#| `.items()`       | Devuelve tuplas (clave, valor)          |
#| `.clear()`       | Vacía el diccionario                    |
#| `.update(dict2)` | Agrega o actualiza valores              |
# `dict.copy()`    | Copia el diccionario                    |
