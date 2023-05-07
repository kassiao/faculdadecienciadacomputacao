import java.util.Scanner;

public class MediaNotas {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite a nota do 1º bimestre: ");
      double nota1 = input.nextDouble();
      System.out.print("Digite a nota do 2º bimestre: ");
      double nota2 = input.nextDouble();
      System.out.print("Digite a nota do 3º bimestre: ");
      double nota3 = input.nextDouble();
      System.out.print("Digite a nota do 4º bimestre: ");
      double nota4 = input.nextDouble();
      double media = (nota1 + nota2 + nota3 + nota4) / 4;
      System.out.println("A média das notas é: " + media);
   }
}
