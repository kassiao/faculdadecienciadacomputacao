altura = float(input("Digite a altura da pessoa: "))
genero = input("Digite o gênero da pessoa (M/F): ")

if genero == "M":
    peso_ideal = (72.7 * altura) - 58
elif genero == "F":
    peso_ideal = (62.1 * altura) - 44.7
else:
    print("Gênero inválido!")
    exit()

print(f"O peso ideal para a altura de {altura:.2f}m e gênero {genero} é: {peso_ideal:.2f}kg")
