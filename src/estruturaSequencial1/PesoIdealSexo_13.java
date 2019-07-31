package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 13
 *
 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * a. Para homens: (72.7*h) - 58
 * b. Para mulheres: (62.1*h) - 44.7
 *
 */

public class PesoIdealSexo_13 {
    public static void main(String[] args){

        double altura, pesoIdealM, pesoIDealF; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe altura: "); // Pedido altura
        altura = entrada.nextDouble();

        pesoIdealM = (72.7*altura)-58;
        pesoIDealF = (62.1*altura)-44.7;

        System.out.println("Peso Ideal para:"); // Impressão dos resultados
        System.out.println("Para Homens: " + pesoIdealM);
        System.out.println("Para Mulheres: " + pesoIDealF);
    }
}
