package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 5
 *
 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * A mensagem "Reprovado", se a média for menor do que sete;
 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

public class Media_5 {
    public void exibirMedia(){

        double nota1, nota2, media;

        System.out.println("5 - Faça um programa para a leitura de duas notas parciais de um aluno...");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe primeira nota: "); // Pedido primeira nota
        nota1 = entrada.nextDouble();
        System.out.println("Informe segunda nota: "); // Pedido segunda nota
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2)/2;

        if((media >=7) ||(media <=10)){
            if(media == 10){
                System.out.println(media + " Aprovado com Distinção..");
            } else{
                System.out.println(media + " Aprovado.");
            }
        } else{
            System.out.println(media + " Reprovado.");
        }

    }
}
