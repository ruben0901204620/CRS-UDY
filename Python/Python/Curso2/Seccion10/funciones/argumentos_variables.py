print("*** Argumentos Variables ***")

def superheroe_superpoderes(superheroe, nombre, *args):
    print(f"Superheroe: {superheroe} - {nombre} - {args}")

    #Iteramos los superpoderes
    for superpoderes in args:
        print(f"\tSuperpoder: {superpoderes}")


# Llamar la funcion
superheroe_superpoderes('Spiderman', 'Peter parker', 'instinto aragnido', 'Telarania')
superheroe_superpoderes('Iroman', 'Tony Stark', 'Armadura', 'playBoy', 'Filantropo', 'millonario')

# Es opcional enviar argumentos variables
superheroe_superpoderes('mi vecino', 'Juan Perez')
