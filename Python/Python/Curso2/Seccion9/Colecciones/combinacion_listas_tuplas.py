
print("*** Combinacion de Listas y Tuplas ***")
# Definir una lista que almacena tuplas de productos

productos = [
    ('P001', 'Camiseta', 20.00),
    ('P002', 'Jeans', 30.00),
    ('P003', 'Sudadera', 40.00),

]

# Imprimir la informacion de cada producto
# y ademas calculamos el precio total
precio_total = 0

print("Informacion de los productos: ")
for producto in productos:
    #print(producto)
    id, descripcion, precio = producto # unpakings
    print(f"Producto: id = {id}, descripcion = {descripcion}, precio = Q.{precio}")
    precio_total += precio # producto[2]
print(f"Precio total de los productos: Q.{precio_total}")
