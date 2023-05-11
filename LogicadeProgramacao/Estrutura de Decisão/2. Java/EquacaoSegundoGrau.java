import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau!");
        } else {
            System.out.print("Digite o valor de B: ");
            b = sc.nextDouble();
            System.out.print("Digite o valor de C: ");
            c = sc.nextDouble();

            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais!");
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                System.out.println("A equação possui apenas uma raiz real: " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);
            }
        }

        sc.close();
    }
}