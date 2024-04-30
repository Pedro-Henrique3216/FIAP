package org.example.desafio.domain;

public class Vendedor extends Funcionario{

    public Vendedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + calcularBonus();
    }

    @Override
    protected double calcularBonus() {
        return getSalarioBase() * 0.20;
    }
}
