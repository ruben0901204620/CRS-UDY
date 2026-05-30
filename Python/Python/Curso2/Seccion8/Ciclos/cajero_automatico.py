print("*** Aplicacion de Cajero Automatico ***")

salir = True
saldo_inicial = 1000
nuevo_saldo = saldo_inicial

while salir:
    print('''Operaciones que puedes realizar:
    1. Consultar saldo
    2. Retirar
    3. Depositar
    4. Salir''')
    opcion = int(input("Escoje una opcion: "))

    if opcion == 1:
        print(f"Tu saldo actual es: Q.{nuevo_saldo}\n")
    elif opcion == 2:
        retiro = int(input("Ingresa el monto a retirar: "))
        if not retiro > saldo_inicial:
            nuevo_saldo = saldo_inicial - retiro
            print(f"Tu saldo es: {nuevo_saldo}\n")
        else:
            print(f"No cuentas con el saldo suficiente. Saldo actual: {nuevo_saldo}\n")

    elif opcion == 3:
        deposito = int(input("Ingresa el monto a depositar: "))
        nuevo_saldo += deposito
        print(f"Tu nuevo saldo es de: Q.{nuevo_saldo}\n")

    elif opcion == 4:
        print(f"Saliendo del ejercito automatico. Hasta pronto!")
        salir = False



