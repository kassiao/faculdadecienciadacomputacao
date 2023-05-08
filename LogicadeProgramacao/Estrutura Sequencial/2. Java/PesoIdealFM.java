import java.util.Scanner;

public class PesoIdealFM {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        char genero;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a altura da pessoa: ");
        altura = sc.nextDouble();
        
        System.out.print("Digite o gênero da pessoa (M/F): ");
        genero = sc.next().charAt(0);
        
        if (genero == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (genero == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Gênero inválido!");
            return;
        }
        
        System.out.printf("O peso ideal para a altura de %.2fm e gênero %s é: %.2fkg", altura, genero, pesoIdeal);
        
        sc.close();
    }
}
