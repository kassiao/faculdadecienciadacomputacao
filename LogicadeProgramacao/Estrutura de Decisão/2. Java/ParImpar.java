import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // criação do objeto scanner para leitura do número inteiro
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        
        // determinação se é par ou ímpar
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
