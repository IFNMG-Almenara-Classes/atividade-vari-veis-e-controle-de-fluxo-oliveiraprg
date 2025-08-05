package questao14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.println("Tipo de cliente:");
        System.out.println("1 - Comum");
        System.out.println("2 - VIP (5% de desconto)");
        System.out.println("3 - Funcionário (10% de desconto)");
        System.out.print("Escolha o código do cliente: ");
        int codigoCliente = entrada.nextInt();

        double desconto;
        switch (codigoCliente) {
            case 2:
                desconto = 0.05;
                break;
            case 3:
                desconto = 0.10;
                break;
            case 1:
            default:
                desconto = 0.0;
                break;
        }

        double valorDesconto = valorCompra * desconto;
        double valorTotal = valorCompra - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);

        entrada.close();
    }
}
