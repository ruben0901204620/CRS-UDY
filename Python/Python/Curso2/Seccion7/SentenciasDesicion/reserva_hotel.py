print("*** Sistema de Reserva en Hotel ***")

cliente = input("Nombre del cliente: ")
dias_estadia = int(input("Dias de estadia: "))
vista_mar = input("Con vista al mar (si/no)?  ")

vista_mar = vista_mar.strip().lower() == 'si'

if not vista_mar:
    costo_total = dias_estadia * 150.50
else:
    costo_total = dias_estadia * 190.50

print("\n------------ Detalles de la Reservacion ------------")
print(f"Cliente: {cliente}")
print(f"Dias de estadia: {dias_estadia}")
print(f"Costo total: Q.{costo_total:.2f}")
print(f"Habitacion con vista al mar: {'si' if vista_mar else 'no'}")
