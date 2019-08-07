package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 12
 *
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
 *
 * Salário Bruto até 900 (inclusive) - isento
 * Salário Bruto até 1500 (inclusive) - desconto de 5%
 * Salário Bruto até 2500 (inclusive) - desconto de 10%
 * Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 */

public class FolhaPagamento_12 {
    public void exibirFolha(){
        double salario, valorHora;
        int quantHoras;
        System.out.println("12 - Faça um programa para o cálculo de uma folha de pagamento.");

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe valor da Hora R$: ");
        valorHora = entrada.nextDouble();
        System.out.println("Informe quantidades de horas: ");
        quantHoras = entrada.nextInt();

        salario = valorHora*quantHoras;

        double sindicato = salario * 0.03;
        double fgts = salario * 0.11;
        double ir;
        double inss = salario*0.10;

        if(salario < 900){
            ir = 0;
        }else if((salario >= 900) && (salario < 1500)){
            ir = salario * 0.05;
        }else if((salario >= 1500) && (salario < 2500)){
            ir = salario*0.10;
        }else{
            ir = salario*0.20;
        }

        double descontos = sindicato+ir+inss;

        System.out.println("Salário Bruto: R$"+ salario);
        System.out.println("(-) IR (5%): R$"+ ir);
        System.out.println("(-) INSS (10%): R$"+inss);
        System.out.println("FGTS (11%): R$"+fgts);
        System.out.println("Total de descontos: R$"+ (descontos));
        System.out.println("Salário Líquido: R$"+ (salario-descontos));

    }
}

