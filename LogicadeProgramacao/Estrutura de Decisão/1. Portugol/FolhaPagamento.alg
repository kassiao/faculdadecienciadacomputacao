algoritmo "FolhaPagamento"
var valorHora, qtdHoras, salarioBruto, fgts, descontoIR, descontoINSS, totalDescontos, salarioLiquido: real

escreva("Digite o valor da sua hora de trabalho: ")
leia(valorHora)

escreva("Digite a quantidade de horas trabalhadas no mês: ")
leia(qtdHoras)

salarioBruto <- valorHora * qtdHoras
fgts <- salarioBruto * 0.11
descontoINSS <- salarioBruto * 0.1

se salarioBruto <= 900 entao
descontoIR <- 0
senao se salarioBruto <= 1500 entao
descontoIR <- salarioBruto * 0.05
senao se salarioBruto <= 2500 entao
descontoIR <- salarioBruto * 0.1
senao
descontoIR <- salarioBruto * 0.2
fimse

totalDescontos <- descontoIR + descontoINSS + (salarioBruto * 0.03)
salarioLiquido <- salarioBruto - totalDescontos

escreva("Salário Bruto: R$ ", salarioBruto)
escreva("(-) IR (", descontoIR / salarioBruto * 100, "%): R$ ", descontoIR)
escreva("(-) INSS (10%): R$ ", descontoINSS)
escreva("FGTS (11%): R$ ", fgts)
escreva("Total de descontos: R$ ", totalDescontos)
escreva("Salário Líquido: R$ ", salarioLiquido)