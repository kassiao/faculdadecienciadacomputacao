Algoritmo "TempoDownload"
Var
  tamanho_arquivo, velocidade_link, tempo_download: Real

Inicio
  Escreva("Digite o tamanho do arquivo em MB: ")
  Leia(tamanho_arquivo)
  
  Escreva("Digite a velocidade do link de internet em Mbps: ")
  Leia(velocidade_link)
  
  tempo_download <- (tamanho_arquivo * 8) / velocidade_link / 60
  
  Escreva("O tempo aproximado de download é de ", tempo_download, " minutos.")
Fim
