num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

operacao = input("Qual operação deseja realizar? (+, -, *, /): ")

resultado = 0

if operacao == '+':
    resultado = num1 + num2
    print(f"O resultado de {num1:.2f} + {num2:.2f} é {resultado:.2f}")

elif operacao == '-':
    resultado = num1 - num2
    print(f"O resultado de {num1:.2f} - {num2:.2f} é {resultado:.2f}")

elif operacao == '*':
    resultado = num1 * num2
    print(f"O resultado de {num1:.2f} * {num2:.2f} é {resultado:.2f}")

elif operacao == '/':
    if num2 != 0:
        resultado = num1 / num2
        print(f"O resultado de {num1:.2f} / {num2:.2f} é {resultado:.2f}")
    else:
        print("Não é possível dividir por zero.")

else:
    print("Operação inválida.")

if resultado % 2 == 0:
    print("O resultado é par.")
else:
    print("O resultado é ímpar.")

if resultado >= 0:
    print("O resultado é positivo.")
else:
    print("O resultado é negativo.")

if resultado.is_integer():
    print("O resultado é inteiro.")
else:
    print("O resultado é decimal.")
