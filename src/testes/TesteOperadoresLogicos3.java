package testes;

/***
 * && é igual a AND (os dois valores verdadeiros)
 * || é igual a OR (um dos dois valores verdadeiros)
 *
 */

public class TesteOperadoresLogicos3 {
    public static void main(String[] args){
        int idade = 17;
        double salario = 1000;

        System.out.println((idade >= 18) && (salario >= 1000));
        System.out.println((idade >= 18) || (salario >= 1000));
    }
}
