print("*** Imprimir Detalles de una Persona usando Kwargs ***")

# Funcion que acepta argumentos varoables en forma de llava-valor dict
def imprimir_detalle_persona(**kwargs):
    print("\nValores recibidos: ")
    for llave, valor in kwargs.items():
        print(f"{llave}:{valor}")

# Llamamos a la fucion
imprimir_detalle_persona(nombre='Karla', edad=30, ciudad='Guatemala')
imprimir_detalle_persona(nombre='Carlos', edad=28, ciudad='Guatemala', puesto='Gerente')