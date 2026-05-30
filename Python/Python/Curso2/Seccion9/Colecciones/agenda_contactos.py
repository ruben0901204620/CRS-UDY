print("*** Agenda de Contactos ***")

agenda = {
    'Carlos': {
        'telefono': '46738892',
        'email': 'carlos@gmail.com',
        'direccion': 'calle principal 132'
    },

    'Maria': {
        'telefono': '76589436',
        'email': 'maria@gmail.com',
        'direccion': 'avenida central 456'
    },

    'Pedro': {
        'telefono': '15374937',
        'email': 'pedro@gmail.com',
        'direccion': 'plaza mayor 789'
    },

}

print(agenda)

# Acceder a la informacion de un contacto en especifico
print(f'''Informacion del contacto de Maria:
    Telefono: {agenda['Maria']['telefono']}
    Email: {agenda['Maria']['email']}
    Direccion: {agenda.get('Maria').get('direccion')}
''')

# Agregar un nuevo contacto
agenda['Ana'] = {
        'telefono': '98456155',
        'email': 'ana@gmail.com',
        'direccion': 'calle salvador diaz 321'
}

print(agenda)

# Eliminar un contacto existente
agenda.pop('Pedro')
del agenda['Carlos']
print(agenda)

# Mostrar los contactos de la agenda
print(f"\nContactos en la Agenda")
for nombre, detalles in agenda.items():
    print(f'''Nombre: {nombre}in
        Telefono: {detalles.get('telefono')}
        Email: {detalles.get('email')}
        Direccion: {detalles['direccion']}
    
    ''')