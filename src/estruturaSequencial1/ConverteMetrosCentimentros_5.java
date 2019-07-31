package estruturaSequencial1;

/***
 * Questão 5
 *
 * Faça um Programa que converta metros para centímetros.
 *
 */

import java.util.Scanner;

public class ConverteMetrosCentimentros_5 {
    public static void main(String[] args){

        int metros;
        float cem;

        Scanner entrada = new Scanner(System.in); // Entrada de metros pelo usuário
        System.out.println("Informe quantos metros: "); // Pedido metros
        metros = entrada.nextInt();

        cem = metros * 100;

        System.out.println(metros + " m = " + cem + " cm"); // Impressão do resultado

    }
}
