# Busca en una lista
#| Método          | Descripción                           |
#| --------------- | ------------------------------------- |
#| `index(valor)`  | Devuelve el índice del primer valor  |
#| `count(valor)`  | Devuelve el número de veces que aparece |
#| `in(valor)`     | Devuelve True si el valor está en la lista |

frutas = ["manzana", "Pera", "Limón", "Naranja", "Mango","Pera"] 

# Devuelve el índice de Naranja
print(f'frutas.index("Naranja"): {frutas.index("Naranja")}') 

# Devuelve el número de veces que aparece Pera
print(f'frutas.count("Pera"): {frutas.count("Pera") }')

# Devuelve True si Limón está en la lista
print(f'Limón en la lista? {"Limón" in frutas}')

# Longitud de la lista
print(f'Longitud de la lista: {len(frutas)}')

# Recorrer una lista
for fruta in frutas:
    print(fruta, end=" -> ")
