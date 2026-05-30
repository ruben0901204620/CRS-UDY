# Ejemplos
productos = (
    ("Camisa", 25.99, 50),
    ("Pantalón", 39.99, 30),
    ("Zapatos", 49.99, 20)
)

# 1
print(productos)
print(f"Productos: {productos.__getitem__(1).__getitem__(1)}")

# 2
for inventario in productos:
    print(f"Nombre: {inventario.__getitem__(0)}, {inventario.__getitem__(2)}")

# Bonus
mi_lista = list(productos)
modificar = list(mi_lista[2])
print(mi_lista)
print(modificar)
modificar.pop(2)
modificar.append(15)

mi_lista.pop(2)
mi_lista.append(modificar)

print(f"Lista actualizada: {mi_lista}")

###############################################################################
nombres = ["ana", "ruben", "andrea", "mario", "alicia", "carla"]
resultado = []
nombres_final = []

def encontrar_letra(buscar_letra):
    for nombre in nombres:
        for i in range(len(nombre)):
            if nombre[i] == buscar_letra:
                nombres_final.append(nombre.upper())
                break
            else:
                "No encontramos la letra"

letra = 'a'
encontrar_letra(letra)

print(f''' ##################################
      Nombres con inicio en "a": {nombres_final}
      
      ''')

        
for nombre in nombres:
    if nombre.startswith('a'):
        nombres_final.append(nombre)
        break

for nombreMayus in nombres_final:

    resultado.append(nombreMayus.upper())
    
print(f'Nombres con inicio en "a": {resultado}')

nombres = ["ana", "ruben", "andrea", "mario", "alicia", "carla"]
resultado = [nombre.upper() for nombre in nombres if nombre.startswith('a')]

print(resultado)


