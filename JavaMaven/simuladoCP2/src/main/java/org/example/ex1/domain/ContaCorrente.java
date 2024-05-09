package org.example.ex1.domain;

public class ContaCorrente extends Conta{

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.10);

    }

    @Override
    public void atualizaConta(double taxa) {
        taxa = taxa / 100;
        this.saldo += getSaldo() * taxa * 2;
    }
}
