Algoritmo Operacoes
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número: ")
   leia(num2)
   
   escreva("Qual operação você deseja realizar? (+, -, *, /): ")
   leia(operacao)
   
   // realização da operação
   se operacao = "+" entao
      resultado = num1 + num2
   senao se operacao = "-" entao
      resultado = num1 - num2
   senao se operacao = "*" entao
      resultado = num1 * num2
   senao se operacao = "/" entao
      resultado = num1 / num2
   senao
      escreva("Operação inválida")
      resultado = 0
   fimse
   
   se resultado % 2 = 0 entao
      escreva("O resultado é par")
   senao
      escreva("O resultado é ímpar")
   fimse
   
   se resultado > 0 entao
      escreva(" e positivo")
   senao se resultado < 0 entao
      escreva(" e negativo")
   fimse
   
   resultadoArredondado = arredonda(resultado, 1)
   
   se resultado = resultadoArredondado entao
      escreva(" e inteiro.")
   senao
      escreva(" e decimal.")
   fimse
FimAlgoritmo
