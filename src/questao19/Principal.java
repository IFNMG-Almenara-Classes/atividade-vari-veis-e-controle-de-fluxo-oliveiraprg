package questao19;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número (1 a 7) para o dia da semana: ");
        int numeroDia = entrada.nextInt();

        String nomeDia;
        switch (numeroDia) {
            case 1  -> nomeDia = "Domingo";
            case 2  -> nomeDia = "Segunda-feira";
            case 3  -> nomeDia = "Terça-feira";
            case 4  -> nomeDia = "Quarta-feira";
            case 5  -> nomeDia = "Quinta-feira";
            case 6  -> nomeDia = "Sexta-feira";
            case 7  -> nomeDia = "Sábado";
            default -> nomeDia = null;
        }

        if (nomeDia != null) {
            System.out.println("Dia da semana: " + nomeDia);
        } else {
            System.out.println("Entrada inválida. Informe um número entre 1 e 7.");
        }

        entrada.close();
    }
}
