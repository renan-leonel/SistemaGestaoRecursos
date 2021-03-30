package trab1.recursos;

import java.util.ArrayList;
import java.util.Scanner;

import trab1.pessoas.*;

public class RecursosHumanos {
    private static ArrayList<Alunos> alunos = new ArrayList<>();
    private static ArrayList<Cozinheiros> cozinheiros = new ArrayList<>();
    private static ArrayList<Instrutores> instrutores = new ArrayList<>();
    private static ArrayList<Monitores> monitores = new ArrayList<>();
    private static ArrayList<Professores> professores = new ArrayList<>();
    private static ArrayList<Serventes> serventes = new ArrayList<>();

    public static void insere(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja inserir");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        switch(x){
            case 1:
                insereAluno(name, cpf, turma, curso); // passar so o name e cpf, pegar turma e curso la na funcao por parametro e tirar os parametros daqui e de la
                break;
            case 2:
                insereCozinheiro(name, cpf, salario);
                break;
            case 3:
                insereInstrutor(name, cpf, salario, graduacao);
                break;
            case 4:
                insereMonitor(name, cpf, salario);
                break;
            case 5:
                insereProfessor(name, cpf, salario, graduacao);
                break;
            case 6:
                insereServente(name, cpf, salario, graduacao);
                break;
            default:
        }
    }

    public static void consulta(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja consultar");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        switch(x){
            case 1:
                consultaAluno(name);
                break;
            case 2:
                consultaCozinheiro(name);
                break;
            case 3:
                consultaInstrutor(name);
                break;
            case 4:
                consultaMonitor(name);
                break;
            case 5:
                consultaProfessor(name);
                break;
            case 6:
                consultaServente(name);
                break;
            default:
        }
    }

    public static void remove(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja remover");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        switch(x){
            case 1:
                removeAluno(name);
                break;
            case 2:
                removeCozinheiro(name);
                break;
            case 3:
                removeInstrutor(name);
                break;
            case 4:
                removeMonitor(name);
                break;
            case 5:
                removeProfessor(name);
                break;
            case 6:
                removeServente(name);
                break;
            default:
        }
    }

    public static void atualiza(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja atualizar");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        switch(x){
            case 1:
                atualizaAluno(name, cpf, turma, curso);
                break;
            case 2:
                atualizaCozinheiro(name, cpf, salario);
                break;
            case 3:
                atualizaInstrutor(name, cpf, salario, graduacao);
                break;
            case 4:
                atualizaMonitor(name, cpf, salario, graduacao);
                break;
            case 5:
                atualizaProfessor(name, cpf, salario, graduacao);
                break;
            case 6:
                atualizaServente(name, cpf, salario, graduacao);
                break;
            default:
        }
    }

    public static void list(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelecione a pessoa que deseja listar");
        System.out.println("\n 1 - Aluno\n 2 - Cozinheiro\n 3 - Instrutor\n 4 - Monitor\n 5 - Professor\n 6 - Servente");
        int x = input.nextInt();

        switch(x){
            case 1:
                listAlunos();
                break;
            case 2:
                listCozinheiros();
                break;
            case 3:
                listInstrutores();
                break;
            case 4:
                listMonitores();
                break;
            case 5:
                listProfessores();
                break;
            case 6:
                listServentes();
                break;
            default:
        }
    }

    public static void insereAluno(String name, String cpf, String turma, String curso){
        for(int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(name)){
                System.out.println("Aluno já existe");
                return;
            }
        }
        alunos.add(new Alunos(name, cpf, turma, curso));
    }

    public static void consultaAluno(String name){
        boolean confirm = false;
        for(int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(name)){

                System.out.println("Nome: "+ alunos.get(i).getNome());
                System.out.println("CPF: "+ alunos.get(i).getCpf());
                System.out.println("Turma: "+ alunos.get(i).getTurma());
                System.out.println("Curso: "+ alunos.get(i).getCurso());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Aluno não encontrado");
        }
        confirm = false;
    }

    public static void removeAluno(String name){
        boolean confirm = false;
        for(int i = 0; i < alunos.size(); i++){ 
            if (alunos.get(i).getNome().equals(name)){
                alunos.remove(i);

                System.out.println("Aluno removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Aluno não encontrado");
        }
        confirm = false;
    }

    public static void atualizaAluno(String name, String cpf, String turma, String curso){
        boolean confirm = false;
        for(int i = 0; i < alunos.size(); i++){
            if (alunos.get(i).getNome().equals(name)){

                alunos.get(i).setCpf(cpf);
                alunos.get(i).setTurma(turma);
                alunos.get(i).setCurso(curso);

                System.out.println("Nome: "+ alunos.get(i).getNome());
                System.out.println("Novo CPF: "+ alunos.get(i).getCpf());
                System.out.println("Nova Turma: "+ alunos.get(i).getTurma());
                System.out.println("Novo Curso: "+ alunos.get(i).getCurso());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Aluno não encontrado");
        }
        confirm = false;
    }

    public static void listAlunos(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).getNome());
        }
    }

    public static void insereCozinheiro(String name, String cpf, int salario){
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){
                System.out.println("Cozinheiro ja cadastrado");
                return;
            }
        }
        cozinheiros.add(new Cozinheiros(name, cpf, salario));
    }
    
    public static void consultaCozinheiro(String name){
        boolean confirm = false;
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){
                
                System.out.println("Nome: "+ cozinheiros.get(i).getNome());
                System.out.println("CPF: "+ cozinheiros.get(i).getCpf());
                System.out.println("Salario: "+ cozinheiros.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Cozinheiro não encontrado");
        }
        confirm = false;
    }

    public static void removeCozinheiro(String name){
        boolean confirm = false;
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){
                cozinheiros.remove(i);

                System.out.println("Cozinheiro removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Cozinheiro não encontrado");
        }
        confirm = false;
    }

    public static void atualizaCozinheiro(String name, String cpf, int salario){
        boolean confirm = false;
        for(int i = 0; i < cozinheiros.size(); i++){
            if (cozinheiros.get(i).getNome().equals(name)){

                cozinheiros.get(i).setCpf(cpf);
                cozinheiros.get(i).setSalario(salario);

                System.out.println("Nome: "+ cozinheiros.get(i).getNome());
                System.out.println("Novo CPF: "+ cozinheiros.get(i).getCpf());
                System.out.println("Novo Salario: "+ cozinheiros.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Cozinheiro não encontrado");
        }
        confirm = false;
    }

    public static void listCozinheiros(){
        for(int i = 0; i < cozinheiros.size(); i++){
            System.out.println(cozinheiros.get(i).getNome());
        }
    }

    public static void insereInstrutor(String name, String cpf, int salario, int graduacao){
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){
                System.out.println("Instrutor ja cadastrado");

                return;
            }
        }
        instrutores.add(new Instrutores(name, cpf, salario, graduacao));
    }
    
    public static void consultaInstrutor(String name){
        boolean confirm = false;
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){

                System.out.println("Nome: "+ instrutores.get(i).getNome());
                System.out.println("CPF: "+ instrutores.get(i).getCpf());
                System.out.println("Salario: "+ instrutores.get(i).getSalario());
                System.out.println("Graduacao: "+ instrutores.get(i).getGraduacao());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Instrutor não encontrado");
        }
        confirm = false;
    }

    public static void removeInstrutor(String name){
        boolean confirm = false;
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){
                instrutores.remove(i);

                System.out.println("Instrutor removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Instrutor não encontrado");
        }
        confirm = false;
    }

    public static void atualizaInstrutor(String name, String cpf, int salario, int graduacao){
        boolean confirm = false;
        for(int i = 0; i < instrutores.size(); i++){
            if (instrutores.get(i).getNome().equals(name)){

                instrutores.get(i).setCpf(cpf);
                instrutores.get(i).setSalario(salario);
                instrutores.get(i).setGraduacao(graduacao);

                System.out.println("Nome: "+ instrutores.get(i).getNome());
                System.out.println("Novo CPF: "+ instrutores.get(i).getCpf());
                System.out.println("Novo Salario: "+ instrutores.get(i).getSalario());
                System.out.println("Nova Graduacao: "+ instrutores.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Instrutor não encontrado");
        }
        confirm = false;
    }

    public static void listInstrutores(){
        for(int i = 0; i < instrutores.size(); i++){
            System.out.println(instrutores.get(i).getNome());
        }
    }

    public static void insereMonitor(String name, String cpf, int salario){
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){
                System.out.println("Monitor ja cadastrado");

                return;
            }
        }
        monitores.add(new Monitores(name, cpf, salario));
    }
    
    public static void consultaMonitor(String name){
        boolean confirm = false;
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){

                System.out.println("Nome: "+ monitores.get(i).getNome());
                System.out.println("CPF: "+ monitores.get(i).getCpf());
                System.out.println("Salario: "+ monitores.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Monitor não encontrado");
        }
        confirm = false;
    }

    public static void removeMonitor(String name){
        boolean confirm = false;
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){

                monitores.remove(i);
                System.out.println("Monitor removido");
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Monitor não encontrado");
        }
        confirm = false;
    }

    public static void atualizaMonitor(String name, String cpf, int salario, int graduacao){
        boolean confirm = false;
        for(int i = 0; i < monitores.size(); i++){
            if (monitores.get(i).getNome().equals(name)){

                monitores.get(i).setCpf(cpf);
                monitores.get(i).setSalario(salario);

                System.out.println("Nome: "+ monitores.get(i).getNome());
                System.out.println("Novo CPF: "+ monitores.get(i).getCpf());
                System.out.println("Novo Salario: "+ monitores.get(i).getSalario());
                System.out.println("Nova Graduacao: "+ monitores.get(i).getSalario());
                confirm = true;

                return;
            }
        }
        if(!confirm){
            System.out.println("Monitor não encontrado");
        }
        confirm = false;
    }

    public static void listMonitores(){
        for(int i = 0; i < monitores.size(); i++){
            System.out.println(monitores.get(i).getNome());
        }
    }

    public static void insereProfessor(String name, String cpf, int salario, int graduacao){
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                System.out.println("Professor ja cadastrado");
                return;
            }
        }
        professores.add(new Professores(name, cpf, salario, graduacao));
    }
    
    public static void consultaProfessor(String name){
        boolean confirm = false;
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                System.out.println("Nome: "+ professores.get(i).getNome());
                System.out.println("CPF: "+ professores.get(i).getCpf());
                System.out.println("Salario: "+ professores.get(i).getSalario());
                System.out.println("Graduacao: "+ professores.get(i).getGraduacao());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Professor não encontrado");
        }
        confirm = false;
    }

    public static void removeProfessor(String name){
        boolean confirm = false;
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                professores.remove(i);
                System.out.println("Professor removido");
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Professor não encontrado");
        }
        confirm = false;
    }

    public static void atualizaProfessor(String name, String cpf, int salario, int graduacao){
        boolean confirm = false;
        for(int i = 0; i < professores.size(); i++){
            if (professores.get(i).getNome().equals(name)){
                professores.get(i).setCpf(cpf);
                professores.get(i).setSalario(salario);
                professores.get(i).setGraduacao(graduacao);
                System.out.println("Nome: "+ professores.get(i).getNome());
                System.out.println("Novo CPF: "+ professores.get(i).getCpf());
                System.out.println("Novo Salario: "+ professores.get(i).getSalario());
                System.out.println("Nova Graduacao: "+ professores.get(i).getSalario());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Professor não encontrado");
        }
        confirm = false;
    }

    public static void listProfessores(){
        for(int i = 0; i < professores.size(); i++){
            System.out.println(professores.get(i).getNome());
        }
    }

    public static void insereServente(String name, String cpf, int salario, int graduacao){
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                System.out.println("Servente ja cadastrado");
                return;
            }
        }
        serventes.add(new Serventes(name, cpf, salario, graduacao));
    }
    
    public static void consultaServente(String name){
        boolean confirm = false;
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                System.out.println("Nome: "+ serventes.get(i).getNome());
                System.out.println("CPF: "+ serventes.get(i).getCpf());
                System.out.println("Salario: "+ serventes.get(i).getSalario());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Servente não encontrado");
        }
        confirm = false;
    }

    public static void removeServente(String name){
        boolean confirm = false;
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                serventes.remove(i);
                System.out.println("Servente removido");
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Servente não encontrado");
        }
        confirm = false;
    }

    public static void atualizaServente(String name, String cpf, int salario, int graduacao){
        boolean confirm = false;
        for(int i = 0; i < serventes.size(); i++){
            if (serventes.get(i).getNome().equals(name)){
                serventes.get(i).setCpf(cpf);
                serventes.get(i).setSalario(salario);
                System.out.println("Nome: "+ serventes.get(i).getNome());
                System.out.println("Novo CPF: "+ serventes.get(i).getCpf());
                System.out.println("Novo Salario: "+ serventes.get(i).getSalario());
                confirm = true;
                return;
            }
        }
        if(!confirm){
            System.out.println("Servente não encontrado");
        }
        confirm = false;
    }

    public static void listServentes(){
        for(int i = 0; i < serventes.size(); i++){
            System.out.println(serventes.get(i).getNome());
        }
    }
}