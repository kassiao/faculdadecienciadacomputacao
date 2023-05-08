algoritmo "Loja de Tintas"
var
   area_pintar, litros_tinta, latas_tinta: real
   preco_total: real
inicio
   escreva("Digite o tamanho da área a ser pintada em metros quadrados: ")
   leia(area_pintar)

   // Cálculo da quantidade de tinta e latas necessárias
   litros_tinta <- area_pintar / 3
   latas_tinta <- arredondar(litros_tinta / 18) + (1 se litros_tinta % 18 <> 0 então 1 senão 0)

   // Cálculo do preço total
   preco_total <- latas_tinta * 80.0

   // Saída de dados
   escreva("Serão necessárias ", latas_tinta, " latas de tinta")
   escreva("O preço total é R$ ", preco_total:0.2f)
fimalgoritmo
