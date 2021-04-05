package trab1.pessoas;

import trab1.recursos.RecursosHumanos;

public class Alunos extends RecursosHumanos{
    private String nome;
    private String cpf;
    private String turma;
    private String curso;

    private int lapis = 0;
    private int caneta = 0;
    private int caderno = 0;

    public Alunos(String name, String num, String classe, String course){
        this.nome = name;
        this.cpf = num;
        this.turma = classe;
        this.curso = course;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurma() {
        return this.turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void distribuiMaterial(){
        this.lapis = this.lapis + 1;
        this.caderno = this.caderno + 1;
        this.caneta = this.caneta + 1;
    }
}
