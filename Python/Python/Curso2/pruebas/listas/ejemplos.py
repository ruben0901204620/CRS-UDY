import random
#--------------- Ejercicios Listas ---------------

print('''##################################################                         
##################################################
############### EJERCICIOS DE LISTAS #############
###############     NIVEL FACIL      #############
##################################################
##################################################
''')
#1. Crea una lista con 4 nombres e imprime el segundo.

nombres = ['Edgar', 'Raul', 'Pedro', 'omar']
print(f"segundo nombre por indice es: {nombres[1]}")


print("---------------------------------------")
#2️. Agrega el número 100 al final de una lista [10, 20, 30].

numeros = [10, 20, 30]
numeros.append(100)
print(f"Agregar numero 100 al final de la lista --> {numeros}")


print("---------------------------------------")
#3️. Crea una lista vacía y usa append() para agregar 3 elementos.

mi_lista = []
agregar = 0

#for agregar in range(3):
#    if agregar != 3:
#        elemento = input(f"Ingresa el elemento {agregar + 1} a la lista: ")
#        mi_lista.append(elemento)

#print(f"Se han agregado elementos a la lista --> {mi_lista}") 
    

print("---------------------------------------")
#4️. Dada la lista [5, 10, 15], imprime el último elemento.
numeros = [5, 10, 15]
print(f"Imprimiendo el ultimo elemento de la lista: {numeros[2]}")


print("---------------------------------------")
#5. Crea una lista con 5 números y muestra su longitud con len().

numeros = [10, 20, 30, 40, 500]
print(f"La longitud de la lista es de: {len(numeros)}")

print("\n\n\n")
print('''##################################################                         
##################################################
############### EJERCICIOS DE LISTAS #############
###############     NIVEL MEDIO      #############
##################################################
##################################################
''')

#1️. Pide al usuario 5 números y guárdalos en una lista, luego imprime el mayor.

numeros = []
agregar = 0

#print(f"Ingrese 5 numeros.")
#for agregar in range(5):
#    agregar_numero = int(input(f"{agregar + 1}. Ingresa un numero: "))
#    numeros.append(agregar_numero)

#numMayor = numeros[0]

#for recorrer in numeros:
#    if not numMayor > recorrer:
#        numMayor = recorrer

#print(f"El numero mayor es: {numMayor}")

print("---------------------------------------")
#2️. Dada la lista [8, 3, 5, 2, 10], ordénala de menor a mayor.
#[8, 3, 5, 2, 10]
#[3, 8, 5, 2, 10]
#[3, 5, 8, 2, 10]
#[3, 5, 2, 8, 10]
#[3, 5, 2, 8, 10]
#[3, 2, 5, 8, 10]
#[2, 3, 5, 8, 10]


numeros = [8, 3, 5, 2, 10]

for i in range(len(numeros)-1):
    for j in range(len(numeros ) -1):
        if numeros[j] > numeros[j + 1 ]:
            numeros[j], numeros[j+1] =  numeros[j+1], numeros[j]


print(f"El numero mayor es: {numeros}")


#3️. Combina dos listas: [1, 2] y [3, 4].
lista1, lista2 = [1, 2], [3, 4]
lista3 = []

for elemento1 in lista1:
    lista3.append(elemento1)
    if len(lista3) == len(lista2):
        for elemento2 in lista2:
            lista3.append(elemento2)


print(f"union de {lista1} y {lista2} --> {lista3}")

#4️. Recorre una lista de nombres y muestra solo los que tienen más de 4 letras.

nombres = ['Ruben', 'Omar', 'Samuel', 'Raul','karen', 'Ivan']
nombres2 = []

for indice in range(len(nombres)):
    if len(nombres[indice]) > 4:
        nombres2.append(nombres[indice])

print(nombres2)
    

#5️. Copia una lista y modifica el primer elemento de la copia.
nombres = ['Ruben', 'Omar', 'Samuel', 'Raul','karen', 'Ivan']
copia_nombres = nombres

copia_nombres[0] = 'Guillermo'
print(copia_nombres)

print("\n\n\n")
print('''##################################################                         
##################################################
############### EJERCICIOS DE LISTAS #############
###############     NIVEL DIFICIL    #############
##################################################
##################################################
''')

#1️. Genera una lista de 10 números aleatorios entre 1 y 100 y muestra los pares.
numeros_aleatorios = []

for indice in range(10):
    numero = random.randint(1,100)
    numeros_aleatorios.append(numero)

pares = [n for n in numeros_aleatorios if n % 2 == 0]
print(f"Lista de numeros --> {numeros_aleatorios}")
print(f"Numero pares --> {pares}")


#2️. Invierte una lista sin usar [::-1] ni reverse().
nombres = ['Edgar', 'Raul', 'Pedro', 'omar']

for reverse_ in range(len(nombres)):
    print(reverse_)
    


#3️. Elimina los duplicados de una lista sin usar set().
#4️. Dada una lista de palabras, crea una lista con las longitudes de cada palabra.
#5️. Recorre una lista de números y crea una nueva con los números que son primos.





