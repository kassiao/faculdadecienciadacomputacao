import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salário atual do colaborador: ");
        double salario = input.nextDouble();
        double novoSalario, aumento;

        if (salario <= 280) {
            aumento = salario * 0.2;
            novoSalario = salario + aumento;
            System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 20%");
        } else if (salario <= 700) {
            aumento = salario * 0.15;
            novoSalario = salario + aumento;
            System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 15%");
        } else if (salario <= 1500) {
            aumento = salario * 0.1;
            novoSalario = salario + aumento;
            System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 10%");
        } else {
            aumento = salario * 0.05;
            novoSalario = salario + aumento;
            System.out.printf("Salário antes do reajuste: R$ %.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 5%");
        }

        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
        }
}
