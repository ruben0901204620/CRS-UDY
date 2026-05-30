print("*** Potencia de un Numero ***")

def potencia(base, exponente):
    # caso base
    if exponente == 0:
        return 1
    else:
        return base * potencia(base, exponente-1)

print(f"2 elevado a la 3 es: {potencia(2,3)}")
print(f"5 elevado a la 0 es: {potencia(5,0)}")
print(f"4 elevado a la 5 es: {potencia(4,5)}")
