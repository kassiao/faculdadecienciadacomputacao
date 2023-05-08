peso = float(input("Digite o peso dos peixes pescados (em kg): "))

excesso = peso - 50

if excesso > 0:
    multa = excesso * 4
    print(f"João deverá pagar uma multa de R$ {multa:.2f} pelo excesso de {excesso:.2f}kg de peixes.")
else:
    print("João não precisa pagar multa. O peso de peixes pescados está dentro do limite permitido.")
