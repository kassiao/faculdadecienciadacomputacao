Algoritmo NumCentenasDezenasUnidades
   escreva("Digite um número inteiro menor que 1000: ")
   leia(numero)
   
   centenas <- numero / 100
   resto <- numero % 100
   dezenas <- resto / 10
   unidades <- resto % 10
   
   se centenas > 0 entao
      escreva(centenas, " centena(s)")
      se dezenas > 0 e unidades > 0 entao
         escreva(", ")
      senao se dezenas > 0 ou unidades > 0 entao
         escreva(" e ")
      fimse
   fimse
   
   se dezenas > 0 entao
      escreva(dezenas, " dezena(s)")
      se unidades > 0 entao
         escreva(" e ")
      fimse
   fimse
   
   se unidades > 0 entao
      escreva(unidades, " unidade(s)")
   fimse
FimAlgoritmo
