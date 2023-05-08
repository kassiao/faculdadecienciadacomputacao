algoritmo "media aluno"
var
   nota1, nota2, media: real

escreva("Digite a primeira nota: ")
leia(nota1)

escreva("Digite a segunda nota: ")
leia(nota2)

media <- (nota1 + nota2) / 2

se media = 10 entao
   escreva("Aprovado com Distinção.")
senao se media >= 7 entao
   escreva("Aprovado.")
senao
   escreva("Reprovado.")
fimse

fimalgoritmo
