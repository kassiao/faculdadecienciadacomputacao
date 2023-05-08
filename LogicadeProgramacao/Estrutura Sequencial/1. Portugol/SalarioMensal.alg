algoritmo salario_mensal

var
   valor_hora, horas_trabalhadas, salario_bruto, desconto_ir, desconto_inss, desconto_sindicato, salario_liquido: real

inicio
   escreva("Digite o valor que você ganha por hora: ")
   leia(valor_hora)
   
   escreva("Digite o número de horas trabalhadas no mês: ")
   leia(horas_trabalhadas)
   
   salario_bruto <- valor_hora * horas_trabalhadas
   
   desconto_ir <- salario_bruto * 0.11
   desconto_inss <- salario_bruto * 0.08
   desconto_sindicato <- salario_bruto * 0.05
   
   salario_liquido <- salario_bruto - desconto_ir - desconto_inss - desconto_sindicato
   
   escreva("Salário bruto: R$ ", salario_bruto)
   escreva("Desconto do INSS: R$ ", desconto_inss)
   escreva("Desconto do Sindicato: R$ ", desconto_sindicato)
   escreva("Salário líquido: R$ ", salario_liquido)
fimalgoritmo
