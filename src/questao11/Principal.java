package questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int limite = entrada.nextInt();

        if (limite < 0) {
            System.out.println("Por favor, informe um número positivo.");
        } else {
            System.out.println("Números pares entre 0 e " + limite + ":");
            for (int numeroPar = 0; numeroPar <= limite; numeroPar += 2) {
                System.out.println(numeroPar);
            }
        }

        entrada.close();
    }
}
