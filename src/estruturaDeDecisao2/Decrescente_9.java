package estruturaDeDecisao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/***
 * Questão 9
 *
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

public class Decrescente_9 {
    public void exibirDecrescente(){

        double num1, num2, num3;

        System.out.println("9 - Faça um Programa que leia três números e mostre-os em ordem decrescente.");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe primeira número: "); // Informar primeiro número
        num1 = entrada.nextDouble();
        System.out.println("Informe primeira número: "); // Informar segundo número
        num2 = entrada.nextDouble();
        System.out.println("Informe primeira número: "); // Informar terceiro número
        num3 = entrada.nextDouble();

        List numeros = new ArrayList<>();

        System.out.println("Ordem em que os números foram adc: " + numeros);

        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        Collections.sort(numeros);
        Collections.reverse(numeros);

        System.out.println("Ordem decrescente" + numeros);

    }

}
