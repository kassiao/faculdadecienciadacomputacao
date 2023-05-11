algoritmo "Folha de pagamento"
var
   valorHora, horasTrabalhadas, salarioBruto, inss, fgts, ir, totalDescontos, salarioLiquido: real
inicio
   escreva("Digite o valor da sua hora: ")
   leia(valorHora)
   escreva("Digite a quantidade de horas trabalhadas no mês: ")
   leia(horasTrabalhadas)

   salarioBruto <- valorHora * horasTrabalhadas
   inss <- salarioBruto * 0.1
   fgts <- salarioBruto * 0.11

   se (salarioBruto <= 900) entao
      ir <- 0
   senao se (salarioBruto <= 1500) entao
      ir <- salarioBruto * 0.05
   senao se (salarioBruto <= 2500) entao
      ir <- salarioBruto * 0.1
   senao
      ir <- salarioBruto * 0.2
   fimSe

   totalDescontos <- inss + ir
   salarioLiquido <- salarioBruto - totalDescontos

   escreval("Salário Bruto: (", valorHora, " * ", horasTrabalhadas, ") : R$ ", salarioBruto)
   escreval("(-) IR (", ir * 100 / salarioBruto, "%) : R$ ", ir)
   escreval("(-) INSS (10%) : R$ ", inss)
   escreval("FGTS (11%) : R$ ", fgts)
   escreval("Total de descontos : R$ ", totalDescontos)
   escreval("Salário Liquido : R$ ", salarioLiquido)
fimalgoritmo
