print("*** calculadora con Funciones ***")
def pedir_valores():
    num1 = float(input("Ingrese el primer numero: "))
    num2 = float(input("Ingrese el segundo numero: "))
    return num1, num2

def menu_principal():
    while True: 
        print('''Operaciones que puedes realizar:
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division
            5. Salir''')
        operacion = int(input("Escoge una opcion: "))
        
        if 1 <= operacion <= 5:
            if operacion == 1:
                num1, num2 = pedir_valores()
                print(f"El resutado de la suma es: {num1+num2}")
            elif operacion == 2:
                num1, num2 = pedir_valores()
                print(f"El resultado de la resta es: {num1-num2}")
            elif operacion == 3:
                num1, num2 = pedir_valores()
                print(f"el resultado de la multiplicacion es: {num1*num2}")
            elif operacion == 4:
                num1, num2 = pedir_valores()
                print(f"el resultado de la division es: {num1/num2}")
            elif operacion == 5:
                print("Hasta pronto!")
                break
        else:
            print("Opcion incorrecta")
            
            
if __name__ == "__main__":
    menu_principal()
    
    


    
                                                          