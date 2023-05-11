algoritmo media_notas

var
   nota1, nota2, media: real
   conceito: caractere

inicio
   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)

   media <- (nota1 + nota2) / 2

   se media >= 9.0 entao
      conceito <- "A"
   senao se media >= 7.5 entao
      conceito <- "B"
   senao se media >= 6.0 entao
      conceito <- "C"
   senao se media >= 4.0 entao
      conceito <- "D"
   senao
      conceito <- "E"
   fimse

   escreva("Notas: ", nota1, " e ", nota2, "\n")
   escreva("Média: ", media:1:1, "\n")
   escreva("Conceito: ", conceito, "\n")

   se conceito = "A" ou conceito = "B" ou conceito = "C" entao
      escreva("APROVADO")
   senao
      escreva("REPROVADO")
   fimse
