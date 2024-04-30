package org.example.desafio.domain;

public class Gerente extends Funcionario{

    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus();
    }

    @Override
    protected double calcularBonus() {
        return getSalarioBase() * 0.50;
    }
}
