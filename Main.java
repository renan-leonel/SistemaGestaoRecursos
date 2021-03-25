package trab1;
import java.util.Scanner;

public class Main {
    public static void cadastrar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Opção de cadastro selecionada: ");
        System.out.println("Digite a quantidade inicial de cada item: ");

        System.out.println("Material didático: ");

        System.out.println("Apagador: ");
        int apagador = input.nextInt();
        System.out.println("Giz: ");
        int giz = input.nextInt();
        System.out.println("Livros: ");
        int livros = input.nextInt();
        System.out.println("Pincel: ");
        int pincel = input.nextInt();
        System.out.println("Quadro branco: ");
        int quadroBranco = input.nextInt();
        System.out.println("Quadro negro: ");
        int quadroNegro = input.nextInt();

        System.out.println("Material escolar: ");
        
        System.out.println("Lápis: ");
        int lapis = input.nextInt();
        System.out.println("Caderno: ");
        int caderno = input.nextInt();
        System.out.println("Caneta: ");
        int caneta = input.nextInt();

        System.out.println("Material de limpeza: ");

        System.out.println("alvejante: ");
        int alvejante = input.nextInt();
        System.out.println("sabaoPo: ");
        int sabaoPo = input.nextInt();
        System.out.println("aguaSanitaria: ");
        int aguaSanitaria = input.nextInt();
        System.out.println("sabaoBarra: ");
        int sabaoBarra = input.nextInt();


        MaterialDidatico didatico = new MaterialDidatico();
        MaterialEscolar escolar = new MaterialEscolar();
        MaterialLimpeza limpeza = new MaterialLimpeza();

        //getters e setters do material didático
        didatico.setApagador(apagador);
        System.out.println(didatico.getApagador());
        didatico.setGiz(giz);
        System.out.println(didatico.getGiz());
        didatico.setLivros(livros);
        System.out.println(didatico.getLivros());
        didatico.setPincel(pincel);
        System.out.println(didatico.getPincel());
        didatico.setQuadroBranco(quadroBranco);
        System.out.println(didatico.getQuadroBranco());
        didatico.setQuadroNegro(quadroNegro);
        System.out.println(didatico.getQuadroNegro());

        //getters e setters do material escolar
        escolar.setLapis(lapis);
        System.out.println(escolar.getLapis());
        escolar.setCaderno(caderno);
        System.out.println(escolar.getCaderno());
        escolar.setCaneta(caneta);
        System.out.println(escolar.getCaneta());

        //getters e setters do material de limpeza
        limpeza.setAlvejante(alvejante);
        System.out.println(limpeza.getAlvejante());
        limpeza.setSabaoPo(sabaoPo);
        System.out.println(limpeza.getSabaoPo());
        limpeza.setAguaSanitaria(aguaSanitaria);
        System.out.println(limpeza.getAguaSanitaria());
        limpeza.setSabaoBarra(sabaoBarra);
        System.out.println(limpeza.getSabaoBarra());

