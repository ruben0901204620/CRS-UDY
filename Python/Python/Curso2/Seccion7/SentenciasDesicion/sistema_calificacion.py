print("*** Sistema de Calificacion ***")

# Pedir al usaurio ingresar calificaciones
calificacion = float(input("Ingrese una calificacion entre 1 y 10: "))

# Convertir calificacion numerica a letra, dependiendo de nota
letra = None

if 9 <= calificacion <= 10:
    letra = 'A'
elif 8 <= calificacion < 9:
    letra = 'B'
elif 7 <= calificacion < 8:
    letra = 'C'
elif 6 <= calificacion < 7:
    letra = 'D'
elif 0 <= calificacion < 6:
    letra = 'F'
else:
    letra = 'calificacion incorrecta'

# Imprimir resultado
print(f"Calificacion {calificacion} es equivalente a {letra}")