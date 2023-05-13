import java.util.Scanner;
public class Fruteira {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double qtdMorangos, qtdMacas, pesoTotal, valorMorango, valorMaca, total, desconto;
    
        System.out.print("Digite a quantidade (em Kg) de morangos: ");
        qtdMorangos = entrada.nextDouble();
        System.out.print("Digite a quantidade (em Kg) de maças: ");
        qtdMacas = entrada.nextDouble();
    
        // calcula o peso total das frutas
        pesoTotal = qtdMorangos + qtdMacas;
    
        // verifica o preço do morango de acordo com o peso
        if (qtdMorangos <= 5) {
            valorMorango = qtdMorangos * 2.5;
        } else {
            valorMorango = qtdMorangos * 2.2;
        }
    
        // verifica o preço da maçã de acordo com o peso
        if (qtdMacas <= 5) {
            valorMaca = qtdMacas * 1.8;
        } else {
            valorMaca = qtdMacas * 1.5;
        }
    
        // calcula o total da compra
        total = valorMorango + valorMaca;
    
        // verifica se o cliente tem direito a desconto
        if (pesoTotal > 8 || total > 25) {
            desconto = total * 0.1;
            total -= desconto;
        }
    
        System.out.printf("O valor total a ser pago é de: R$ %.2f", total);
        entrada.close();
    }
    
}
