import java.util.Scanner;

public class TemperaturaC {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite a temperatura em graus Fahrenheit: ");
      double fahrenheit = input.nextDouble();
      double celsius = 5 * ((fahrenheit - 32) / 9);
      System.out.println("A temperatura em graus Celsius é: " + celsius);
   }
}
