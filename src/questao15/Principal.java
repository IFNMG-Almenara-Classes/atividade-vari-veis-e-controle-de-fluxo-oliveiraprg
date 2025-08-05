package questao15;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número (1 a 12) para exibir o mês correspondente: ");
        int mes = entrada.nextInt();

        String nomeDoMes;
        switch (mes) {
            case 1  -> nomeDoMes = "Janeiro";
            case 2  -> nomeDoMes = "Fevereiro";
            case 3  -> nomeDoMes = "Março";
            case 4  -> nomeDoMes = "Abril";
            case 5  -> nomeDoMes = "Maio";
            case 6  -> nomeDoMes = "Junho";
            case 7  -> nomeDoMes = "Julho";
            case 8  -> nomeDoMes = "Agosto";
            case 9  -> nomeDoMes = "Setembro";
            case 10 -> nomeDoMes = "Outubro";
            case 11 -> nomeDoMes = "Novembro";
            case 12 -> nomeDoMes = "Dezembro";
            default -> nomeDoMes = null;
        }

        if (nomeDoMes != null) {
            System.out.println("Mês selecionado: " + nomeDoMes);
        } else {
            System.out.println("Número inválido. Informe um valor entre 1 e 12.");
        }

        entrada.close();
    }
}
