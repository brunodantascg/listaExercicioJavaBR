package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 8
 *
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */

public class MaisBarato_8 {
    public void exibirMaiorTresNumeros(){

        double preco1, preco2, preco3;

        System.out.println("8 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe primeira preço: R$ "); // Informar primeiro Preço
        preco1 = entrada.nextDouble();
        System.out.println("Informe primeira preço: R$ "); // Informar segundo Preço
        preco2 = entrada.nextDouble();
        System.out.println("Informe primeira preço: R$ "); // Informar terceiro Preço
        preco3 = entrada.nextDouble();

        if((preco1 < preco2) && (preco1 < preco3)){
            System.out.println(preco1 + " é o Mais barato.");
        }
        if((preco2 < preco1) && (preco2 < preco3)){
            System.out.println(preco2 + " é o Mais barato.");
        }
        if((preco3 < preco2) && (preco3 < preco1)){
            System.out.println(preco3 + " é o Mais barato.");
        }

    }
}
