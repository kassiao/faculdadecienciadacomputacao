nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3) / 3

if media == 10:
    print(f"Aprovado com Distinção - Média {media}")
elif media >= 7:
    print(f"Aprovado - Média {media}")
else:
    print(f"Reprovado - Média {media}")
