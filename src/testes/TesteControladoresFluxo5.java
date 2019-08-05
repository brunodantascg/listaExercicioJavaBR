package testes;

public class TesteControladoresFluxo5 {
    public static void main(String[] args) {

        int valor1 = 100, valor2 = 200, valor3 = 300;

        if(valor1 == 101){
            System.out.println("Primero");
        }else if(valor2 == valor3){
            System.out.println("Segundo");
        }else{
            System.out.printf("Nenhuma das alternativas");
        }

    }
}
