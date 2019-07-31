package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 15
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 *       salário bruto.
 *       quanto pagou ao INSS.
 *       quanto pagou ao sindicato.
 *       o salário líquido.
 *       calcule os descontos e o salário líquido, conforme a tabela abaixo:
 *       + Salário Bruto : R$
 *       - IR (11%) : R$
 *       - INSS (8%) : R$
 *       - Sindicato ( 5%) : R$
 *       = Salário Liquido : R$
 *       Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

public class SalarioComDesconto_15 {
    public static void main(String[] args){

        double peso, pesoExcedente; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe peso: "); // Pedido altura
        peso = entrada.nextDouble();

        pesoExcedente = 50 - peso;

        System.out.println("Peso excedente: " + pesoExcedente);


    }
}
