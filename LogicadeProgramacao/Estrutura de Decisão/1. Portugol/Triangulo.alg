algoritmo "triangulo"
var
   lado1, lado2, lado3: real
inicio
   escreva("Digite os três lados do triângulo: ")
   leia(lado1, lado2, lado3)

   se (lado1 + lado2 > lado3) e (lado1 + lado3 > lado2) e (lado2 + lado3 > lado1) entao
      se (lado1 = lado2) e (lado2 = lado3) entao
         escreva("Triângulo Equilátero")
      senao se (lado1 = lado2) ou (lado1 = lado3) ou (lado2 = lado3) entao
         escreva("Triângulo Isósceles")
      senao
         escreva("Triângulo Escaleno")
      fimse
   senao
      escreva("Os valores informados não formam um triângulo.")
   fimse
fimalgoritmo
