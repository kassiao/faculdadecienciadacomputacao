algoritmo "verifica_data_valida"
var
   dia, mes, ano: inteiro

inicio
   escreva("Digite uma data no formato dd/mm/aaaa: ")
   leia(dia, "/", mes, "/", ano)

   se ((dia >= 1) e (dia <= 31)) e ((mes >= 1) e (mes <= 12)) e (ano > 0) entao
      se ((mes = 4) ou (mes = 6) ou (mes = 9) ou (mes = 11)) e (dia > 30) entao
         escreva("Data inválida!")
      senao
         se ((mes = 2) and ((ano mod 4 = 0 and ano mod 100 <> 0) or ano mod 400 = 0)) entao
            se (dia > 29) entao
               escreva("Data inválida!")
            senao
               escreva("Data válida!")
            fimse
         senao
            se (mes = 2) e (dia > 28) entao
               escreva("Data inválida!")
            senao
               escreva("Data válida!")
            fimse
         fimse
      fimse
   senao
      escreva("Data inválida!")
   fimse
fimalgoritmo
