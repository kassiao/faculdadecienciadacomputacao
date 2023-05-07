import java.util.Scanner;

public class AreaQuadrado {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite o tamanho do lado do quadrado: ");
      double lado = input.nextDouble();
      double area = lado * lado;
      double dobro = area * 2;
      System.out.println("A área do quadrado é: " + area);
      System.out.println("O dobro da área do quadrado é: " + dobro);
   }
}
