# Una lista es una colección ordenada y mutable de elementos
# que pueden ser de cualquier tipo: enteros, strings, otros objetos, e incluso otras listas.

lista_vacia = [] 
lista_numeros = [1, 2, 3, 4, 5]
lista_texto = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes"]
lista_mixta = [1, "dos", 3.0, True, lista_texto]

#| Propiedad     | Descripción                        |
#| ------------- | ---------------------------------- |
#| **Ordenada**  | Los elementos tienen un orden      |
#| **Mutable**   | Se puede cambiar después de crear  |
#| **Indexable** | Se accede con índices (`lista[0]`) |
#| **Iterables** | Se pueden recorrer con `for`       |

# Acceso de elementos por indice
# Los indices comienzan en 0 -> frutas = [0, 1, 2, 3, 4]   
frutas = ["manzana", "Pera", "Limón", "Naranja", "Mango"]
print(f'Lista de frutas originales: {frutas}')
print(f'Primer elemento: {frutas[0]}') # manzana
print(f'Segundo elemento: {frutas[1]}') # pera     
print(f'Último elemento: {frutas[4]}') # mango

# Tambien puedes usar indices negativos para recorrer desde el final
print(frutas[-1]) # Mango

# Modificar elementos
frutas[3] = "Melocotón"
print(frutas)

#| Método          | Qué hace                                           |
#| --------------- | -------------------------------------------------- |
#| `append(x)`     | Agrega un elemento al final                        |
#| `extend(lista)` | Agrega todos los elementos de otra lista           |
#| `insert(i, x)`  | Inserta en una posición específica                 |
#| `remove(x)`     | Elimina el primer elemento igual a `x`             |
#| `pop([i])`      | Elimina el último o el que está en la posición `i` |
#| `clear()`       | Elimina todos los elementos                        |
#| `index(x)`      | Devuelve la posición de `x`                        |
#| `count(x)`      | Cuenta cuántas veces aparece `x`                   |
#| `sort()`        | Ordena la lista                                    |
#| `reverse()`     | Invierte el orden                                  |
#| `copy()`        | Devuelve una copia de la lista                     |




 