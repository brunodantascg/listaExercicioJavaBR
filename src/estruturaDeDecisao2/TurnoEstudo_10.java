package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 10
 *
 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

public class TurnoEstudo_10 {
    public void exibirTurnoEstudo(){

        String turno;

        System.out.println("10 - Faça um Programa que pergunte em que turno você estuda.");

        Scanner entrada = new Scanner(System.in); // Entrada do usuário
        System.out.println("Informe turno que você estuda: "); // Informar turno
        turno = entrada.next();

        turno.toLowerCase();

        if(turno == "m"){
            System.out.println("M-matutino");
        }
        if(turno == "v"){
            System.out.println("V-Vespertino");
        }
        if(turno == "n"){
            System.out.println("N- Noturno");
        }
    }
}
