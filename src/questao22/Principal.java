package questao22;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número (1 a 12) para exibir o mês correspondente: ");
        int numeroMes = entrada.nextInt();

        String mesSelecionado;
        switch (numeroMes) {
            case 1  -> mesSelecionado = "Janeiro";
            case 2  -> mesSelecionado = "Fevereiro";
            case 3  -> mesSelecionado = "Março";
            case 4  -> mesSelecionado = "Abril";
            case 5  -> mesSelecionado = "Maio";
            case 6  -> mesSelecionado = "Junho";
            case 7  -> mesSelecionado = "Julho";
            case 8  -> mesSelecionado = "Agosto";
            case 9  -> mesSelecionado = "Setembro";
            case 10 -> mesSelecionado = "Outubro";
            case 11 -> mesSelecionado = "Novembro";
            case 12 -> mesSelecionado = "Dezembro";
            default -> mesSelecionado = null;
        }

        if (mesSelecionado != null) {
            System.out.println("Mês selecionado: " + mesSelecionado);
        } else {
            System.out.println("Número inválido. Informe um valor entre 1 e 12.");
        }

        entrada.close();
    }
}
