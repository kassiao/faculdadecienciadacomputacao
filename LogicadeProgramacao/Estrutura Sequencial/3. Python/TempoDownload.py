tamanho_arquivo = float(input("Digite o tamanho do arquivo em MB: "))
velocidade_link = float(input("Digite a velocidade do link de internet em Mbps: "))

tempo_download = (tamanho_arquivo * 8) / velocidade_link / 60

print(f"O tempo aproximado de download é de {tempo_download:.2f} minutos.")
