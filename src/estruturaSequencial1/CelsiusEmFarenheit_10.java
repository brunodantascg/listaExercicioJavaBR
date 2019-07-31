package estruturaSequencial1;

import java.util.Scanner;

/***
 * * Questão 10
 *
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
 *
 */

public class CelsiusEmFarenheit_10 {
    public static void main(String[] args){

        double temFareheint, temCelsius; // Variáveis utilizadas na questão

        Scanner entrada = new Scanner(System.in); // Entrada do número com o usuário
        System.out.println("Informe temperatura Celsius: "); // Pedido de temperatura Celsius
        temCelsius = entrada.nextDouble();

        temFareheint = temCelsius*1.8+32;

        System.out.println("A temperatura Celsius " + temCelsius + " é equivalente a " + temFareheint + " Farenheit."); // Impressão do resultado

    }
}
