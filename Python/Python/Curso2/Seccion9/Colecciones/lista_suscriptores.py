print("*** Lista de Suscriptores ***")

#Definimos el set inicial
# suscriptores = {} # aqui se define un diccionario vacio
suscriptores = set()

numero_suscriptores = int(input("Proporciona el numero de suscriptores iniciales: "))
for _ in range(numero_suscriptores ):
    suscriptores.add(input("Nuevo suscriptor (email): "))

print(f"Lista de suscriptores inicial: {suscriptores}")

# Verificar si un nuevo suscriptor ya esta en la lista
nuevo_suscriptor = input("Proporciona el nuevo suscriptor: ")
if nuevo_suscriptor in suscriptores:
    print(f"El nuevo suscrptor ya esta en la lista {nuevo_suscriptor}")
else:
    suscriptores.add(nuevo_suscriptor)
    print(f"El nuevo suscriptor se ha agregado a la lista {nuevo_suscriptor}")
print(f"Lista de suscriptores: {suscriptores}")

# Eliminar un suscriptor
suscriptor_eliminar = input("Proporciona el suscriptor a eliminar: ")
suscriptores.remove(suscriptor_eliminar)
print(f"El suscriptor {suscriptor_eliminar} se ha eliminado de la lista")
print(f"Lista de suscriptores: {suscriptores}")

# Verificar la cantidad total de suscriptores
print(f"Cantidad total de suscrptores: {len(suscriptores)}")

# Mostrar todos los suscriptores
print("--- Lista de Suscriptores ---")
for suscriptor in suscriptores:
    print(f"- {suscriptor}")

