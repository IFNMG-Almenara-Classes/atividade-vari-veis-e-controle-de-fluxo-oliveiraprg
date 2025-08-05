package questao20;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        boolean divisivelPor3 = (numero % 3 == 0);
        boolean divisivelPor5 = (numero % 5 == 0);

        if (divisivelPor3 ^ divisivelPor5) {
            System.out.println("O número " + numero + " é divisível por " +
                (divisivelPor3 ? "3" : "5") + ", mas não por ambos.");
        } else {
            System.out.println("O número " + numero + " não atende à condição (divisível por 3 ou 5, mas não simultaneamente).");
        }

        entrada.close();
    }
}
