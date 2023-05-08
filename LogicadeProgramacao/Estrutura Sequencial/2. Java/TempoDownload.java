import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tamanhoArquivo, velocidadeLink, tempoDownload;

        System.out.print("Digite o tamanho do arquivo em MB: ");
        tamanhoArquivo = entrada.nextDouble();

        System.out.print("Digite a velocidade do link de internet em Mbps: ");
        velocidadeLink = entrada.nextDouble();

        tempoDownload = (tamanhoArquivo * 8) / velocidadeLink / 60;

        System.out.printf("O tempo aproximado de download é de %.2f minutos.", tempoDownload);

        entrada.close();
    }
}
