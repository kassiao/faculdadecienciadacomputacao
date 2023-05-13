Algoritmo "Cupom Fiscal"
var
   tipo_carne: caractere
   quant_carne, preco_total, desconto, preco_final: real
   tipo_pagamento: caractere

Inicio
   escreva("Bem-vindo ao Hipermercado Tabajara!")
   escreva("Qual o tipo de carne desejado?")
   escreva("(F) File Duplo")
   escreva("(A) Alcatra")
   escreva("(P) Picanha")
   leia(tipo_carne)
   escreva("Quantos quilos de carne?")
   leia(quant_carne)
   escreva("Qual o tipo de pagamento?")
   escreva("(C) Cartão Tabajara")
   escreva("(O) Outro")
   leia(tipo_pagamento)

   se tipo_carne = "F" então
      se quant_carne <= 5 então
         preco_total <- quant_carne * 4.9
      senão
         preco_total <- quant_carne * 5.8
      fim_se
   senão se tipo_carne = "A" então
      se quant_carne <= 5 então
         preco_total <- quant_carne * 5.9
      senão
         preco_total <- quant_carne * 6.8
      fim_se
   senão se tipo_carne = "P" então
      se quant_carne <= 5 então
         preco_total <- quant_carne * 6.9
      senão
         preco_total <- quant_carne * 7.8
      fim_se
   fim_se

   se tipo_pagamento = "C" então
      desconto <- preco_total * 0.05
      preco_final <- preco_total - desconto
   senão
      desconto <- 0
      preco_final <- preco_total
   fim_se

   escreva("CUPOM FISCAL")
   escreva("Tipo de carne: ", tipo_carne)
   escreva("Quantidade: ", quant_carne, "kg")
   escreva("Preço total: R$ ", preco_total:2:2)
   escreva("Tipo de pagamento: ", tipo_pagamento)
   escreva("Valor do desconto: R$ ", desconto:2:2)
   escreva("Valor a pagar: R$ ", preco_final:2:2)

FimAlgoritmo