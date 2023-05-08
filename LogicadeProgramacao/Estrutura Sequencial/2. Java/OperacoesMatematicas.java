import java.util.Scanner;

public class OperacoesMatematicas {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite dois números inteiros: ");
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      System.out.print("Digite um número real: ");
      double numReal = input.nextDouble();
      
      double resultado1 = (2 * num1) * (num2 / 2.0);
      double resultado2 = (3 * num1) + numReal;
      double resultado3 = Math.pow(numReal, 3);
      
      System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
      System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
      System.out.println("O terceiro elevado ao cubo é: " + resultado3);
   }
}
