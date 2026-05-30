from decimal import Decimal, getcontext

age = 30
big_int = 1234567890123456789
decimal_number = 3.415
print(age)
print(type(age))

print(big_int)
print(type(big_int))

print(decimal_number)
print(type(decimal_number))

number_complex = 2 + 3j
print(type(number_complex))

getcontext().prec = 10
number1 = Decimal('12.1223456789')
number2 = Decimal('2.1')
result = number1 * number2
print(result)

number = 42
decimal_number = float(number)
integer_number = int(3.1415)
print(decimal_number)
print(integer_number)


