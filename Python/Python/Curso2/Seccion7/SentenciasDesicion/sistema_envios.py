print("*** Sistema de Envios *** ")

paquete = float(input("Ingrese en kilogramos el peso del paquete: "))
destino = input("El envio del paquete es nacional/internacional? ")

destino = destino.strip().lower() == 'nacional'
TARIFA_NACIONAL = 10
TARIFA_INTERNACIONAL = 20

if not destino == 'nacional':
    costo_total = paquete * TARIFA_INTERNACIONAL
else:
    costo_total = paquete * TARIFA_NACIONAL

print(f"El costo del envio del paquete a ruta {'nacional' if destino else 'internacional'}  es de: Q.{costo_total:.2f}")