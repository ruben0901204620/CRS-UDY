print("*** Sistema de Descuentos ***")

compra = int(input("¿Cuál es el monto de tu compra? "))
miembro = input("¿Eres miembro de la tienda? (sí/no): ").strip().lower()

if miembro == 'si':
    if compra >= 1000:
        descuento = compra * 0.10
    else:
        descuento = compra * 0.05
        compra_descuento_final = compra - descuento
        print(f"Felicidades, has obtenido un descuento del {int(descuento / compra * 100)}%")
        print(f"Monto de la compra: Q.{compra:.2f}")
        print(f"Monto del descuento: Q.{descuento:.2f}")
        print(f"Monto final de la compra con descuento: Q.{compra_descuento_final}")
else:
    print("No obtuviste ningún tipo de descuento")
    print("Te invitamos a hacerte miembro de la tienda")
    print(f"Monto final de la compra: Q.{compra}")






