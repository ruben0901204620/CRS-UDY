print("*** Generador de Email ***")
nombre = input("Igrese su nombre completo: ")
apellido = input("Ingrese su apellido: ")
nombre_empresa = input("Ingrese el nombre de la empresa: ")
extension_dominio = input("Extension de dominio de tu empresa? ")

nombre = nombre.lower().replace(" ", ".")
apellido = apellido.lower().replace(" ", ".")
nombre_empresa = nombre_empresa.lower().replace(" ", "")

print("---------------------")
print("Se ha generado el email")
print(f"{nombre}.{apellido}@{nombre_empresa}.{extension_dominio.lower()}")
print("FELICIDADES!!!")
