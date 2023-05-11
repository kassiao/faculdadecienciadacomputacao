a = float(input("Digite o valor de a: "))
if a == 0:
    print("O valor de a deve ser diferente de zero para que a equação seja do segundo grau.")
else:
    b = float(input("Digite o valor de b: "))
    c = float(input("Digite o valor de c: "))
    delta = b ** 2 - 4 * a * c

if delta < 0:
    print("A equação não possui raízes reais.")
elif delta == 0:
    raiz = -b / (2 * a)
    print("A equação possui apenas uma raiz real: ", raiz)
else:
    raiz1 = (-b + delta ** 0.5) / (2 * a)
    raiz2 = (-b - delta ** 0.5) / (2 * a)
    print("A equação possui duas raízes reais:")
    print("Raiz 1 = ", raiz1)
    print("Raiz 2 = ", raiz2)   