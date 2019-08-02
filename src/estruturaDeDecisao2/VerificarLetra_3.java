package estruturaDeDecisao2;

import java.util.Scanner;

/***
 * Questão 3
 *
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */


public class VerificarLetra_3 {
    public void exibirVerificarLetra(){

        String sexo;

        System.out.println("3 - Faça um Programa que verifique se uma letra digitada é \"F\" ou \"M\". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.");

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe letra: "); // Pedido nome
        sexo = entrada.next();

        if((sexo == "F") || (sexo == "M")){
            if(sexo == "F"){
                System.out.println("F - Feminino.");
            } else{
                System.out.println("M - Masculino.");
            }
        } else{
            System.out.println("Sexo Inválido.");
        }

    }
}
