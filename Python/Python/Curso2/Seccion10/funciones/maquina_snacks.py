snacks = [
    {
        "papas": 30,
    },
    
    {
        "Refresco": 50  
    },
    
    {
        "Sandwich": 120
    }
]

compras_snacks = []

def mostrar_snacks():
    print("\n")
    print("--- Snacks disponibles ---")
    for indice in range(len(snacks)):
        for nombre, precio in snacks[indice].items():
            print(f"Id: {indice+1} -> {nombre} - Q.{precio}")

def comprar_nacks():
    print("\n")
    comprar = int(input("Que snack quieres comprar (id):  "))
    comprar -= 1
    
    for indice in range(len(snacks)):
        if comprar == indice: 
            compras_snacks.append(snacks[indice])
            for nombre, precio in compras_snacks[comprar].items():
                print(f'Snack agreagado: Compraste {nombre} con Q.{precio}') 
            break

    else:
        print(f"Snack NO encontrado con id: {comprar+1}")

def mostrar_tikets():
    print("\n")
    print("--- Tiket de Venta ---")
    suma = 0

    for indice in range(len(compras_snacks)):
        for clave, valor in compras_snacks[indice].items():
            print(f"- {clave} - Q.{valor}")
            suma += valor
    
    print(f"TOTAL -> Q.{suma}")


menu = True

while menu:
    print('''Menú:
    1. Mostrar Snacks
    2. Comprar Snacks
    3. Mostrar tikets
    4. Salir ''')
    opcion = int(input("Essoge una opción:"))
    
    if opcion == 1:
        mostrar_snacks()
        print("\n")
    elif opcion == 2:
        comprar_nacks()
        print("\n")
    elif opcion == 3:
        mostrar_tikets()
    elif opcion == 4:
        print("Hasta pronto!")
        menu = False
    else:
        print("Opcion incorrecta")
    