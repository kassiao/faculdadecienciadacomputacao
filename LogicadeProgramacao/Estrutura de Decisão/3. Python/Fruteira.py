qtdMorangos = float(input("Digite a quantidade (em Kg) de morangos: "))
qtdMacas = float(input("Digite a quantidade (em Kg) de maças: "))

pesoTotal = qtdMorangos + qtdMacas
quantidade_morango = float(input("Digite a quantidade (em Kg) de morangos adquirida: "))
quantidade_maca = float(input("Digite a quantidade (em Kg) de maçãs adquirida: "))

preco_morango = 0
preco_maca = 0

if quantidade_morango <= 5:
    preco_morango = 2.5
else:
    preco_morango = 2.2

if quantidade_maca <= 5:
    preco_maca = 1.8
else:
    preco_maca = 1.5

total_sem_desconto = (quantidade_morango * preco_morango) + (quantidade_maca * preco_maca)

if quantidade_morango + quantidade_maca > 8 or total_sem_desconto > 25:
    total_com_desconto = total_sem_desconto * 0.9
    print("O valor total da compra com desconto é R$ {:.2f}".format(total_com_desconto))
else:
    print("O valor total da compra é R$ {:.2f}".format(total_sem_desconto))




