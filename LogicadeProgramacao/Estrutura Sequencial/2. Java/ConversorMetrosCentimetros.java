import java.util.Scanner;

public class ConversorMetrosCentimetros {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite a medida em metros: ");
      double metros = input.nextDouble();
      double centimetros = metros * 100;
      System.out.println(metros + " metros equivalem a " + centimetros + " centímetros");
   }
}
