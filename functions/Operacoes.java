package trab1.functions;

import java.util.Scanner;
import trab1.material.*;
import trab1.recursos.*;

public class Operacoes {
    public static void operarPessoas(RecursosHumanos recursos){
        
    }

    public static void operarMateriais(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        int x = 0;

        while (x != 6) {
            System.out.println("Selecione a ação desejada: ");
            System.out.println("1 -> Cadastrar: ");
            System.out.println("2 -> Atualizar: ");
            System.out.println("3 -> Remover: ");
            System.out.println("4 -> Gerar relatório: ");
            System.out.println("5 -> Buscar dados: ");
            System.err.println("6 -> Sair: ");
            x = input.nextInt();

            switch (x) {
                case 1:
                    RecursosMateriais.cadastrar(didatico, escolar, limpeza);
                    break;
                case 2:
                    RecursosMateriais.atualizar(didatico, escolar, limpeza);
                    break;
                case 3:
                    RecursosMateriais.remover(didatico, escolar, limpeza);
                    break;
                case 4:
                    RecursosMateriais.gerarRelatorio(didatico, escolar, limpeza);
                    break;
                case 5:
                    RecursosMateriais.buscarDados(didatico, escolar, limpeza);
                    break;
                case 6:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("erro");
            }
        }
    }
}
