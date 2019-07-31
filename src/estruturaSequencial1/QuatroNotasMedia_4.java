package estruturaSequencial1;

/***
 * * Questão 4
 *
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 *
 */

import java.util.Scanner;

public class QuatroNotasMedia_4 {
    public static void main(String[] args){

        float numeroUm, numeroDois, numeroTres, numeroQuatro, media; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe primeiro número: "); // Pedido da primeiro nota
        numeroUm = entrada.nextFloat();
        System.out.println("Informe segundo número: "); // Pedido da segundo nota
        numeroDois = entrada.nextFloat();
        System.out.println("Informe terceiro número: "); // Pedido da terceira nota
        numeroTres = entrada.nextFloat();
        System.out.println("Informe quarto número: "); // Pedido da quarta nota
        numeroQuatro = entrada.nextFloat();

        media = (numeroUm + numeroDois + numeroTres + numeroQuatro) / 4; // Média das notas

        System.out.println("A Média das notas: " + media); // Impressão do resultado

    }
}
