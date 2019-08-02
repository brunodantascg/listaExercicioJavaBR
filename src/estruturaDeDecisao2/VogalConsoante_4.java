package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 4
 *
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

public class VogalConsoante_4 {
    public void exibirVogalConsoante(){

        String letra;

        System.out.println("4 - Faça um Programa que verifique se uma letra digitada é vogal ou consoante.");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe letra: "); // Pedido letra
        letra = entrada.next();

        letra.toLowerCase();

        if((letra == "a") || (letra == "e") || (letra == "i") || (letra == "o") || (letra == "u")){
            System.out.println(letra + " é Vogal.");
        } else{
            System.out.println(letra + " é Consoante.");
        }

    }
}
