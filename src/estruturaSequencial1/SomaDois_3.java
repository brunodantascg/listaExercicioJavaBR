package estruturaSequencial1; /***
 * Questão 3
 *
 * Faça um Programa que peça dois números e imprima a soma.
 *
 */

import java.util.Scanner;

public class SomaDois_3 {
    public static void main(String[] args){

        float numeroUm, numeroDois, soma; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe primeiro número: "); // Pedido primeiro número
        numeroUm = entrada.nextFloat();
        System.out.println("Informe segundo número: "); // Pedido segundo número
        numeroDois = entrada.nextFloat();

        soma = numeroUm + numeroDois; // soma dos dois números

        System.out.println("A soma é: " + soma); // Impressão do resultado

    }
}
