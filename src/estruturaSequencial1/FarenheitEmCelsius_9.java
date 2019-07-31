package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 9
 *
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
 *      C = (5 * (F-32) / 9).
 **/

public class FarenheitEmCelsius_9 {
    public static void main(String[] args){

        double temFareheint, temCelsius; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe temperatura Ferenheit: "); // Pedido de temperatura Ferenheit
        temFareheint = entrada.nextDouble();

        temCelsius = (temFareheint-32)/1.8;

        System.out.println("A temperatura Ferenheit " + temFareheint + " é equivalente a " + temCelsius + " Celsius."); // Impressão do resultado

    }
}
