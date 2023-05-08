Algoritmo "Cálculo de salário"
Var
   valor_hora, horas_mes, salario: real
Inicio
   Escreva("Digite o valor que você ganha por hora: ")
   Leia(valor_hora)
   Escreva("Digite o número de horas trabalhadas no mês: ")
   Leia(horas_mes)
   salario <- valor_hora * horas_mes
   Escreva("Seu salário neste mês será de R$", salario)
Fim
