package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 11
 *
 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 * A - o produto do dobro do primeiro com metade do segundo .
 * B - a soma do triplo do primeiro com o terceiro.
 * C - o terceiro elevado ao cubo.
 */

public class CalculoTresNumeros_11 {
    public static void main(String[] args){

        int num1, num2; // Variáveis utilizadas na questão
        double num3;

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe primeiro número: "); // Pedido primeiro número
        num1 = entrada.nextInt();
        System.out.println("Informe segundo número: "); // Pedido segundo número
        num2 = entrada.nextInt();
        System.out.println("Informe terceiro número: "); // Pedido terceiro número
        num3 = entrada.nextDouble();

        double a = (2*num1)*(num2/2);
        double b = (3*num1)+num3;
        double c = Math.pow(num3, 3);

        System.out.println("Resultados: A - " + a + ", B - " + b + ", C -" + c); // Impressão do resultado
    }
}
