print("*** Calculadora Pago con Impuesto ***")


def monto_impuesto(pago_sin_impuesto, impuesto):
    pago_total = 0 
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100) 
    return pago_total

pago = float(input("Proporcione el pago sin impuesto: "))
monto = float(input("Proporcione el monto del impuesto: "))

print(f"Pago con impuesto: {monto_impuesto(pago, monto)}")
