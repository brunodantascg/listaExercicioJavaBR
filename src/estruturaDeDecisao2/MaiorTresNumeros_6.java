package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 6
 *
 * Faça um Programa que leia três números e mostre o maior deles.
 */

public class MaiorTresNumeros_6 {
    public void exibirMaiorTresNumeros(){

        double num1, num2, num3;

        System.out.println("6 - Faça um Programa que leia três números e mostre o maior deles.");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe primeira nota: "); // Pedido primeiro número
        num1 = entrada.nextDouble();
        System.out.println("Informe segunda nota: "); // Pedido segundo número
        num2 = entrada.nextDouble();
        System.out.println("Informe segunda nota: "); // Pedido terceiro número
        num3 = entrada.nextDouble();

        if((num1 > num2) && (num1 > num3)){
            System.out.println(num1 + " é o Maior.");
        }
        if((num2 > num1) && (num2 > num3)){
            System.out.println(num2 + " é o Maior.");
        }
        if((num3 > num2) && (num3 > num1)){
            System.out.println(num3 + " é o Maior.");
        }
        if((num1 < num2) && (num1 < num3)){
            System.out.println(num1 + " é o Menor.");
        }
        if((num2 < num1) && (num2 < num3)){
            System.out.println(num2 + " é o Menor.");
        }
        if((num3 < num2) && (num3 < num1)){
            System.out.println(num3 + " é o Menor.");
        }

    }
}
