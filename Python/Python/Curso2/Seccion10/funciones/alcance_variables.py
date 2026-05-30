print("*** Alcance de Variables ***")

# Variable gloabl
contador_global = 0

def incrementar_contador():
    # Definimos una variable local
    contador_local = 0

    # Usar variable global
    # incremento la variable global
    global contador_global
    contador_global += 1

    # incremento la variable local
    contador_local += 1

    # imprimir ambos contadores
    print(f"Contador local: {contador_local}")
    print(f"Contador global: {contador_global}\n")


# Llamamos varias veces a la funcion
incrementar_contador()
incrementar_contador()
incrementar_contador()

# Terminando el programa
print(f"Valor varibale global: {contador_global}")







