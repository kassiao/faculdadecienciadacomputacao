algoritmo "Turno de Estudo"
var
    turno: caractere
inicio
    escreva("Em que turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ")
    leia(turno)

    se turno = "M" entao
        escreva("Bom Dia!")
    senao se turno = "V" entao
        escreva("Boa Tarde!")
    senao se turno = "N" entao
        escreva("Boa Noite!")
    senao
        escreva("Valor Inválido!")
    fimse
fimalgoritmo
