package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadePares = 0;
        int somaNumeros = 0;
        int quantidadeTotal = 0;

        while (true) {
            System.out.print("Digite um número inteiro (0 para sair): ");
            int numero = entrada.nextInt();

            if (numero == 0) {
                break;
            }

            quantidadeTotal++;
            somaNumeros += numero;

            if (numero % 2 == 0) {
                quantidadePares++;
            }
        }

        if (quantidadeTotal > 0) {
            double media = (double) somaNumeros / quantidadeTotal;
            System.out.println("Quantidade de números pares digitados: " + quantidadePares);
            System.out.printf("Média dos números digitados: %.2f%n", media);
        } else {
            System.out.println("Nenhum número (diferente de zero) foi digitado.");
        }

        entrada.close();
    }
}
