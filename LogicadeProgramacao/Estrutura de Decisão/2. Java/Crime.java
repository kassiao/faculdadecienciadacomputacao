import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Responda as perguntas abaixo com 'sim' ou 'não'.");
        System.out.print("Telefonou para a vítima? ");
        String pergunta1 = sc.nextLine();
        System.out.print("Esteve no local do crime? ");
        String pergunta2 = sc.nextLine();
        System.out.print("Mora perto da vítima? ");
        String pergunta3 = sc.nextLine();
        System.out.print("Devia para a vítima? ");
        String pergunta4 = sc.nextLine();
        System.out.print("Já trabalhou com a vítima? ");
        String pergunta5 = sc.nextLine();

        int respostas_positivas = 0;

        if (pergunta1.equalsIgnoreCase("sim")) {
            respostas_positivas++;
        }

        if (pergunta2.equalsIgnoreCase("sim")) {
            respostas_positivas++;
        }

        if (pergunta3.equalsIgnoreCase("sim")) {
            respostas_positivas++;
        }

        if (pergunta4.equalsIgnoreCase("sim")) {
            respostas_positivas++;
        }

        if (pergunta5.equalsIgnoreCase("sim")) {
            respostas_positivas++;
        }

        if (respostas_positivas == 2) {
            System.out.println("Você é um(a) suspeito(a) do crime.");
        } else if (respostas_positivas >= 3 && respostas_positivas <= 4) {
            System.out.println("Você é um(a) cúmplice do crime.");
        } else if (respostas_positivas == 5) {
            System.out.println("Você é o(a) assassino(a)!");
        } else {
            System.out.println("Você é inocente.");
        }
    }
}
