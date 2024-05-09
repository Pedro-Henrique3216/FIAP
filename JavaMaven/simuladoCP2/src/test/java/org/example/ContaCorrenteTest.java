package org.example;

import org.example.ex1.domain.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaCorrenteTest {

    @Test
    void se_saldo_igual_a_100_10_e_taxa_igual_5_saldo_igual_a_110() {
        ContaCorrente nockContaCorrente = new ContaCorrente();
        nockContaCorrente.depositar(100.10);
        nockContaCorrente.atualizaConta(5);
        Assertions.assertEquals(110, nockContaCorrente.getSaldo());

    }


}