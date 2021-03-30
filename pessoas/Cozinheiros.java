package pessoas;

import recursos.RecursosHumanos;

public class Cozinheiros extends RecursosHumanos{
    private String nome;
    private String cpf;
    private int salario;

    public Cozinheiros(String name, String num, int salary){
        this.nome = name;
        this.cpf = num;
        this.salario = salary;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
