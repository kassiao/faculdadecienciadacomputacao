algoritmo menor_preco
var
   preco1, preco2, preco3: real

escreva("Digite o preço do primeiro produto: ")
leia(preco1)

escreva("Digite o preço do segundo produto: ")
leia(preco2)

escreva("Digite o preço do terceiro produto: ")
leia(preco3)

se preco1 <= preco2 e preco1 <= preco3 entao
   escreva("Compre o primeiro produto")
senao se preco2 <= preco1 e preco2 <= preco3 entao
   escreva("Compre o segundo produto")
senao
   escreva("Compre o terceiro produto")
fimse

fimalgoritmo
