algoritmo peso_ideal

var
   altura, peso_ideal: real
   genero: caractere

inicio
   escreva("Digite a altura da pessoa: ")
   leia(altura)
   
   escreva("Digite o gênero da pessoa (M/F): ")
   leia(genero)
   
   se genero = "M" entao
      peso_ideal <- (72.7 * altura) - 58
   senao se genero = "F" entao
      peso_ideal <- (62.1 * altura) - 44.7
   fimse
   
   escreva("O peso ideal para a altura de ", altura, "m e gênero ", genero, " é: ", peso_ideal, "kg")
fimalgoritmo
