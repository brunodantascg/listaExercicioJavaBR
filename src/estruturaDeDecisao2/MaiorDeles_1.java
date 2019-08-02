package estruturaDeDecisao2;

/***
 * Questão 1
 *
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

import java.util.Scanner;

public class MaiorDeles_1 {
    public void exibirMaiorDeles(){

        double num1, num2;

        System.out.println("1 - Faça um Programa que peça dois números e imprima o maior deles.");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe primeiro número: "); // Pedido nome
        num1 = entrada.nextDouble();
        System.out.println("Informe segundo número: "); // Pedido nome
        num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.println("O maior número é: " + num1);
        } else{
            System.out.println("O maior número é: " + num2);
        }

    }
}