        input.close();
    }

    public static void atualizar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione o tipo de material que deseja atualizar");
        System.out.println("1 - Material didático\n 2 - Material escolar\n 3 - Material de limpeza");

        int y;
        y = input.nextInt();
        switch(y){
            case 1:
                attMatDid();
                break;
            case 2:
                attMatEsc();
                break;
            case 3:
                attMatLimp();
                break;
            default:
                System.out.println("erro");
        }

        input.close();
    }

    //função que atualiza os recursos materiais
    public static void attMatDid(){
        Scanner input = new Scanner(System.in);
        MaterialDidatico didatico = new MaterialDidatico();

        System.out.println("Selecione um atributo para atualizar: ");
        System.out.println("1 - Livros\n 2 - Quadro negro\n 3 - Quadro branco\n 4 - Giz\n 5 - Apagador\n 6 - Pincel");

        int z;
        int sair = 1;
        z = input.nextInt();

        while(sair == 1){
            switch(z){
                case 1:
                    int livros = input.nextInt();
                    didatico.setLivros(livros);
                    break;
                case 2:
                    int quadroNegro = input.nextInt();
                    didatico.setLivros(quadroNegro);
                    break;
                case 3:
                    int quadroBranco = input.nextInt();
                    didatico.setLivros(quadroBranco);
                    break;
                case 4:
                    int giz = input.nextInt();
                    didatico.setLivros(giz);
                    break;
                case 5:
                    int apagador = input.nextInt();
                    didatico.setLivros(apagador);
                    break;
                case 6:
                    int pincel = input.nextInt();
                    didatico.setLivros(pincel);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("Deseja alterar outro atributo? --> 1");
            System.out.println("Deseja sair? --> 2");
            sair = input.nextInt();
        }
        input.close();
    }

    //função que atualiza os recursos escolares
    public static void attMatEsc(){
        Scanner input = new Scanner(System.in);
        MaterialEscolar escolar = new MaterialEscolar();

        System.out.println("Selecione um atributo para atualizar: ");
        System.out.println("1 - Lápis\n 2 - Caderno\n 3 - Caneta");

        int z;
        int sair = 1;
        z = input.nextInt();

        while(sair == 1){
            switch(z){
                case 1:
                    int lapis = input.nextInt();
                    escolar.setLapis(lapis);
                    break;
                case 2:
                    int caderno = input.nextInt();
                    escolar.setCaderno(caderno);
                    break;
                case 3:
                    int caneta = input.nextInt();
                    escolar.setCaneta(caneta);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("Deseja alterar outro atributo? --> 1");
            System.out.println("Deseja sair? --> 2");
            sair = input.nextInt();
        }
        input.close();
    }

    //função que atualiza os recursos de limpeza
    public static void attMatLimp(){
        Scanner input = new Scanner(System.in);
        MaterialLimpeza limpeza = new MaterialLimpeza();

        System.out.println("Selecione um atributo para atualizar: ");
        System.out.println("1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");

        int z;
        int sair = 1;
        z = input.nextInt();

        while(sair == 1){
            switch(z){
                case 1:
                    int alvejante = input.nextInt();
                    limpeza.setAlvejante(alvejante);
                    break;
                case 2:
                    int sabaoPo = input.nextInt();
                    limpeza.setSabaoPo(sabaoPo);
                    break;
                case 3:
                    int aguaSanitaria = input.nextInt();
                    limpeza.setAguaSanitaria(aguaSanitaria);
                    break;
                case 4:
                    int sabaoBarra = input.nextInt();
                    limpeza.setSabaoBarra(sabaoBarra);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("Deseja alterar outro atributo? --> 1");
            System.out.println("Deseja sair? --> 2");
            sair = input.nextInt();
        }
        input.close();
    }
    
    public static void remover(){
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione o tipo de material que deseja remover");
        System.out.println("1 - Material didático\n 2 - Material escolar\n 3 - Material de limpeza");

        int y;
        y = input.nextInt();
        switch(y){
            case 1:
                removeMatDid();
                break;
            case 2:
                removeMatEsc();
                break;
            case 3:
                removeMatLimp();
                break;
            default:
                System.out.println("erro");
        }

        input.close();
    }

    public static void removeMatDid(){

    }

    public static void removeMatEsc(){
        
    }

    public static void removeMatLimp(){
        
    }
    
    public static void gerarRelatorio(){
        Scanner input = new Scanner(System.in);
        MaterialDidatico didatico = new MaterialDidatico();
        MaterialEscolar escolar = new MaterialEscolar();
        MaterialLimpeza limpeza = new MaterialLimpeza();

        int resp;
        System.out.println("Deseja acessar o relatório?");
        resp = input.nextInt();

        if(resp == 1){
            System.out.println("Relatório de recursos materiais:");

            System.out.println("Material didático:");
            System.out.println("- Apagador: "+ didatico.getApagador());
            System.out.println("- Giz: "+ didatico.getGiz());
            System.out.println("- Livros: "+ didatico.getLivros());
            System.out.println("- Pincel: "+ didatico.getPincel());
            System.out.println("- Quadro Branco: "+ didatico.getQuadroBranco());
            System.out.println("- Quadro negro: "+ didatico.getQuadroNegro());

            System.out.println("------------------------------------");

            System.out.println("Material escolar:");
            System.out.println("- Lápis: "+ escolar.getLapis());
            System.out.println("- Caderno: "+ escolar.getCaderno());
            System.out.println("- Caneta: "+ escolar.getCaneta());

            System.out.println("------------------------------------");

            System.out.println("Material de limpeza:");
            System.out.println("- Alvejante: "+ limpeza.getAlvejante());
            System.out.println("- Sabão em pó: "+ limpeza.getSabaoPo());
            System.out.println("- Água sanitária: "+ limpeza.getAguaSanitaria());
            System.out.println("- Sabão em barra: "+ limpeza.getSabaoBarra());

        }

        else{
            System.out.println("Sem relatório");
        }

        input.close();
    }

    public static void buscarDados(){
        
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Selecione a ação desejada: ");
        System.out.println("1 -> Cadastrar: ");
        System.out.println("2 -> Atualizar: ");
        System.out.println("3 -> Remover: ");
        System.out.println("4 -> Gerar relatório: ");
        System.out.println("5 -> Buscar dados: ");

        int x;
        x= input.nextInt();

        switch(x){
            case 1:
                cadastrar();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                remover();
                break;
            case 4:
                gerarRelatorio();
                break;
            case 5:
                buscarDados();
                break;
            default:
                System.out.println("erro");
        }

        input.close();
    }
}
