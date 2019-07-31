package estruturaSequencial1;

import java.util.Scanner;

/***
 * Questão 18
 *
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 *
 */


public class Download_18 {
    public static void main(String[] args){

        double tamanho, velocidade;// Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Tamanho do arquivo (MB): ");
        tamanho = entrada.nextDouble();
        System.out.println("Velocidade de Internet (MBps): ");
        velocidade = entrada.nextDouble();

        System.out.println("Tempo aproximado de download: " + ((tamanho/velocidade)*60)+ " Minutos.");
    }
}
