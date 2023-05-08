algoritmo "Peso Ideal"

var
   altura, peso_ideal: real

inicio
   escreva("Digite a altura da pessoa: ")
   leia(altura)
   
   peso_ideal <- (72.7 * altura) - 58
   
   escreva("O peso ideal para a altura de ", altura, "m é: ", peso_ideal, "kg")
fimalgoritmo
