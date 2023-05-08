import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();
        double salarioBruto = valorHora * horasTrabalhadas;
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double ir = 0.0;
        double inss = salarioBruto * 0.10;
        double totalDescontos = 0.0;
        double salarioLiquido = 0.0;

        if (salarioBruto <= 900) {
            ir = 0.0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }

        totalDescontos = sindicato + ir + inss;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("(-) IR: R$ %.2f%n", ir);
        System.out.printf("(-) INSS: R$ %.2f%n", inss);
        System.out.printf("(-) Sindicato: R$ %.2f%n", sindicato);
        System.out.printf("FGTS: R$ %.2f%n", fgts);
        System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
    }
}