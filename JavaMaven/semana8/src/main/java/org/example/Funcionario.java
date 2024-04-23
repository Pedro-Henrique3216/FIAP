package org.example;

public class Funcionario extends Pessoa {

    private double salario;
    private double bonus;

    public Funcionario(String nome, Integer anoNascimento, String cpf) {
        super(nome, anoNascimento, cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return this.salario * 0.1;
    }

}
