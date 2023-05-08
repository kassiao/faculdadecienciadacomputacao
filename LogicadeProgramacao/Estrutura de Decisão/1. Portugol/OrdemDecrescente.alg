algoritmo ordem_decrescente
var
   num1, num2, num3: inteiro

escreva("Digite o primeiro número: ")
leia(num1)

escreva("Digite o segundo número: ")
leia(num2)

escreva("Digite o terceiro número: ")
leia(num3)

se num1 >= num2 e num1 >= num3 entao
   se num2 >= num3 entao
      escreva(num1, ", ", num2, ", ", num3)
   senao
      escreva(num1, ", ", num3, ", ", num2)
   fimse
senao se num2 >= num1 e num2 >= num3 entao
   se num1 >= num3 entao
      escreva(num2, ", ", num1, ", ", num3)
   senao
      escreva(num2, ", ", num3, ", ", num1)
   fimse
senao
   se num1 >= num2 entao
      escreva(num3, ", ", num1, ", ", num2)
   senao
      escreva(num3, ", ", num2, ", ", num1)
   fimse
fimse

fimalgoritmo
