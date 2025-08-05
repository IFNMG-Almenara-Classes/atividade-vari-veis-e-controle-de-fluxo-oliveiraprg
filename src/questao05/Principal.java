package questao05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de laranjas compradas: ");
        int quantidade = entrada.nextInt();

        double precoUnitario;
        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.30;
        }

        double total = quantidade * precoUnitario;
        System.out.printf("Valor total da compra: R$ %.2f%n", total);

        entrada.close();
    }
}
