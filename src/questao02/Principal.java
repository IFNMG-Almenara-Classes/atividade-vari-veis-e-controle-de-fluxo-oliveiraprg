package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita peso
        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();

        // Solicita altura
        System.out.print("Digite sua altura (m): ");
        double altura = entrada.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Determina classificação
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25.0) {
            classificacao = "Saudável";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade Grau II (Severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        // Exibe resultado formatado com duas casas decimais
        System.out.printf("Seu IMC é %.2f e você está %s%n", imc, classificacao);

        entrada.close();
    }
}
