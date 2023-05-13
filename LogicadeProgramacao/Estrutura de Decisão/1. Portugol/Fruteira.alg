Algoritmo "Fruteira"

Var
qtdMorangos, qtdMacas, pesoTotal : real
valorMorango, valorMaca, total, desconto : real

Inicio
escreva("Digite a quantidade (em Kg) de morangos: ")
leia(qtdMorangos)
escreva("Digite a quantidade (em Kg) de maças: ")
leia(qtdMacas)

pesoTotal <- qtdMorangos + qtdMacas

se qtdMorangos <= 5 entao
valorMorango <- qtdMorangos * 2.5
senao
valorMorango <- qtdMorangos * 2.2

se qtdMacas <= 5 entao
valorMaca <- qtdMacas * 1.8
senao
valorMaca <- qtdMacas * 1.5

total <- valorMorango + valorMaca

se pesoTotal > 8 ou total > 25 entao
desconto <- total * 0.1
total <- total - desconto

escreva("O valor total a ser pago é de: R$ ", total)
Fim