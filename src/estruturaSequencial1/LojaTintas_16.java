package estruturaSequencial1;

import java.util.Scanner;

/***
 *
 * Questão 16
 *
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 *
 */

public class LojaTintas_16 {
    public static void main(String[] args){

        double litros, latas, metros, total;// Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Digite a quantidade de metros quadrados a serem pintados ");
        litros = entrada.nextDouble();

        double precoLitro = 80.0;
        double capacidadeLitro = 18;

        litros = metros/3;
        latas = litros / capacidadeLitro;

        total = latas*precoLitro;

        System.out.println("Você usara " + latas + " latas de tinta");
        System.out.println("O preco total é de: R$  " + total);
    }
}
