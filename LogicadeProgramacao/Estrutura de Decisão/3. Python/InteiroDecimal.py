import math

num = float(input("Digite um número: "))

arredondado = round(num, 1)

if num == arredondado:
    print("O número é inteiro")
else:
    print("O número é decimal")
