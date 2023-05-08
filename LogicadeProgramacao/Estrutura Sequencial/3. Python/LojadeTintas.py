import math

cobertura = 6  

preco_lata = 80.0  
preco_galao = 25.0  

area = float(input("Digite o tamanho da área a ser pintada, em metros quadrados: "))
qtd_tinta = math.ceil(area / cobertura * 1.1) 

latas = qtd_tinta // 18
resto = qtd_tinta % 18
if resto > 0:
    galoes = math.ceil(resto / 3.6)
else:
    galoes = 0

preco_total_latas = latas * preco_lata
preco_total_galoes = galoes * preco_galao
preco_total_misto = math.ceil(qtd_tinta / 18) * preco_lata  

print(f"Quantidade de tinta necessária: {qtd_tinta:.1f} litros")
print(f"Opção 1: {latas} latas de tinta, preço total de R$ {preco_total_latas:.2f}")
print(f"Opção 2: {galoes} galões de tinta, preço total de R$ {preco_total_galoes:.2f}")
print(f"Opção 3: {latas} latas e {galoes} galões de tinta, preço total de R$ {preco_total_misto:.2f}")
