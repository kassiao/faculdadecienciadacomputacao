import java.util.Scanner;

public class TurnoDeEstudo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Em que turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ");
        char turno = input.next().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
