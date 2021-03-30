package pessoas;

import recursos.RecursosHumanos;

public class Monitores extends RecursosHumanos{
    private String nome;
    private String cpf;
    private int salario;
    public int graduacao;

    public Monitores(String name, String num, int salary, int graduation){
        this.nome = name;
        this.cpf = num;
        this.salario = salary;
        this.graduacao = graduation;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String num) {
        this.cpf = num;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salary) {
        this.salario = salary;
    }

    public int getGraduacao() {
        return this.graduacao;
    }

    public void setGraduacao(int graduation) {
        this.graduacao = graduation;
    }
}
