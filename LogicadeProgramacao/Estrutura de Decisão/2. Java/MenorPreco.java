import java.util.Scanner;

public class MenorPreco {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double preco1, preco2, preco3;

      System.out.print("Digite o preço do primeiro produto: ");
      preco1 = input.nextDouble();

      System.out.print("Digite o preço do segundo produto: ");
      preco2 = input.nextDouble();

      System.out.print("Digite o preço do terceiro produto: ");
      preco3 = input.nextDouble();

      if (preco1 <= preco2 && preco1 <= preco3) {
         System.out.println("Compre o primeiro produto");
      } else if (preco2 <= preco1 && preco2 <= preco3) {
         System.out.println("Compre o segundo produto");
      } else {
         System.out.println("Compre o terceiro produto");
      }
   }
}
