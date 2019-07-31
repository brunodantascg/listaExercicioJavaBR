package estruturaSequencial1;

import java.util.Scanner;

/***
 *
 * Questão 17
 *
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
 * comprar apenas latas de 18 litros;
 * comprar apenas galões de 3,6 litros;
 * misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 *
 */

public class LojaTintaCompleta_17 {
    public static void main(String[] args){

        double litros, latas, total, precoLitro = 80.0, capacidadeLitro = 18, metros;// Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Digite a quantidade de metros quadrados a serem pintados ");
        litros = entrada.nextDouble();

        litros = metros/3;
        latas = litros / capacidadeLitro;

        total = latas * precoLitro;

        System.out.println("Você usara " + latas + " latas de tinta");
        System.out.println("O preco total é de: R$  " + total);

    }
}
