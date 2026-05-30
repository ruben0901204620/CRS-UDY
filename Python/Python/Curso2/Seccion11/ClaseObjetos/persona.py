# Deficicion de una clase

class Persona:
   #Contructor
   def __init__(self, nombre, apellido):
       self.nombre = nombre
       self.apellido = apellido

       # def inicializar_persona(self, nombre, apellido):
       #    # Atributos de la clase
       #    self.nombre = nombre
       #    self.apellido = apellido

   def mostrar_persona(self):
       print(f'''Datos de la persona:
       Nombre: {self.nombre}
       apellido: {self.apellido}
       ''') 

# Creacion de objetos
if __name__ == '__main__':
    persona1 = Persona('Ruben', 'Lopez') # Se crea un objeto vacion en memoria
    #persona1.inicializar_persona('Ruben', 'Lopez')
    persona1.mostrar_persona()
    print(f'Dir. memoria p1: {id(persona1)}')
    print(f'dir. memmoria hex person1: {hex(id(persona1))}')

    # Creacion de un segundo objeto
    persona2 = Persona('Armando', 'Luch') # Se creaun un objeto vacio en memoria
    #persona2.inicializar_persona('Armando', 'Luch')
    persona2.mostrar_persona()
