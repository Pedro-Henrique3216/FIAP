package org.example;

import org.example.ex1.domain.ContaPoupanca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaPoupancaTest {

    @Test
    void se_saldo_igual_a_100_e_taxa_igual_5_saldo_igual_a_115(){
        ContaPoupanca nockContaPoupanca = new ContaPoupanca();
        nockContaPoupanca.depositar(100);
        nockContaPoupanca.atualizaConta(5);
        Assertions.assertEquals(115, nockContaPoupanca.getSaldo());
    }

}