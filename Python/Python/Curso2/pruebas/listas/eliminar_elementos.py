# Eliminar elementos
#| Método          | Descripción                           |
#| --------------- | ------------------------------------- |
#| `remove(valor)` | Elimina el primer valor que encuentra |
#| `pop()`         | Elimina y devuelve el último elemento |
#| `pop(i)`        | Elimina y devuelve el índice `i`      |
#| `clear()`       | Borra toda la lista                   |

frutas = ["manzana", "Pera", "Limón", "Naranja", "Mango"]
print(f'Lista original: {frutas}')


frutas.remove("Limón") # Limón eliminado
frutas.pop() # Elimina el ultimo elemento
frutas.pop(2) # Elimina el elemento en la posición 2 

print(f'Lista modificada: {frutas}')

print(f'lista eliminada: {frutas.clear()}')
