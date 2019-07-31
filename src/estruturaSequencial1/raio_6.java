package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 6
 *
 * Faça um Programa que peça o raio_6 de um círculo, calcule e mostre sua área.
 *
 */

public class raio_6 {
    public static void main(String[] args){

        double raio;

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe valor do raio_6: "); // Pedido do raio_6
        raio = entrada.nextFloat();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("Valor da área do círculo: " + area); // Impressão do resultado
    }
}
