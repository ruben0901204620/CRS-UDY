# *args - argumentos - tupla
# **args - keyword arguments(key, value) como un diccionario

print("*** Argumentos variables en Forma de Diccionario ***")

def superheroe_superpoderes(nombre, *args, **kwargs):
    print(f"Superheroe: {nombre} - {args} - mas info: {kwargs}")

# Llamamos la funcion
superheroe_superpoderes('Spiderman', 'Instinto Aracnido', edad=17, empresa='Marvel')
superheroe_superpoderes('Iroman', 'Armadura', 'PlayBoy', edad=45)

# Es opcional enviar argumentos variables
superheroe_superpoderes('mi vecino',edad=38, personalidad='buena onda')