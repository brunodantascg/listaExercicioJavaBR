package estruturaDeDecisao2;

/***
 * Questões da lista de ESTRUTURA DE DECISÃO
 *
 * Obs: Apenas chamadas de métodos, uma apalicação a POO
 */

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args){

        int questao;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe qual questão: 1 até 26 (0 - Sair) "); // Pedir número de questão
        questao = entrada.nextInt();

        switch(questao){

            case 1:
                MaiorDeles_1 maior = new MaiorDeles_1();
                maior.exibirMaiorDeles();
                break;
            case 2:
                PositivoNegativo_2 positivo = new PositivoNegativo_2();
                positivo.exibirPositivoNegativo();
                break;
            case 3:
                VerificarLetra_3 letra = new VerificarLetra_3();
                letra.exibirVerificarLetra();
                break;

            //case 4:
                // case 5:
                //case 6:
                //case 7:
                //case 8:
                //case 9:
                //case 10:

            default:
                System.out.println("Informe valor correto! Questão de 1 até 26.");
        }



    }
}
