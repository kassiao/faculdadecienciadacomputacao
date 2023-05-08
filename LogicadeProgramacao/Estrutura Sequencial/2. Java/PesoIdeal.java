import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a altura da pessoa: ");
        altura = sc.nextDouble();
        
        pesoIdeal = (72.7 * altura) - 58;
        
        System.out.printf("O peso ideal para a altura de %.2fm é: %.2fkg", altura, pesoIdeal);
        
        sc.close();
    }
}
