package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 19
 *
 * Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
 *
 * Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
 * 326 = 3 centenas, 2 dezenas e 6 unidades
 * 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 *
 */

public class Numero_19 {
    public void exibirNumero(){

        System.out.println("19 - Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo");

        double num;

        while(true){
            Scanner entrada = new Scanner(System.in); // Entrada do usuário
            System.out.println("Informe número: ");
            num = entrada.nextDouble();

            if(num >= 0 && num <= 1000){
                break;
            }else{
                System.out.println("O número tem que ser maior do que 0 ou menor ou igual a 1000.");
            }
        }









    }
}
