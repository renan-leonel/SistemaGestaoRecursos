package trab1.functions;

import java.util.Scanner;
import trab1.material.*;
import trab1.recursos.*;

public class Operacoes {
    public static void operarPessoas(RecursosHumanos pessoas){
        Scanner input = new Scanner(System.in);

        int x = 0;

        while (x != 7) {
            System.out.println("Selecione a ação desejada: ");
            System.out.println("1 -> Inserir: ");
            System.out.println("2 -> Consultar: ");
            System.out.println("3 -> Remover: ");
            System.out.println("4 -> Atualizar: ");
            System.out.println("5 -> Listar: ");
            System.out.println("6 -> Distribuir: ");
            System.err.println("7 -> Sair: ");
            x = input.nextInt();

            switch(x){
                case 1:
                    RecursosHumanos.insere();
                    break;
                case 2:
                    RecursosHumanos.consulta();
                    break;
                case 3:
                    RecursosHumanos.remove();
                    break;
                case 4:
                    RecursosHumanos.atualiza();
                    break;
                case 5:
                    RecursosHumanos.list();
                    break;
                case 6:
                    auto.distruibuicao(pessoas);
                    break;
                case 7:
                    System.err.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Erro");
            }
        }
    }

    public static void operarMateriais(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza, RecursosHumanos pessoas){
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
