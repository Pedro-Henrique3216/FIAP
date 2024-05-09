package org.example.ex1.domain;

import org.example.ex1.interfaces.AtualizaConta;

public abstract class Conta implements AtualizaConta {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
}
