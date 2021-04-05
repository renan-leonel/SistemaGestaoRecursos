package trab1.pessoas;

import trab1.recursos.RecursosHumanos;

public class Serventes extends RecursosHumanos{
    private String nome;
    private String cpf;
    private int salario;

    private int alvejante = 0;
    private int aguaSanitaria = 0;
    private int sabaoPo = 0;

    public Serventes(String name, String num, int salary){
        this.nome = name;
        this.cpf = num;
        this.salario = salary;
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

    public void distribuiMaterial(){
        this.aguaSanitaria = this.aguaSanitaria + 1;
        this.alvejante = this.alvejante + 1;
        this.sabaoPo = this.sabaoPo + 1;
    }
}
