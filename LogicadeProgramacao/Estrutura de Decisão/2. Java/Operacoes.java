import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Qual operação deseja realizar? (+, -, *, /): ");
        char operacao = input.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("O resultado de %.2f + %.2f é %.2f\n", num1, num2, resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.printf("O resultado de %.2f - %.2f é %.2f\n", num1, num2, resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.printf("O resultado de %.2f * %.2f é %.2f\n", num1, num2, resultado);
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("O resultado de %.2f / %.2f é %.2f\n", num1, num2, resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }

        if (resultado % 2 == 0) {
            System.out.println("O resultado é par.");
        } else {
            System.out.println("O resultado é ímpar.");
        }

        if (resultado >= 0) {
            System.out.println("O resultado é positivo.");
        } else {
            System.out.println("O resultado é negativo.");
        }

        if (resultado == Math.round(resultado)) {
            System.out.println("O resultado é inteiro.");
        } else {
            System.out.println("O resultado é decimal.");
        }

        input.close();
    }
}
