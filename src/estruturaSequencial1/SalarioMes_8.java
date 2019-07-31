package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 8
 *
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês
 *
 */

public class SalarioMes_8 {
    public static void main(String[] args){

        double salario, ganhoHora; // Variáveis utilizadas na questão
        int horaTrabalhada;

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe quanto você ganha por hora R$: "); // Pedido de ganho por hora (R$)
        ganhoHora = entrada.nextDouble();
        System.out.println("Informe quantas horas trabalhou: "); // Pedido horas de trabalho
        horaTrabalhada = entrada.nextInt();

        salario = ganhoHora * horaTrabalhada;

        System.out.println("Seu salário é R$: " + salario); // Impressão do resultado

    }
}

