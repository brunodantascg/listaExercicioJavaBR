package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 14
 *
 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
 */

public class NotasComConceito_14 {
    public void exibirDia(){

        System.out.println("14 - Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo.");

        double nota2, nota1;

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe primeira Nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe primeira Nota: ");
        nota2 = entrada.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println("1ª Nota: " + nota1);
        System.out.println("2ª Nota" + nota2);
        System.out.println("Média: " + media);


        if((media > 9) && (media <= 10)){
            System.out.println("Aprovado Conceito - A");
        }else if((media >= 7.5) && (media < 9)){
            System.out.println("Aprovado Conceito - B");
        }else if((media >= 6) && (media < 7.5)){
            System.out.println("ReprovadoConceito - C");
        }else if((media >= 4.5) && (media < 6)){
            System.out.println("Reprovado Conceito - D");
        }else{
            System.out.println("Reprovado Conceito - D");
        }

    }
}
