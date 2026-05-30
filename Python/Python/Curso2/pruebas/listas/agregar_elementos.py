# Agregar elementos
#| Método            | Ejemplo                            | Resultado                       |
#| ----------------- | ---------------------------------- | ------------------------------- |
#| `append()`        | `frutas.append("mango")`           | Agrega al final                 |
#| `insert(pos, el)` | `frutas.insert(1, "coco")`         | Inserta en la posición indicada |
#| `extend()`        | `frutas.extend(["fresa", "kiwi"])` | Agrega varios elementos         |

frutas =["manzana", "Pera"]
print(f'Lista original: {frutas}')

frutas.append("Limón") # ["manzana", "Pera", "Limón"]
frutas.insert(1,"Zandia") # ["manzana", "Zandia", "Pera", "Limón"]
frutas.extend(["Melocotón", "Mango"]) 
# ["manzana", "Zandia", "Pera", "Limón", "Melocotón", "Mango"]

print(f'Lista modificada: {frutas}')