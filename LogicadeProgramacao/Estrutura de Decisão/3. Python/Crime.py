print("Responda as perguntas abaixo com 'sim' ou 'não'.")
pergunta1 = input("Telefonou para a vítima? ")
pergunta2 = input("Esteve no local do crime? ")
pergunta3 = input("Mora perto da vítima? ")
pergunta4 = input("Devia para a vítima? ")
pergunta5 = input("Já trabalhou com a vítima? ")

respostas_positivas = 0

if pergunta1.lower() == 'sim':
    respostas_positivas += 1

if pergunta2.lower() == 'sim':
    respostas_positivas += 1

if pergunta3.lower() == 'sim':
    respostas_positivas += 1

if pergunta4.lower() == 'sim':
    respostas_positivas += 1

if pergunta5.lower() == 'sim':
    respostas_positivas += 1

if respostas_positivas == 2:
    print("Você é um(a) suspeito(a) do crime.")
elif respostas_positivas >= 3 and respostas_positivas <= 4:
    print("Você é um(a) cúmplice do crime.")
elif respostas_positivas == 5:
    print("Você é o(a) assassino(a)!")
else:
    print("Você é inocente.")
