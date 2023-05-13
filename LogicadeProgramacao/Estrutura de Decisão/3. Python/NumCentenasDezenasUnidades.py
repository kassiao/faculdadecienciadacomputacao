numero = int(input("Digite um número inteiro menor que 1000: "))

centenas = numero // 100
resto = numero % 100
dezenas = resto // 10
unidades = resto % 10

if centenas > 0:
    print(f"{centenas} centena(s)", end="")
    if dezenas > 0 and unidades > 0:
        print(", ", end="")
    elif dezenas > 0 or unidades > 0:
        print(" e ", end="")
    
if dezenas > 0:
    print(f"{dezenas} dezena(s)", end="")
    if unidades > 0:
        print(" e ", end="")
    
if unidades > 0:
    print(f"{unidades} unidade(s)", end="")
