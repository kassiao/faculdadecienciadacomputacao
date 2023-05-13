import java.util.Scanner;

public class NumCentenasDezenasUnidades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();
        
        int centenas = numero / 100;
        int resto = numero % 100;
        int dezenas = resto / 10;
        int unidades = resto % 10;
        
        if (centenas > 0) {
            System.out.print(centenas + " centena(s)");
            if (dezenas > 0 && unidades > 0) {
                System.out.print(", ");
            } else if (dezenas > 0 || unidades > 0) {
                System.out.print(" e ");
            }
        }
        
        if (dezenas > 0) {
            System.out.print(dezenas + " dezena(s)");
            if (unidades > 0) {
                System.out.print(" e ");
            }
        }
        
        if (unidades > 0) {
            System.out.print(unidades + " unidade(s)");
        }
    }
}
