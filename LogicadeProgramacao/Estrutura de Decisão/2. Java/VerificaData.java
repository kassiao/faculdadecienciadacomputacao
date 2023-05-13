import java.util.Scanner;

public class VerificaData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = input.nextLine();

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6));

        boolean dataValida = true;

        if (ano < 1 || ano > 9999) {
            dataValida = false;
        } else if (mes < 1 || mes > 12) {
            dataValida = false;
        } else {
            switch (mes) {
                case 2:
                    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                        if (dia < 1 || dia > 29) {
                            dataValida = false;
                        }
                    } else {
                        if (dia < 1 || dia > 28) {
                            dataValida = false;
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia < 1 || dia > 30) {
                        dataValida = false;
                    }
                    break;
                default:
                    if (dia < 1 || dia > 31) {
                        dataValida = false;
                    }
                    break;
            }
        }

        if (dataValida) {
            System.out.println("A data informada é válida.");
        } else {
            System.out.println("A data informada é inválida.");
        }

        input.close();
    }
}
