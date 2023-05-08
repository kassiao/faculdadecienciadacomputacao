Algoritmo "Operações matemáticas"
Var
   num1, num2: inteiro
   numReal: real
   resultado1, resultado2, resultado3: real
Inicio
   Escreva("Digite dois números inteiros: ")
   Leia(num1, num2)
   Escreva("Digite um número real: ")
   Leia(numReal)
   
   resultado1 <- (2 * num1) * (num2 / 2)
   resultado2 <- (3 * num1) + numReal
   resultado3 <- numReal ^ 3
   
   Escreva("O produto do dobro do primeiro com metade do segundo é: ", resultado1)
   Escreva("A soma do triplo do primeiro com o terceiro é: ", resultado2)
   Escreva("O terceiro elevado ao cubo é: ", resultado3)
Fim
