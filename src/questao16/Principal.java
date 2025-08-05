package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("\n--- Tabuada de Multiplicação de " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultadoMultiplicacao = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultadoMultiplicacao);
        }

        System.out.println("\n--- Tabuada de Divisão de " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            double resultadoDivisao = (double) numero / i;
            System.out.printf("%d ÷ %d = %.2f%n", numero, i, resultadoDivisao);
        }

        entrada.close();
    }
}
