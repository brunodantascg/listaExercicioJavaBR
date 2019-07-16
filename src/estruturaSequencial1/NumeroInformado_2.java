package estruturaSequencial1; /***
 * Questão 2
 *
 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 *
 */

import java.util.Scanner;

public class NumeroInformado_2 {

    public static void main(String[] args){

        float numero;

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe número: "); // Frase da tela pedindo número de entrada ao usuário
        numero = entrada.nextFloat();

        System.out.println("O número informado foi: "+ numero);
    }
}
