Algoritmo EquacaoSegundoGrau

Escreva("Digite o valor de A: ")
Leia(A)

Se (A == 0) Então
    Escreva("Não é uma equação de segundo grau!")
Senão
    Escreva("Digite o valor de B: ")
    Leia(B)
    Escreva("Digite o valor de C: ")
    Leia(C)
    
    delta <- B * B - 4 * A * C
    
    Se (delta < 0) Então
        Escreva("A equação não possui raízes reais!")
    Senão
        Se (delta == 0) Então
            x <- (-B) / (2 * A)
            Escreva("A equação possui apenas uma raiz real: ", x)
        Senão
            x1 <- (-B + RaizQuadrada(delta)) / (2 * A)
            x2 <- (-B - RaizQuadrada(delta)) / (2 * A)
            Escreva("A equação possui duas raízes reais: ", x1, " e ", x2)
        FimSe
    FimSe
    
FimSe