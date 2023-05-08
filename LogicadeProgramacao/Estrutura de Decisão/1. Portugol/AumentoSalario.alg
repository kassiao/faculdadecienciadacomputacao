Algoritmo AumentoSalario
    Real: salario, percentual, aumento, novoSalario
    
    Escrever("Digite o salário atual do colaborador: ")
    Ler(salario)
    
    Se salario <= 280 Então
        percentual = 20
    Senão Se salario <= 700 Então
        percentual = 15
    Senão Se salario <= 1500 Então
        percentual = 10
    Senão
        percentual = 5
    FimSe
    
    aumento = salario * (percentual/100)
    novoSalario = salario + aumento
    
    Escrever("Salário antes do reajuste: R$ ", salario)
    Escrever("Percentual de aumento aplicado: ", percentual, "%")
    Escrever("Valor do aumento: R$ ", aumento)
    Escrever("Novo salário após o aumento: R$ ", novoSalario)
FimAlgoritmo
