package org.example.ex1.domain;

public class ContaPoupanca extends Conta{


    @Override
    public void atualizaConta(double taxa) {
        taxa = taxa / 100;
        this.saldo += getSaldo() * taxa * 3;
    }
}
