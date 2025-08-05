package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int terceiroNumero = entrada.nextInt();

        int menor = primeiroNumero; 

        if (segundoNumero < menor) {
            menor = segundoNumero;
        }
        if (terceiroNumero < menor) {
            menor = terceiroNumero;
        }

        System.out.println("O menor número é " + menor);

        entrada.close();
    }
}
