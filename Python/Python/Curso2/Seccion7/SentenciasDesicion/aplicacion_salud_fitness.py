print("Aplicacion de Salud y Fitness")

# Constantes
META_PASOS_DIARIOS = 10000
CALORIAS_POR_PASO = 0.04 # Valor aprox. kilocalorias

# Pedimos los valores al usuario
nombre_usuario = input("cual es su nombre? ")
pasos_diarios = int(input("Cuantos pasos has camidao hoy? "))

# Verificamos si el usuario alcanzo la meta de pasos diarios
meta_alcanzada = pasos_diarios >= META_PASOS_DIARIOS
meta_alcanzada_txt = 'si' if meta_alcanzada else 'no'

# Calculamos las calorias quemadas
calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO

# Mostramos la informacion
print(f"\nusuario: {nombre_usuario}")
print(f"Pasos dados hoy? {pasos_diarios}")
print(f"Calorias quemadas: {calorias_quemadas}")
print(f"Meta de pasos diario alcanzada: {meta_alcanzada_txt}")
print(f"La meta de pasos diarios es de: {META_PASOS_DIARIOS} pasos")