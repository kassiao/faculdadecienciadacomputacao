import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito;

        if (media >= 9.0) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.printf("Notas: %.1f e %.1f\n", nota1, nota2);
        System.out.printf("Média: %.1f\n", media);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
