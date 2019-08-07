package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 15
 *
 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
 * Dicas:
 * Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
 * Triângulo Equilátero: três lados iguais;
 * Triângulo Isósceles: quaisquer dois lados iguais;
 * Triângulo Escaleno: três lados diferentes;
 */

public class Triangulo_15 {
    public void exibirTriangulo(){

        System.out.println("15 - Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.");

        double lado1, lado2, lado3;

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe primeira lado: ");
        lado1 = entrada.nextDouble();
        System.out.println("Informe segundo lado: ");
        lado2 = entrada.nextDouble();
        System.out.println("Informe terceiro lado: ");
        lado3 = entrada.nextDouble();

        if((lado1 + lado2 > lado3) || (lado2 + lado3 > lado3) || (lado1 + lado3 > lado3)){
            if((lado1 == lado2) && (lado1 == lado3)){
                System.out.println("Triângulo Equilátero!");
            }else if((lado1 == lado2) || (lado2 == lado3)){
                System.out.println("Triângulo Isósceles!");
            }else{
                System.out.println("Triângulo Escaleno!");
            }
        }else{
            System.out.println("Não é triangulo");
        }

    }
}
