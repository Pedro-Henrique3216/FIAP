package org.example;

public final class Gerente extends Funcionario{

    public Gerente(String nome, Integer anoNascimento, String cpf) {
        super(nome, anoNascimento, cpf);
    }

    @Override
    public double getBonus() {
        return super.getBonus() + 100;
    }
}
