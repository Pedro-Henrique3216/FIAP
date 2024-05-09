package org.example;

import org.example.ex1.domain.Conta;
import org.example.ex1.domain.ContaPoupanca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaTest {

    @Test
    void se_deposito_100_e_sacar_50_saldo_50(){
        Conta nockConta = new ContaPoupanca();
        nockConta.depositar(100);
        nockConta.sacar(50);
        Assertions.assertEquals(50, nockConta.getSaldo());
    }

}