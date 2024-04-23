package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

    @Test
    void when_salario_100_bonus_deve_ser_10() {
        Funcionario nockFuncionario = new Funcionario("José", 1989, "11111111111");
        nockFuncionario.setSalario(100);
        Assertions.assertEquals(10, nockFuncionario.getBonus());
    }
}