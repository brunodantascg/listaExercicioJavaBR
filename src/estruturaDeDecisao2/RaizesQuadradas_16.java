package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 16
 *
 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
 *
 * a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
 * b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
 * c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
 * d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
 *
 */

public class RaizesQuadradas_16 {
    public void exibirRaizes(){

        System.out.println("16 - Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.");

        double a, b, c;

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe a: ");
        a = entrada.nextDouble();
        System.out.println("Informe b: ");
        b = entrada.nextDouble();
        System.out.println("Informe c: ");
        c = entrada.nextDouble();

        if(a != 0){
            //calculo do Delta
            double delta = ((Math.pow(b, 2)) - (4 * a * c)); // letra b
            if(delta < 0){
                System.out.println("O delta é negativo. Programa encerrado!");
            }else if(delta == 0){ // letra c
                double x = -b / 2 * a;
                System.out.println("O delta uma raíz real. É ela: " + x);
            }else{ // letra d
                double x1 = ((-b + delta) / 2 * a);
                double x2 = ((-b - delta) / 2 * a);
                System.out.println("A equação possui duas raiz reais. São elas: x1 " + x1 + " e x2 " + x2 );
            }

        } else{
            System.out.println("A equação não é do segundo grau. Programa encerrado!");
        }

    }
}
