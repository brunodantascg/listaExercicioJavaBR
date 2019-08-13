package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 17
 *
 * Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
 */

public class AnoBissexto_17{
    public void exibirAnoBissexto(){

        System.out.println("17 - Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.");

        int ano;

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe ano: ");
        ano = entrada.nextInt();

        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
            // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }

    }
}
