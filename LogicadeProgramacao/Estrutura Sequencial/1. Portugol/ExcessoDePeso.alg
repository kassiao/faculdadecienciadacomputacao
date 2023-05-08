algoritmo excesso_de_peso

var
   peso, excesso, multa: real

inicio
   escreva("Digite o peso dos peixes pescados (em kg): ")
   leia(peso)
   
   excesso <- peso - 50
   
   se excesso > 0 entao
      multa <- excesso * 4
      escreva("João deverá pagar uma multa de R$ ", multa, " pelo excesso de ", excesso, "kg de peixes.")
   senao
      escreva("João não precisa pagar multa. O peso de peixes pescados está dentro do limite permitido.")
   fimse
fimalgoritmo
