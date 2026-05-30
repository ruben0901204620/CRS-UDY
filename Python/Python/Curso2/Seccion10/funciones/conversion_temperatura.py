print("*** Conversion de temperatura ***")


def temparatura():
    dato = float(input("Ingrese la temperatura: "))
    return dato

def temperatura_celsius(temperatura):
    celcius = (temperatura * (9/5)) + 32
    print(f"La temperatura en fahrenheit es: {celcius:.2f}")
    
def temperatura_fahrenheit(temperatura):
    fahrenheit = (temperatura - 32) * (5/9)
    print(f"La temperatura en celsius es: {fahrenheit:.2f}")


def menu_principal():
    while True:
        print('''Operaciones que puedes realizar:
            1. Celsius a Fahrenheit
            2. Fahrenheit a Celsius
            3. Salir''')
        operacion = int(input("Escoge una opcion: "))
        
        if 1 <= operacion <= 3:
            if operacion == 1:
                convertir = temparatura()
                temperatura_celsius(convertir)
            elif operacion == 2:
                convertir = temparatura()
                temperatura_fahrenheit(convertir)
            elif operacion == 3:
                print("Hasta pronto!")
                break
        else:
            print("Opcion incorrecta")
            
if __name__ == "__main__":
    menu_principal()
