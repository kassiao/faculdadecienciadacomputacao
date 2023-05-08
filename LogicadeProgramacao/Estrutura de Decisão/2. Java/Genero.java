import java.util.Scanner;

public class Genero {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char letra;

      System.out.print("Digite uma letra: ");
      letra = input.next().charAt(0);

      if (letra == 'F') {
         System.out.println("F - Feminino");
      } else if (letra == 'M') {
         System.out.println("M - Masculino");
      } else {
         System.out.println("Gênero Inválido");
      }
   }
}
