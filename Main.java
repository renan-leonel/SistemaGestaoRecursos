package trab1;
import java.util.Scanner;

public class Main {
    public static void cadastrar(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        System.out.println("\nOpção de cadastro selecionada: ");
        System.out.println("\nDigite a quantidade inicial de cada item: ");

        System.out.println("------- Material didático -------");

        System.out.println("Apagador: ");
        int apagador = input.nextInt();
        didatico.setApagador(apagador);

        System.out.println("Giz: ");
        int giz = input.nextInt();
        didatico.setGiz(giz);

        System.out.println("Livros: ");
        int livros = input.nextInt();
        didatico.setLivros(livros);

        System.out.println("Pincel: ");
        int pincel = input.nextInt();
        didatico.setPincel(pincel);

        System.out.println("Quadro branco: ");
        int quadroBranco = input.nextInt();
        didatico.setQuadroBranco(quadroBranco);

        System.out.println("Quadro negro: ");
        int quadroNegro = input.nextInt();
        didatico.setQuadroNegro(quadroNegro);


        System.out.println("------- Material escolar -------");
        
        System.out.println("Lápis: ");
        int lapis = input.nextInt();
        escolar.setLapis(lapis);

        System.out.println("Caderno: ");
        int caderno = input.nextInt();
        escolar.setCaderno(caderno);

        System.out.println("Caneta: ");
        int caneta = input.nextInt();
        escolar.setCaneta(caneta);


        System.out.println("------- Material de limpeza -------");

        System.out.println("alvejante: ");
        int alvejante = input.nextInt();
        limpeza.setAlvejante(alvejante);

        System.out.println("sabaoPo: ");
        int sabaoPo = input.nextInt();
        limpeza.setSabaoPo(sabaoPo);

        System.out.println("aguaSanitaria: ");
        int aguaSanitaria = input.nextInt();
        limpeza.setAguaSanitaria(aguaSanitaria);

        System.out.println("sabaoBarra: ");
        int sabaoBarra = input.nextInt();
        limpeza.setSabaoBarra(sabaoBarra);
    }

    public static void atualizar(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione o tipo de material que deseja atualizar");
        System.out.println("\n 1 - Material didático\n 2 - Material escolar\n 3 - Material de limpeza");

        int w;
        w = input.nextInt();
        switch(w){
            case 1:
                attMatDid(didatico);
                break;
            case 2:
                attMatEsc(escolar);
                break;
            case 3:
                attMatLimp(limpeza);
                break;
            default:
                System.out.println("erro");
        }
    }

    //função que atualiza os recursos materiais
    public static void attMatDid(MaterialDidatico didatico){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione um atributo para atualizar: ");
        System.out.println("\n 1 - Livros\n 2 - Quadro negro\n 3 - Quadro branco\n 4 - Giz\n 5 - Apagador\n 6 - Pincel");

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

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
    }

    //função que atualiza os recursos escolares
    public static void attMatEsc(MaterialEscolar escolar){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione um atributo para atualizar: ");
        System.out.println("\n 1 - Lápis\n 2 - Caderno\n 3 - Caneta");

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

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
    }

    //função que atualiza os recursos de limpeza
    public static void attMatLimp(MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione um atributo para atualizar: ");
        System.out.println("\n 1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");

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

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
    }
    
    public static void remover(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione o tipo de material que deseja remover");
        System.out.println("\n 1 - Material didático\n2 - Material escolar\n3 - Material de limpeza");

        int y;
        y = input.nextInt();
        switch(y){
            case 1:
                removeMatDid(didatico);
                break;
            case 2:
                removeMatEsc(escolar);
                break;
            case 3:
                removeMatLimp(limpeza);
                break;
            default:
                System.out.println("erro");
        }
    }

