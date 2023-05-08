algoritmo maior_numero
var
   num1, num2, num3, maior: real

escreva("Digite o primeiro número: ")
leia(num1)

escreva("Digite o segundo número: ")
leia(num2)

escreva("Digite o terceiro número: ")
leia(num3)

maior <- num1

se num2 > maior entao
   maior <- num2
fimse

se num3 > maior entao
   maior <- num3
fimse

escreva("O maior número é ", maior)

fimalgoritmo
