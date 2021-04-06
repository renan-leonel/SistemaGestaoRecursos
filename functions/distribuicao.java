package trab1.functions;

import java.util.Scanner;

import trab1.recursos.*;
import trab1.material.*;

public class distribuicao {

    public static void distruibuicaoMat(RecursosHumanos pessoas){
        Scanner input = new Scanner(System.in);

        int x = 0;
        System.out.println("Selecione para qual pessoa deseja distribuir: ");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente\n");

        x = input.nextInt();
        switch(x){
            case 1:
                System.out.println("\nAluno recebe: \nLápis\nCaderno\nCaneta\n");
                pessoas.distribuiMateriais(1);
                break;
            case 2:
                System.out.println("\nCozinheiro recebe: \nSabão em barra\n");
                pessoas.distribuiMateriais(2);

                break;
            case 3:
                System.out.println("\nInstrutor recebe: \nCaneta\nQuadro Branco\nQuadro Negro\n");
                pessoas.distribuiMateriais(3);

                break;
            case 4:
                System.out.println("\nMonitor recebe: \nCaneta\n");
                pessoas.distribuiMateriais(4);

                break;
            case 5:
                System.out.println("\nProfessor recebe: \nLivros\nGiz\nApagador\nPincel\n");
                pessoas.distribuiMateriais(5);

                break;
            case 6:
                System.out.println("\nServente recebe: \nAlvejante\nÁgua sanitária\nSabão em pó\n");
                pessoas.distribuiMateriais(6);

                break;
            default:
                System.out.println("erro");
                return;
        }
    }

    public static void mensal(RecursosHumanos pessoas){
        Scanner input = new Scanner(System.in);

        int x = 0;
        System.out.println("\nDigite o número do mês em que deseja distribuir: ");

        x = input.nextInt();

        switch(x){
            case 1:
                System.out.println("\nDistribuição de recursos materiais em Janeiro\n");
                distruibuicaoMat(pessoas);
                break;
                
            case 2:
                System.out.println("\nDistribuição de recursos materiais em Fevereiro\n");
                distruibuicaoMat(pessoas);
                break;

            case 3:
                System.out.println("\nDistribuição de recursos materiais em Marco\n");
                distruibuicaoMat(pessoas);
                break;

            case 4:
                System.out.println("\nDistribuição de recursos materiais em Abril\n");
                distruibuicaoMat(pessoas);
                break;

            case 5:
                System.out.println("\nDistribuição de recursos materiais em Maio\n");
                distruibuicaoMat(pessoas);
                break;

            case 6:
                System.out.println("\nDistribuição de recursos materiais em Junho\n");
                distruibuicaoMat(pessoas);
                break;

            case 7:
                System.out.println("\nDistribuição de recursos materiais em Julho\n");
                distruibuicaoMat(pessoas);
                break;

            case 8:
                System.out.println("\nDistribuição de recursos materiais em Agosto\n");
                distruibuicaoMat(pessoas);
                break;

            case 9:
                System.out.println("\nDistribuição de recursos materiais em Setembro\n");
                distruibuicaoMat(pessoas);
                break;

            case 10:
                System.out.println("\nDistribuição de recursos materiais em Outubro\n");
                distruibuicaoMat(pessoas);
                break;

            case 11:
                System.out.println("\nDistribuição de recursos materiais em Novembro\n");
                distruibuicaoMat(pessoas);
                break;

            case 12:
                System.out.println("\nDistribuição de recursos materiais em Dezembro\n");
                distruibuicaoMat(pessoas);
                break;

            default:
                System.out.println("erro");
                return;
        }
    }

    public static void relatorioSemanal(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        System.out.println("\nSexta-Feira! Aqui está o relatório do estoque da semana: \n");

        RecursosMateriais.gerarRelatorio(didatico, escolar, limpeza);
    }

}
