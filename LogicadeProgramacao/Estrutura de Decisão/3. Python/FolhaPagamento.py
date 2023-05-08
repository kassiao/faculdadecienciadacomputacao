valor_hora = float(input("Digite o valor da sua hora de trabalho: "))
qtd_horas = float(input("Digite a quantidade de horas trabalhadas no mês: "))

salario_bruto = valor_hora * qtd_horas
fgts = salario_bruto * 0.11
desconto_inss = salario_bruto * 0.1

if salario_bruto <= 900:
    desconto_ir = 0
elif salario_bruto <= 1500:
    desconto_ir = salario_bruto * 0.05
elif salario_bruto <= 2500:
    desconto_ir = salario_bruto * 0.1
else:
    desconto_ir = salario_bruto * 0.2

total_descontos = desconto_ir + desconto_inss + (salario_bruto * 0.03)
salario_liquido = salario_bruto - total_descontos

print(f"Salário Bruto: R$ {salario_bruto:.2f}")
print(
    f"(-) IR ({desconto_ir / salario_bruto * 100:.0f}%): R$ {desconto_ir:.2f}")
print(f"(-) INSS (10%): R$ {desconto_inss:.2f}")
print(f"FGTS (11%): R$ {fgts:.2f}")
print(f"Total de descontos: R$ {total_descontos:.2f}")
print(f"Salário Líquido: R$ {salario_liquido:.2f}")
