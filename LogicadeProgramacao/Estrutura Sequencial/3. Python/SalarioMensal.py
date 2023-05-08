valor_hora = float(input("Digite o valor que você ganha por hora: "))
horas_trabalhadas = float(input("Digite o número de horas trabalhadas no mês: "))

salario_bruto = valor_hora * horas_trabalhadas

desconto_ir = salario_bruto * 0.11
desconto_inss = salario_bruto * 0.08
desconto_sindicato = salario_bruto * 0.05

salario_liquido = salario_bruto - desconto_ir - desconto_inss - desconto_sindicato

print(f"Salário bruto: R$ {salario_bruto:.2f}")
print(f"Desconto do INSS: R$ {desconto_inss:.2f}")
print(f"Desconto do Sindicato: R$ {desconto_sindicato:.2f}")
print(f"Desconto do Imposto de Renda: R$ {desconto_ir:.2f}")
print(f"Salário líquido: R$ {salario_liquido:.2f}")
