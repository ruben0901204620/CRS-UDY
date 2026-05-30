print("*** Calculadora en Python ***")

salir = False

while not salir:
    print('''
    Operaciones que puedes realizar:
    1. Suma
    2. Resta
    3. Multiplicacion
    4. Division
    5. Salir''')
    opcion = int(input("Escoja una opcion: "))
    if opcion == 1:
        numero1 = float(input("Dame el valor 1:"))
        numero2 = float(input("Dame el valor 2:"))

        suma = numero1 + numero2
        print(f"El resultado de la suma es: {suma}")
    elif opcion == 2:
        numero1 = float(input("Dame el valor 1:"))
        numero2 = float(input("Dame el valor 2:"))

        resta = numero1 - numero2
        print(f"El resultado de la resta es: {resta}")
    elif opcion == 3:
        numero1 = float(input("Dame el valor 1:"))
        numero2 = float(input("Dame el valor 2:"))

        multiplicacion = numero1 * numero2
        print(f"El resultado de la multiplicacion es: {multiplicacion}")
    elif opcion == 4:
        numero1 = float(input("Dame el valor 1:"))
        numero2 = float(input("Dame el valor 2:"))

        disivion = numero1 / numero2
        print(f"El resultado de la disivion es: {disivion:.2f}")
    elif opcion == 5:
        print("Saliendo del programa de Calculadora. Hasta pronto!")
        salir = True
    else:
        print("Opcion incalida, selecciona otra opcion...")