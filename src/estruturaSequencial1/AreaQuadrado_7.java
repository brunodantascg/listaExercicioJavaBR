package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 7
 *
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 *
 */

public class AreaQuadrado_7 {
    public static void main(String[] args){

        double lado;

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe valor do lado: "); // Pedido do valor do lado
        lado = entrada.nextFloat();

        double area = lado * lado;

        System.out.println("Valor da área do quadrado: " + area); // Impressão do resultado
    }
}
