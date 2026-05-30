print("*** Obtener Coordenadas x,y,z ***")

def obtener_coordenadas():
    x, y, z = 10, 20, 30
    return x, y, z

# Llamar la funcion
resultado = obtener_coordenadas()
print(resultado)

# Unpacking de la tupla
x1, x2, x3 = resultado

print(f"Corrdenada: x = {x1}, y = {x2}, z = {x3}")

