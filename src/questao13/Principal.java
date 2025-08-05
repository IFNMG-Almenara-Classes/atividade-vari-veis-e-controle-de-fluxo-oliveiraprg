package questao13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- Calculadora -----");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o primeiro número: ");
                    double numero1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double numero2 = entrada.nextDouble();
                    double resultado = numero1 + numero2;
                    System.out.printf("Resultado da soma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    System.out.print("Digite o primeiro número: ");
                    double numero1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double numero2 = entrada.nextDouble();
                    double resultado = numero1 - numero2;
                    System.out.printf("Resultado da subtração: %.2f%n%n", resultado);
                }
                case 3 -> {
                    System.out.print("Digite o primeiro número: ");
                    double numero1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double numero2 = entrada.nextDouble();
                    double resultado = numero1 * numero2;
                    System.out.printf("Resultado da multiplicação: %.2f%n%n", resultado);
                }
                case 4 -> {
                    System.out.print("Digite o dividendo: ");
                    double numero1 = entrada.nextDouble();
                    System.out.print("Digite o divisor: ");
                    double numero2 = entrada.nextDouble();
                    if (numero2 != 0) {
                        double resultado = numero1 / numero2;
                        System.out.printf("Resultado da divisão: %.2f%n%n", resultado);
                    } else {
                        System.out.println("Erro: divisão por zero não permitida.%n");
                    }
                }
                case 5 -> {
                    System.out.println("Encerrando programa. Até logo!");
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.%n");
                }
            }
        } while (opcao != 5);

        entrada.close();
    }
}
