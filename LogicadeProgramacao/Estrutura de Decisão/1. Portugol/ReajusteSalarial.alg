algoritmo "Reajuste Salarial"
var
    salario, novoSalario, aumento: real
inicio
    escreva("Digite o salário atual do colaborador: ")
    leia(salario)

    se salario <= 280 entao
        aumento <- salario * 0.2
        novoSalario <- salario + aumento
        escreva("Salário antes do reajuste: R$", salario)
        escreva("\nPercentual de aumento aplicado: 20%")
    senao se salario <= 700 entao
        aumento <- salario * 0.15
        novoSalario <- salario + aumento
        escreva("Salário antes do reajuste: R$", salario)
        escreva("\nPercentual de aumento aplicado: 15%")
    senao se salario <= 1500 entao
        aumento <- salario * 0.1
        novoSalario <- salario + aumento
        escreva("Salário antes do reajuste: R$", salario)
        escreva("\nPercentual de aumento aplicado: 10%")
    senao
        aumento <- salario * 0.05
        novoSalario <- salario + aumento
        escreva("Salário antes do reajuste: R$", salario)
        escreva("\nPercentual de aumento aplicado: 5%")
    fimse

    escreva("\nValor do aumento: R$", aumento)
    escreva("\nNovo salário após o aumento: R$", novoSalario)
fimalgoritmo
