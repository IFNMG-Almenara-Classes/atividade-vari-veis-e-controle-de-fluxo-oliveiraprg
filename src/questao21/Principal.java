package questao21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do trabalhador: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o tempo de serviço (em anos): ");
        int tempoDeServico = entrada.nextInt();

        boolean aposentadoriaPorIdade = (idade >= 65);
        boolean aposentadoriaPorTempo = (tempoDeServico >= 30);
        boolean aposentadoriaPorIdadeETempo = (idade >= 60 && tempoDeServico >= 25);

        if (aposentadoriaPorIdade || aposentadoriaPorTempo || aposentadoriaPorIdadeETempo) {
            System.out.println("O trabalhador PODE se aposentar.");
        } else {
            System.out.println("O trabalhador NÃO pode se aposentar.");
        }

        entrada.close();
    }
}
