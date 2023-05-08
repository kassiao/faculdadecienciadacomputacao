import java.util.Scanner;

public class Salario {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite o valor que você ganha por hora: ");
      double valorHora = input.nextDouble();
      System.out.print("Digite o número de horas trabalhadas no mês: ");
      double horasMes = input.nextDouble();
      double salario = valorHora * horasMes;
      System.out.println("Seu salário neste mês será de R$" + salario);
   }
}
