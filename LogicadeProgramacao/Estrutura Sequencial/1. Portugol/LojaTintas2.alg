Algoritmo "Loja de Tintas"

inteiro area
inteiro qtd_latas
inteiro qtd_galoes
inteiro qtd_latas_misturadas
inteiro qtd_galoes_misturados
inteiro folga
real preco_latas
real preco_galoes
real preco_latas_misturadas
real preco_galoes_misturados


escreva("Digite a área a ser pintada em metros quadrados: ")
leia(area)

folga = ceil(area * 0.1)
qtd_latas = ceil(folga / 18)
qtd_galoes = ceil(folga / 3.6)
qtd_latas_misturadas = floor(qtd_latas / 3)
qtd_galoes_misturados = ceil((folga % 18) / 3.6)

preco_latas = qtd_latas * 80.0
preco_galoes = qtd_galoes * 25.0
preco_latas_misturadas = qtd_latas_misturadas * 80.0 + qtd_galoes_misturados * 25.0

escreva("Opção 1: Comprar apenas latas de 18 litros\n")
escreva("Quantidade de latas: ", qtd_latas, "\n")
escreva("Preço total: R$ ", preco_latas, "\n\n")

escreva("Opção 2: Comprar apenas galões de 3,6 litros\n")
escreva("Quantidade de galões: ", qtd_galoes, "\n")
escreva("Preço total: R$ ", preco_galoes, "\n\n")

escreva("Opção 3: Misturar latas e galões\n")
escreva("Quantidade de latas: ", qtd_latas_misturadas, "\n")
escreva("Quantidade de galões: ", qtd_galoes_misturados, "\n")
escreva("Preço total: R$ ", preco_latas_misturadas, "\n")

FimAlgoritmo