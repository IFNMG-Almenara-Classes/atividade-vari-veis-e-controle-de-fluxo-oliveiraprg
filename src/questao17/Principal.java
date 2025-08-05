package questao17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("" + numero + "! = " + fatorial);
        }

        entrada.close();
    }
}
