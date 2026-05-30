
name = 'Ruben'
age = 24
text = f'Me llamo {name} y tengo {age} años '
print(text)

a = 5
b = 3
print(f"La suma de {a} y {b} es: {a + b}")

result = f'El precio es { a * b} quetzales.'
print(result)

price = 50
text = f'Este producto es muy {'Caro' if price > 50 else 'Barato'} '
print(text)

fruit = 'Manzanas'
text = f'Me encantan las {fruit.upper()}'
print(text)

price = 59
text = f'El precio es {price} quetzales'
print(text.format(price = 49))
text = f'Ofeta por solo {price:.2f} quetzales'
print(text.format(price = 60))


