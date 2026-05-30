print("*** Sistema de Inventarios ***")

inventario_almacen = {
    1:{
        'nombre':'Camisas',
        'precio':'Q.25.99',
        'cantidad':50
    },

    2:{
        'nombre':'pantalones',
        'precio':'Q.39.99',
        'cantidad':30
    },

    3:{
        'nombre':'Zapatos',
        'precio':'Q.49.99',
        'cantidad':20
    }

}


def mostrar_inventario():
    print("Inventario del almacen: ")
    for contador, inventario in inventario_almacen.items():
        print(f'''Id: {contador}, Nombre: {inventario.get('nombre')}, Precio: {inventario.get('precio')}, Cantidad: {inventario.get('cantidad')}''')

def agregar_inventario():
    print("--- Agregar nuevo producto ---")
    id = int(input("Id: "))
    nombre = input("Nombre: ")
    precio = float(input("Precio:"))
    cantidad = int(input("Cantidad: "))

    inventario_almacen[id] = {
            'nombre': nombre,
            'precio': precio,
            'cantidad': cantidad

    }
    print("El producto se ha agregado al inventario")

def buscar_inventario():
    print("--- Buscar Producto por id ---")
    id_buscar = int(input("Ingresa el id a buscar: "))

    if id_buscar in inventario_almacen:
        producto = inventario_almacen[id_buscar]
        print("Informacion del producto encontrado:")
        print(f"Id: {id_buscar}, Nombre: {producto['nombre']}, Precio: {producto['precio']}, Cantidad: {producto['cantidad']}")
    else:
        print("Producto no encontrado")


menu = True
while menu:
    print('''--- Menú ---
        1. Mostrar inventario
        2. Agregar inventario
        3. Buscar inventario
        4. Salir ''')
    opcion = int(input("Ingrese una opcion: "))

    if opcion == 1:
        mostrar_inventario()
        print("\n")
    if opcion == 2:
        agregar_inventario()
    if opcion == 3:
        buscar_inventario()
        print("\n")
    if opcion == 4:
        print("Hasta luego!")
        menu = False




