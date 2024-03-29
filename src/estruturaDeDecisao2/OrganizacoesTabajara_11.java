package estruturaDeDecisao2;

/***
 * Questão 11
 *
 * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
 * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
 * salários até R$ 280,00 (incluindo) : aumento de 20%
 * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 * salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
 * o salário antes do reajuste;
 * o percentual de aumento aplicado;
 * o valor do aumento;
 * o novo salário, após o aumento.
 */

import java.util.Scanner;

public class OrganizacoesTabajara_11 {
    public void exibirTabajara(){

        double salario;

        System.out.println("11 - Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério.");

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe seu Salário R$: "); // Informar salário pelo usuário
        salario = entrada.nextDouble();

        if(salario < 280){
            salario += salario*0.20;
        }else if((salario >= 280) && (salario < 700)){
            salario += salario*0.15;
        }else if((salario >= 700) && (salario < 1500)){
            salario += salario*0.10;
        }else{
            salario += salario*0.05;
        }
        System.out.println("Imposto R$: " + salario);
    }
}
