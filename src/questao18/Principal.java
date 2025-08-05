package questao18;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int n2 = entrada.nextInt();

        int inicio = Math.min(n1, n2);
        int fim    = Math.max(n1, n2);

        int contadorPrimos = 0;
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos entre " 
                           + inicio + " e " + fim + ": " + contadorPrimos);

        entrada.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        int limite = (int) Math.sqrt(numero);
        for (int i = 2; i <= limite; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        System.err.println("Número primo encontrado: " + numero);
        return true;
    }
}
