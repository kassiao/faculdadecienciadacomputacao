import java.util.Scanner;

public class ExcessoDePeso {
    public static void main(String[] args) {
        double peso, excesso, multa;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso dos peixes pescados (em kg): ");
        peso = sc.nextDouble();
        
        excesso = peso - 50;
        
        if (excesso > 0) {
            multa = excesso * 4;
            System.out.printf("João deverá pagar uma multa de R$ %.2f pelo excesso de %.2fkg de peixes.", multa, excesso);
        } else {
            System.out.println("João não precisa pagar multa. O peso de peixes pescados está dentro do limite permitido.");
        }
        
        sc.close();
    }
}