    public static void removeMatDid(MaterialDidatico didatico){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione um atributo para remover: ");
        System.out.println("\n 1 - Livros\n2 - Quadro negro\n3 - Quadro branco\n4 - Giz\n5 - Apagador\n6 - Pincel");

        int z;
        int sair = 1;
        z = input.nextInt();

        while(sair == 1){
            switch(z){
                case 1:
                    didatico.setLivros(0);
                    break;
                case 2:
                    didatico.setLivros(0);
                    break;
                case 3:
                    didatico.setLivros(0);
                    break;
                case 4:
                    didatico.setLivros(0);
                    break;
                case 5:
                    didatico.setLivros(0);
                    break;
                case 6:
                    didatico.setLivros(0);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja remover outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
    }
    public static void removeMatEsc(MaterialEscolar escolar){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione um atributo para remover: ");
        System.out.println("\n 1 - Lápis\n 2 - Caderno\n 3 - Caneta");

        int z;
        int sair = 1;
        z = input.nextInt();

        while(sair == 1){
            switch(z){
                case 1:
                    escolar.setLapis(0);
                    break;
                case 2:
                    escolar.setCaderno(0);
                    break;
                case 3:
                    escolar.setCaneta(0);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja remover outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
    }

    public static void removeMatLimp(MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione um atributo para remover: ");
        System.out.println("\n 1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");

        int z;
        int sair = 1;
        z = input.nextInt();

        while(sair == 1){
            switch(z){
                case 1:
                    limpeza.setAlvejante(0);
                    break;
                case 2:
                    limpeza.setSabaoPo(0);
                    break;
                case 3:
                    limpeza.setAguaSanitaria(0);
                    break;
                case 4:
                    limpeza.setSabaoBarra(0);
                    break;
                default:
                    System.out.println("erro");
            }

            System.out.println("\nDeseja alterar outro atributo? --> 1");
            System.out.println("\nDeseja sair? --> 2");
            sair = input.nextInt();
        }
    }
    
    public static void gerarRelatorio(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        int resp;

        System.out.println("\nDeseja acessar o relatório? --> 1");
        System.out.println("\nDeseja sair? --> 2");
        resp = input.nextInt();

        if(resp == 1){
            System.out.println("\nRelatório de recursos materiais:");

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
            System.out.println("\nSem relatório");
        }
    }

    public static void buscarDados(MaterialDidatico didatico, MaterialEscolar escolar, MaterialLimpeza limpeza){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione o recurso que deseja buscar: ");
        System.out.println("\n 1 - Material didático\n2 - Material escolar\n3 - Material de limpeza");

        int k;
        int i;
        int sair = 1;
        int out = 1;
        k = input.nextInt();

        while(sair == 1){
            if(k == 1){
                System.out.println("\nSelecione o atributo que deseja consultar: ");
                System.out.println("\n 1 - Livros\n 2 - Quadro negro\n 3 - Quadro branco\n 4 - Giz\n 5 - Apagador\n 6 - Pincel");
                i = input.nextInt();

                while(out == 1){
                    switch(i){
                        case 1:
                            System.out.println("- Livros: "+ didatico.getLivros());
                            break;
                        case 2:
                            System.out.println("- Quadro negro: "+ didatico.getQuadroNegro());
                            break;
                        case 3:
                            System.out.println("- Quadro Branco: "+ didatico.getQuadroBranco());
                            break;
                        case 4:
                            System.out.println("- Giz: "+ didatico.getGiz());
                            break;
                        case 5:
                            System.out.println("- Apagador: "+ didatico.getApagador());
                            break;
                        case 6:
                            System.out.println("- Pincel: "+ didatico.getPincel());
                            break;
                        default:
                            System.out.println("erro");
                   }

                   System.out.println("\nDeseja alterar outro atributo? --> 1");
                   System.out.println("\nDeseja sair? --> 2");
                   out = input.nextInt();
                }   
            }

            else if(k == 2){
                System.out.println("\nSelecione o atributo que deseja consultar: ");
                System.out.println("\n 1 - Lápis\n 2 - Caderno\n 3 - Caneta");
                i = input.nextInt();

                while(out == 1){
                    switch(i){
                        case 1:
                            System.out.println(" - Lápis: "+ escolar.getLapis());
                            break;
                        case 2:
                            System.out.println("- Caderno: "+ escolar.getCaderno());
                            break;
                        case 3:
                            System.out.println("- Caneta: "+ escolar.getCaneta());
                            break;
                        default:
                            System.out.println("erro");
                   }
                   
                   System.out.println("\nDeseja alterar outro atributo? --> 1");
                   System.out.println("\nDeseja sair? --> 2");
                   out = input.nextInt();
                }   
            }

            else if(k == 3){
                System.out.println("\nSelecione o atributo que deseja consultar: ");
                System.out.println("\n 1 - Alvejante\n 2 - Sabão em pó\n 3 - Água sanitária\n 4 - Sabão em barra");
                i = input.nextInt();

                while(out == 1){
                    switch(i){
                        case 1:
                            System.out.println("- Alvejante: "+ limpeza.getAlvejante());
                            break;
                        case 2:
                            System.out.println("- Sabão em pó: "+ limpeza.getSabaoPo());
                            break;
                        case 3:
                            System.out.println("- Água sanitária: "+ limpeza.getAguaSanitaria());
                            break;
                        case 4:
                            System.out.println("- Sabão em barra: "+ limpeza.getSabaoBarra());
                            break;
                        default:
                            System.out.println("erro");
                   }

                   System.out.println("\nDeseja alterar outro atributo? --> 1");
                   System.out.println("\nDeseja sair? --> 2");
                   out = input.nextInt();
                }   
            }

            else{
                System.out.println("erro");
            }

            sair = input.nextInt();
        }
        
    }

    public static void main(String[] args) {
        MaterialDidatico didatico = new MaterialDidatico();
        MaterialEscolar escolar = new MaterialEscolar();
        MaterialLimpeza limpeza = new MaterialLimpeza();

        Scanner input = new Scanner(System.in);

        int x = 0;

        while(x != 6){
            System.out.println("Selecione a ação desejada: ");
            System.out.println("1 -> Cadastrar: ");
            System.out.println("2 -> Atualizar: ");
            System.out.println("3 -> Remover: ");
            System.out.println("4 -> Gerar relatório: ");
            System.out.println("5 -> Buscar dados: ");
            System.err.println("6 -> Sair: ");
            
            x = input.nextInt();

            switch(x){
                case 1:
                    cadastrar(didatico, escolar, limpeza);
                    break;
                case 2:
                    atualizar(didatico, escolar, limpeza);
                    break;
                case 3:
                    remover(didatico, escolar, limpeza);
                    break;
                case 4:
                    gerarRelatorio(didatico, escolar, limpeza);
                    break;
                case 5:
                    buscarDados(didatico, escolar, limpeza);
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
