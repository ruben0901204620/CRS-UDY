
print("*** Sistema de inventarios***")
inventario = []
productos_inventario = int(input("Cuantos productos deseas agregar al inventario? "))

for indice in range(productos_inventario):
    print(f'Proporciona los valores del producto: {indice + 1}')
    nombre = input('Nombre: ')
    precio = float(input('Precio: '))
    cantidad = int(input('Cantidad: '))

    # Creamos el diccionario con el detalle del producto
    producto = {'id': indice, 'nombre': nombre, 'precio': precio, 'cantidad': cantidad}

    # Agregamos el nuevo producto al inventario
    inventario.append(producto)

# Mostrar el inventario inicial
print(f"\nInventario inicial: {inventario}")

# Buscar un producto por id
id_buscar = int(input("Ingrese el ID del producto a buscar: "))
producto_encontrado = True
for producto in inventario:
    if producto.get('id') == id_buscar:
        producto_encontrado = producto
        break

if producto_encontrado is not None:
    print(f"Informacion de producto encontrado: ")
    print(f'''
    id: {producto_encontrado.get('id')}
    nombre: {producto_encontrado.get('nombre')}
    precio: {producto_encontrado.get('precio')}
    cantidad: {producto_encontrado.get('cantidad')}
''')
else:
    print(f"Producto con id {id_buscar} no encontrado")

# Mostrar el inventario detallado
print(f'--- Inventario Detallado')
for producto in inventario:
    print(f'''
    id: {producto.get('id')}
    nombre: {producto.get('nombre')}
    precio: {producto.get('precio')}
    cantidad: {producto.get('cantidad')}
    ''')