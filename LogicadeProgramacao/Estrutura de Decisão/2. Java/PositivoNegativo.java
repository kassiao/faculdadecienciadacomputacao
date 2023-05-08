import java.util.Scanner;

public class PositivoNegativo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int valor;

      System.out.print("Digite um valor: ");
      valor = input.nextInt();

      if (valor >= 0) {
         System.out.println("O valor é positivo.");
      } else {
         System.out.println("O valor é negativo.");
      }
   }
}
