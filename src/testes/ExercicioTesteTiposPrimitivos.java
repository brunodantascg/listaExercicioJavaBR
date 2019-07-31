package testes;

import java.util.Scanner;

/***
 * Crie um algoritmo que possua variaveis para salvar os seguintes dados:
 *
 * Dados: Nome, Endereço, Telefone de uma pessoa
 *
 * Imprimir essas variaveis da seguinte forma
 *
 * O <nome> domiciliado no endereço <endereço> e telephone <telefone> não possui nenhum tipo de pendencia.
 *
 */

public class ExercicioTesteTiposPrimitivos {
    public static void main(String[] args){

        String nome, endereco, telefone;

        Scanner entrada = new Scanner(System.in); // Entrada do raio_6 pelo usuário
        System.out.println("Informe NOME: "); // Pedido nome
        nome = entrada.next();
        System.out.println("Informe ENDEREÇO: "); // Pedido endereço
        endereco = entrada.next();
        System.out.println("Informe TELEFONE: "); // Pedido telefone
        telefone = entrada.next();

        System.out.println("O "+ nome + " domiciliado no endereço " + endereco + " e telefone " + telefone + " não possui nenhum tipo de pendencia."); // Impressão do resultado
    }
}
