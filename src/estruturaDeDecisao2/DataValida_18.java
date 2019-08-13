package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 18
 *
 * Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
 */

public class DataValida_18 {
    public void exibirDataValida(){

        System.out.println("18 - Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.");

        int dia, mes, ano;

        System.out.println("Informe dd/mm/aaaa: ");

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe dia - dd: ");
        dia = entrada.nextInt();
        System.out.println("Informe mês - mm: ");
        mes = entrada.nextInt();
        System.out.println("Informe ano - aaaa: ");
        ano = entrada.nextInt();

        if(ano >= 0000 && ano <= 9999){
            if(mes > 0 && mes <=12){
                if(dia > 0 && dia <= 31){
                    System.out.println("A data é válida.");
                }else{
                    System.out.println("Data inválida.");
                }
            }else{
                System.out.println("Data inválida.");
            }
        }else{
            System.out.println("Data inválida.");
        }
    }
}
