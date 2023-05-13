Algoritmo "Investigação Criminal"

Var
resposta: caractere
cont, totalSim: inteiro

Inicio
    cont <- 0
    totalSim <- 0

    Para cont de 1 até 5 faça
        Escreva("Responda S para SIM ou N para NÃO.")
        Escreva("Telefonou para a vítima?")
        Leia(resposta)
    Se resposta = "S" então
    totalSim <- totalSim + 1
    FimSe

    Escreva("Esteve no local do crime?")
    Leia(resposta)
    Se resposta = "S" então
        totalSim <- totalSim + 1
    FimSe

    Escreva("Mora perto da vítima?")
    Leia(resposta)
    Se resposta = "S" então
        totalSim <- totalSim + 1
    FimSe

    Escreva("Devia para a vítima?")
    Leia(resposta)
    Se resposta = "S" então
        totalSim <- totalSim + 1
    FimSe

    Escreva("Já trabalhou com a vítima?")
    Leia(resposta)
    Se resposta = "S" então
        totalSim <- totalSim + 1
    FimSe
    FimPara

    Se totalSim = 2 então
    Escreva("Suspeito.")
    SenãoSe totalSim >= 3 E totalSim <= 4 então
    Escreva("Cúmplice.")
    SenãoSe totalSim = 5 então
    Escreva("Assassino.")
    Senão
    Escreva("Inocente.")
    FimSe

    FimAlgoritmo