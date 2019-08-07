package testes;

import java.util.Scanner;

/***
 * Criar uma variavel salario e imprima seu imposto
 *imposto:
 * salario < 1000 - 5%
 * salario >= 1000  && salario < 2000 - 10%
 * salario >= 2000  && salario < 4000 - 15%
 * salario > 5000 - 20%
 */

public class TesteFluxo6 {
    public static void main(String[] args){

        double salario;

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe Salário R$: "); // Informar salario
        salario = entrada.nextDouble();

        if(salario < 1000){
            salario = salario*0.05;
            System.out.println("Imposto R$: " + salario);
        }else if((salario >= 1000) && (salario < 2000)){
            salario = salario*0.10;
            System.out.println("Imposto R$: " + salario);
        }else if((salario >= 2000) && (salario < 4000)){
            salario = salario*0.15;
            System.out.println("Imposto R$: " + salario);
        }else{
            salario = salario*0.20;
            System.out.println("Imposto R$: " + salario);
        }

    }
}
