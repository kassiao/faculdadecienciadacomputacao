valor_hora = float(input("Digite o valor da sua hora: "))
horas_trabalhadas = float(input("Digite a quantidade de horas trabalhadas no mês: "))

salario_bruto = valor_hora * horas_trabalhadas
fgts = salario_bruto * 0.11
sindicato = salario_bruto * 0.03

if salario_bruto <= 900:
    ir = 0
elif salario_bruto <= 1500:
    ir = salario_bruto * 0.05
elif salario_bruto <= 2500:
    ir = salario_bruto * 0.1
else:
    ir = salario_bruto * 0.2

inss = salario_bruto * 0.1
total_descontos = ir + inss + sindicato
salario_liquido = salario_bruto - total_descontos

print("Salário Bruto: ({} * {})         : R$ {:.2f}".format(valor_hora, horas_trabalhadas, salario_bruto))
print("(-) IR ({:.0f}%)                  : R$ {:.2f}".format(ir/salario_bruto*100, ir))
print("(-) INSS ( 10%)                  : R$ {:.2f}".format(inss))
print("(-) Sindicato ( 3%)              : R$ {:.2f}".format(sindicato))
print("FGTS (11%)                       : R$ {:.2f}".format(fgts))
print("Total de descontos               : R$ {:.2f}".format(total_descontos))
print("Salário Líquido                  : R$ {:.2f}".format(salario_liquido))
