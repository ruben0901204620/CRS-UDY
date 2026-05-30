
name = 'Ruben Lopez'
curse = 'Curso de python'
name_upper = name.upper()
print(name == name_upper)
print(name_upper)
print(name)
print(curse.lower())

words = 'curso de python'
print(words.capitalize())
print(words.title())

words = '    hola Ruben   '
print(words.strip())
print(words.lstrip())
print(words.rstrip())

text = 'hola java'
new_text = text.replace('java', 'python')
print(text)
print(new_text)

text = 'Ruben,Lopez,Python,Java,Angular'
data_list = text.split(',')
print(data_list[2])
print(data_list[4])
print(data_list)

data = ['Ruben2', 'Lopez2', 'Python2', 'Java2', 'Angular2']
text = '/'.join(data)
print(text)

text = 'Hola, Ruben como estas!'
print(text.find('Ruben'))
print(text.index('como'))
print(text.startswith('Hola')) # devuele booleano
print(text.endswith("!"))

number = '1234'
decimal = '1234.45'
text = 'python'
mix = 'python3'
print(number.isnumeric())
print(number.isdigit())
print(decimal.isdecimal())
print(text.isalnum())
print(mix.isalpha())
print(text.isalpha())

text = '   Hola Ruben como estas, bienvenido al curso de python!    '
text_clean = text.strip().capitalize().title()
print(text_clean)

new_text = text_clean.replace('Curso De Python', 'Cruso de python 3')
print(new_text)

words = new_text.split()
print(words)

