import java.util.Scanner;

public class InteiroDecimal {
    public static void main(String[] args) {
        // criação do objeto scanner para leitura do número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        
        // arredonda o número para 1 casa decimal
        double arredondado = Math.round(num * 10) / 10.0;
        
        // compara o número original com o número arredondado
        if (num == arredondado) {
            System.out.println("O número é inteiro");
        } else {
            System.out.println("O número é decimal");
        }
    }
}
