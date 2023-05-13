import java.util.Scanner;

public class CupomFiscal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Tabela de preços
        double fileDuploAte5Kg = 4.90;
        double fileDuploMaisDe5Kg = 5.80;
        double alcatraAte5Kg = 5.90;
        double alcatraMaisDe5Kg = 6.80;
        double picanhaAte5Kg = 6.90;
        double picanhaMaisDe5Kg = 7.80;
        
        System.out.println("Bem-vindo ao Hipermercado Tabajara!");
        System.out.println("Por favor, selecione o tipo de carne desejado:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipoCarne = sc.nextInt();
        
        System.out.println("Quantos quilos de carne deseja comprar?");
        double quantidade = sc.nextDouble();
        
        double precoTotal = 0;
        String tipoPagamento = "";
        double valorDesconto = 0;
        double valorAPagar = 0;
        
        //Calcula o preço total de acordo com o tipo de carne e a quantidade comprada
        switch (tipoCarne) {
            case 1:
                if (quantidade <= 5) {
                    precoTotal = quantidade * fileDuploAte5Kg;
                } else {
                    precoTotal = quantidade * fileDuploMaisDe5Kg;
                }
                tipoPagamento = "à vista";
                break;
            case 2:
                if (quantidade <= 5) {
                    precoTotal = quantidade * alcatraAte5Kg;
                } else {
                    precoTotal = quantidade * alcatraMaisDe5Kg;
                }
                tipoPagamento = "à vista";
                break;
            case 3:
                if (quantidade <= 5) {
                    precoTotal = quantidade * picanhaAte5Kg;
                } else {
                    precoTotal = quantidade * picanhaMaisDe5Kg;
                }
                tipoPagamento = "à vista";
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }
        
        System.out.println("Deseja pagar com cartão Tabajara? (s/n)");
        String opcaoCartao = sc.next();
        if (opcaoCartao.equalsIgnoreCase("s")) {
            tipoPagamento = "com cartão Tabajara";
            valorDesconto = precoTotal * 0.05;
        }
        
        valorAPagar = precoTotal - valorDesconto;
        
        System.out.println("Cupom Fiscal");
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$" + precoTotal);
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        System.out.println("Valor do desconto: R$" + valorDesconto);
        System.out.println("Valor a pagar: R$" + valorAPagar);
        
        sc.close();
    }

}
