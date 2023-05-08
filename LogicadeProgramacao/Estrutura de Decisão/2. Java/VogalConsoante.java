import java.util.Scanner;

public class VogalConsoante {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char letra;

      System.out.print("Digite uma letra: ");
      letra = input.next().charAt(0);

      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || 
         letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
         System.out.println("A letra digitada é uma vogal.");
      } else {
         System.out.println("A letra digitada é uma consoante.");
      }
   }
}
