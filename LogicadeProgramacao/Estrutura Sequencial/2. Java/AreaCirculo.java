import java.util.Scanner;

public class AreaCirculo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite o raio do círculo: ");
      double raio = input.nextDouble();
      double area = 3.14 * raio * raio;
      System.out.println("A área do círculo é: " + area);
   }
}
