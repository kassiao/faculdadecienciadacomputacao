import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        double valorHora, horasTrabalhadas, salarioBruto, descontoIR, descontoINSS, descontoSindicato, salarioLiquido;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor que você ganha por hora: ");
        valorHora = sc.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextDouble();
        
        salarioBruto = valorHora * horasTrabalhadas;
        
        descontoIR = salarioBruto * 0.11;
        descontoINSS = salarioBruto * 0.08;
        descontoSindicato = salarioBruto * 0.05;
        
        salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;
        
        System.out.printf("Salário bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f\n", descontoINSS);
        System.out.printf("Desconto do Sindicato: R$ %.2f\n", descontoSindicato);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
        
        sc.close();
    }
}
