print("*** Regresar una tupla de valores desde una funcion ***")

# Definir la funcion
def personas_mayusculas(nombre, apellido, edad):
    print(f"Esta funcion regresa varios valores (tuplas)")
    return (nombre.upper(), apellido.upper(), edad)

# programa principal
nombre, apellido, edad = personas_mayusculas('Sandra', 'Jimenez' ,42)
print(f"Resultado Persona: nombre='{nombre}', apellido='{apellido}', edad={edad}")
