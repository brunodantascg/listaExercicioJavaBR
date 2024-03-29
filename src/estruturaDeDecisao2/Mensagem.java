package estruturaDeDecisao2;

/***
 * Questões da lista de ESTRUTURA DE DECISÃO
 *
 * Obs: Apenas chamadas de métodos, uma apalicação a POO
 */

import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args){

        int questao;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe qual questão: 1 até 26 (0 - Sair) "); // Pedir número de questão
        questao = entrada.nextInt();

        switch(questao){

            case 1:
                MaiorDeles_1 maior = new MaiorDeles_1();
                maior.exibirMaiorDeles();
                break;
            case 2:
                PositivoNegativo_2 positivo = new PositivoNegativo_2();
                positivo.exibirPositivoNegativo();
                break;
            case 3:
                VerificarLetra_3 letra = new VerificarLetra_3();
                letra.exibirVerificarLetra();
                break;
            case 4:
                VogalConsoante_4 vogal = new VogalConsoante_4();
                vogal.exibirVogalConsoante();
                break;
            case 5:
                Media_5 media = new Media_5();
                media.exibirMedia();
                break;
            case 6:
                MaiorTresNumeros_6 tres = new MaiorTresNumeros_6();
                tres.exibirMaiorTresNumeros();
                break;
            case 7:
                MaiorMenorTresNumeros_7 maiorMenor = new MaiorMenorTresNumeros_7();
                maiorMenor.exibirMaiorMenorTresNumeros();
                break;
            case 8:
                MaisBarato_8 menor = new MaisBarato_8();
                menor.exibirMaiorTresNumeros();
                break;
            case 9:
                Decrescente_9 decrescente = new Decrescente_9();
                decrescente.exibirDecrescente();
                break;
            case 10:
                TurnoEstudo_10 turno = new TurnoEstudo_10();
                turno.exibirTurnoEstudo();
                break;
            case 11:
                OrganizacoesTabajara_11 tabajara = new OrganizacoesTabajara_11();
                tabajara.exibirTabajara();
                break;
            case 12:
                FolhaPagamento_12 folha = new FolhaPagamento_12();
                folha.exibirFolha();
                break;
            case 13:
                DiasDaSemana_13 dia = new DiasDaSemana_13();
                dia.exibirDia();
                break;
            case 14:
                NotasComConceito_14 notas = new NotasComConceito_14();
                notas.exibirNotas();
                break;
            case 15:
                Triangulo_15 triangulo = new Triangulo_15();
                triangulo.exibirTriangulo();
                break;
            case 16:
                RaizesQuadradas_16 raizes = new RaizesQuadradas_16();
                raizes.exibirRaizes();
                break;
            case 17:
                AnoBissexto_17 ano = new AnoBissexto_17();
                ano.exibirAnoBissexto();
                break;
            case 18:
                DataValida_18 data = new DataValida_18();
                data.exibirDataValida();
                break;
            case 19:
                Numero_19 numero = new Numero_19();
                numero.exibirNumero();
                break;
            case 20:
                TresNotas_20 tresNotas = new TresNotas_20();
                tresNotas.exibirTresNotas();
                break;
        }
    }
}
