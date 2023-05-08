import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double area_pintar = sc.nextDouble();

        // Cálculo da quantidade de tinta e latas necessárias
        double litros_tinta = area_pintar / 3;
        int latas_tinta = (int)Math.ceil(litros_tinta / 18);

        // Cálculo do preço total
        double preco_total = latas_tinta * 80.0;

        // Saída de dados
        System.out.println("Serão necessárias " + latas_tinta + " latas de tinta");
        System.out.printf("O preço total é R$ %.2f", preco_total);
    }
}
