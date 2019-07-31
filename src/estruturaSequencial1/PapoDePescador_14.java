package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 14
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 *
 */

public class PapoDePescador_14 {
    public static void main(String[] args){

        double peso, pesoExcedente; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe peso: "); // Pedido altura
        peso = entrada.nextDouble();

        pesoExcedente = 50 - peso;

        System.out.println("Peso excedente: " + pesoExcedente);
    }
}
