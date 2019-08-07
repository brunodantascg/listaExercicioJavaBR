package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 13
 *
 * Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */

public class DiasDaSemana_13 {
    public void exibirDia(){

        System.out.println("13 - Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.");

        int dia;

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe valor da Hora R$: ");
        dia = entrada.nextInt();

        switch (dia){
            case 1:
                System.out.println("1- Domingo.");
                break;
            case 2:
                System.out.println("2- Segunda.");
                break;
            case 3:
                System.out.println("3- Terça.");
                break;
            case 4:
                System.out.println("4- Quarta.");
                break;
            case 5:
                System.out.println("5- Quinta.");
                break;
            case 6:
                System.out.println("6- Sexta.");
                break;
            case 7:
                System.out.println("7- Sabádo.");
                break;
            default:
                System.out.println("Dia errado...");
        }

    }
}
