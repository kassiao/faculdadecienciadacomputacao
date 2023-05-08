salario = float(input("Digite o salário atual do colaborador: "))
novo_salario = 0
aumento = 0

if salario <= 280:
    aumento = salario * 0.2
    novo_salario = salario + aumento
    print(f"Salário antes do reajuste: R$ {salario:.2f}")
    print("Percentual de aumento aplicado: 20%")
    
elif salario <= 700:
    aumento = salario * 0.15
    novo_salario = salario + aumento
    print(f"Salário antes do reajuste: R$ {salario:.2f}")
    print("Percentual de aumento aplicado: 15%")
    
elif salario <= 1500:
    aumento = salario * 0.1
    novo_salario = salario + aumento
    print(f"Salário antes do reajuste: R$ {salario:.2f}")
    print("Percentual de aumento aplicado: 10%")
    
else:
    aumento = salario * 0.05
    novo_salario = salario + aumento
    print(f"Salário antes do reajuste: R$ {salario:.2f}")
    print("Percentual de aumento aplicado: 5%")

print(f"Valor do aumento: R$ {aumento:.2f}")
print(f"Novo salário: R$ {novo_salario:.2f}")