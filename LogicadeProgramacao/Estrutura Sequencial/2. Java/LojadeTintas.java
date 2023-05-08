import java.util.Scanner;

public class LojadeTintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area = input.nextDouble();

        double litros = Math.ceil(area / 6.0 * 1.1);

        int latas = (int) Math.ceil(litros / 18.0);
        int galoes = (int) Math.ceil(litros / 3.6);

        double precoLatas = latas * 80.0;
        double precoGaloes = galoes * 25.0;

        int latasNecessarias = (int) Math.ceil(litros / 18.0);
        int galoesNecessarios = (int) Math.ceil((litros % 18.0) / 3.6);

        double precoMisto = latasNecessarias * 80.0 + galoesNecessarios * 25.0;

        System.out.printf("Opção 1 - Comprar apenas latas de 18 litros: %d latas(s) por R$ %.2f%n", latas, precoLatas);
        System.out.printf("Opção 2 - Comprar apenas galões de 3,6 litros: %d galão(ões) por R$ %.2f%n", galoes, precoGaloes);
        System.out.printf("Opção 3 - Misturar latas e galões: %d lata(s) e %d galão(ões) por R$ %.2f%n",
                latasNecessarias, galoesNecessarios, precoMisto);

        input.close();
    }
}
