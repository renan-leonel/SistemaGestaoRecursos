package trab1.functions;

import java.util.Scanner;

import trab1.recursos.RecursosHumanos;

public class auto {

    public static void distruibuicao(RecursosHumanos pessoas){
        Scanner input = new Scanner(System.in);

        int x = 0;
        System.out.println("Selecione para qual pessoa deseja distribuir: ");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente\n");

        x = input.nextInt();
        switch(x){
            case 1:
                System.out.println("Aluno recebe: \nLápis\nCaderno\nCaneta\n");
                pessoas.distribuiMateriais(1);
                break;
            case 2:
                System.out.println("Cozinheiro recebe: \nSabão em barra\n");
                pessoas.distribuiMateriais(2);

                break;
            case 3:
                System.out.println("Instrutor recebe: \nCaneta\nQuadro Branco\nQuadro Negro\n");
                pessoas.distribuiMateriais(3);

                break;
            case 4:
                System.out.println("Monitor recebe: \nCaneta\n");
                pessoas.distribuiMateriais(4);

                break;
            case 5:
                System.out.println("Professor recebe: \nLivros\nGiz\nApagador\nPincel\n");
                pessoas.distribuiMateriais(5);

                break;
            case 6:
                System.out.println("Servente recebe: \nAlvejante\nÁgua sanitária\nSabão em pó\n");
                pessoas.distribuiMateriais(6);

                break;
            default:
                System.out.println("erro");
                return;
        }

    }
}
