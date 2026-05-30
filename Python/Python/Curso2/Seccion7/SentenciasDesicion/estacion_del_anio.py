print("*** Estacion del Anio ***")

# Pedir al usuario un mes
mes = int(input("Ingrese un mes en valor numerico: "))

# Mostrar la estacion del anio
if mes == 1 or mes == 2 or mes == 12:
    print("Invierno")
elif mes == 3 or mes == 4 or mes == 5:
    print("Primavera")
elif mes == 6 or mes == 7 or mes == 8:
    print("Verano")
elif mes == 9 or mes == 10 or mes == 11:
    print("Otonio")
else:
    print("Estacion Desconocido")

