package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 12
 *
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 *
 */

public class PesoIdeal_12 {
    public static void main(String[] args){

        double altura, pesoIdeal; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe primeiro número: "); // Pedido altura
        altura = entrada.nextDouble();

        pesoIdeal = (72.7*altura)-58; // calculo do peso ideal

        System.out.println("Peso Ideal: " + pesoIdeal); // Impressão do resultado
    }
}
