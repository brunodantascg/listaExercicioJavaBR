package testes;

public class TesteOperadoresAtribuicao4 {
    public static void main(String[] args) {
        // =, +=, -=, *=, %=, /=

        double salario = 1800, salario1 = 1800, salario2 = 1800, salario3 = 1800;

        System.out.println(salario+=salario);
        System.out.println(salario1-=salario1);
        System.out.println(salario2*=2);
        System.out.println(salario3/=2);
    }
}
