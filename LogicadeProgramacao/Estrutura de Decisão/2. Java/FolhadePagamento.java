import java.util.Scanner;

public class FolhadePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;

        double ir;
        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.1;
        } else {
            ir = salarioBruto * 0.2;
        }

        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: (%.2f * %.2f) : R$ %.2f\n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f\n", ir * 100 / salarioBruto, ir);
        System.out.printf("(-) INSS (10%%) : R$ %.2f\n", inss);
        System.out.printf("FGTS(11%%) : R$ %.2f\n", fgts);
        System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
        System.out.printf("Salário Liquido : R$ %.2f\n", salarioLiquido);
        }
        }
