programa anoBissexto
    inteiro ano
    
    escreva("Digite o ano: ")
    leia(ano)
    
    se (ano % 4 = 0 e ano % 100 <> 0) ou (ano % 100 = 0 e ano % 400 = 0) entao
        escreva("O ano é bissexto.")
    senao
        escreva("O ano não é bissexto.")
    fimse
fimprograma
