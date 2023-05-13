Algoritmo InteiroDecimal
   escreva("Digite um número: ")
   leia(num)
   
   arredondado = arredonda(num, 1)
   
   se num = arredondado entao
      escreva("O número é inteiro")
   senao
      escreva("O número é decimal")
   fimse
FimAlgoritmo
