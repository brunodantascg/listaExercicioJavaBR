package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 20
 *
 * Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
 *
 * a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
 * b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
 * c. A mensagem "Aprovado com Distinção", se a média for igual a 10.
 *
 */

public class TresNotas_20 {
    public void exibirTresNotas(){

        double nota1, nota2, nota3;

        System.out.println("9 - Faça um Programa para leitura de três notas parciais de um aluno.");

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Informe terceira nota: ");
        nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 0 && media <=10){
            if(media >= 7 && media <= 10){
                if(media >= 7 && media < 10){
                    System.out.println("Aprovado. " + media);
                }else{
                    System.out.println("Aprovado com Distinção. " + media);
                }
            }else{
                System.out.println("Reprovado. " + media);
            }
        }else{
            System.out.println("Média errada!");
        }
    }
}
