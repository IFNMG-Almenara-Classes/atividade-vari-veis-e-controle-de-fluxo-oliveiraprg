package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida do primeiro lado: ");
        double lado1 = entrada.nextDouble();

        System.out.print("Digite a medida do segundo lado: ");
        double lado2 = entrada.nextDouble();

        System.out.print("Digite a medida do terceiro lado: ");
        double lado3 = entrada.nextDouble();

        boolean formaTriangulo =  (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if (!formaTriangulo) {
            System.out.println("As medidas não formam um triângulo válido.");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        }

        entrada.close();
    }
}
