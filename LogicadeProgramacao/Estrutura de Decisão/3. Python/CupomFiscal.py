print("=== Hipermercado Tabajara ===")
print("Tipos de carne em promoção:")
print("1 - File Duplo")
print("2 - Alcatra")
print("3 - Picanha")

tipo_carne = int(input("Digite o número do tipo de carne desejado: "))
quantidade = float(input("Digite a quantidade desejada (em kg): "))

if tipo_carne == 1:
    preco_kg = 4.90
    tipo = "File Duplo"
elif tipo_carne == 2:
    preco_kg = 5.90
    tipo = "Alcatra"
elif tipo_carne == 3:
    preco_kg = 6.90
    tipo = "Picanha"
else:
    print("Opção inválida, programa encerrado.")
    exit()

if quantidade <= 5:
    preco_total = preco_kg * quantidade
else:
    preco_total = 5 * preco_kg + (quantidade - 5) * (preco_kg + 0.80) # acima de 5 kg, acrescenta R$ 0,80 por kg extra

forma_pagamento = input("Digite a forma de pagamento (1 - Dinheiro / 2 - Cartão Tabajara): ")
if forma_pagamento == "2":
    desconto = 0.05 * preco_total
else:
    desconto = 0

print("\nCupom fiscal:")
print("Tipo de carne:", tipo)
print("Quantidade:", quantidade, "kg")
print("Preço total: R$ %.2f" % preco_total)
print("Forma de pagamento:", "Dinheiro" if forma_pagamento == "1" else "Cartão Tabajara")
print("Desconto: R$ %.2f" % desconto)
print("Valor a pagar: R$ %.2f" % (preco_total - desconto))
