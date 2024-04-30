package org.example.desafio.domain;

public class Estagiario extends Funcionario{

    public Estagiario(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus();
    }

    @Override
    protected double calcularBonus() {
        return getSalarioBase() * 0.1;
    }
}
