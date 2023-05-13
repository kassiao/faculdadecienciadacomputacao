Algoritmo MediaAluno
   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   escreva("Digite a terceira nota: ")
   leia(nota3)
   
   media <- (nota1 + nota2 + nota3) / 3
   
   se media = 10 entao
      escreva("Aprovado com Distinção - Média ", media)
   senao se media >= 7 entao
      escreva("Aprovado - Média ", media)
   senao
      escreva("Reprovado - Média ", media)
   fimse
FimAlgoritmo
