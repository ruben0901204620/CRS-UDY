#  Generador de Email

nombre_completo = ' Ruben Armando Lopez'
nombre_usuario = nombre_completo.lower().strip()
nombre_usuario = nombre_usuario.replace(' ', '.')



nombre_empresa = 'Global Mentoring'
dominio = '.com.gt'
emial_personalizado = f'@{nombre_empresa.lower().replace(' ', '')}{dominio.lower()} '


print("*** Generador de Email ***")
print(f'Nombre Usuario: {nombre_completo}')
print(f'Nombre perzonalidado: {nombre_usuario}')
print()
print(f'Nombre empresa: {nombre_empresa}')
print(f'Estension de dominio: {dominio}')
print(f'Domino de email normalizado: {emial_personalizado}')
print()
print(f'Email final generado: {nombre_usuario}{emial_personalizado}')



