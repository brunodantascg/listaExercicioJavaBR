package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 2
 *
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

public class PositivoNegativo_2 {
    public void exibirPositivoNegativo(){

        double num;

        System.out.println("2 - Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe primeiro número: "); // Pedido nome
        num = entrada.nextDouble();

        if(num >= 0){
            if(num == 0){
                System.out.println(num + " é Neutro.");
            } else {
                System.out.println(num + " é Positivo.");
            }
        } else{
            System.out.println(num + " é Negativo.");
        }

    }
}
