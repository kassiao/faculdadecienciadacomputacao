area_pintar = float(input("Digite o tamanho da área a ser pintada em metros quadrados: "))

# Cálculo da quantidade de tinta e latas necessárias
litros_tinta = area_pintar / 3
latas_tinta = int(litros_tinta / 18) + (1 if litros_tinta % 18 != 0 else 0)

# Cálculo do preço total
preco_total = latas_tinta * 80.0

# Saída de dados
print(f"Serão necessárias {latas_tinta} latas de tinta")
print(f"O preço total é R$ {preco_total:.2f}")
