package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GerenteTest {

    @Test
    void verifica_ser_salario_1000_bonus_igual_200(){
        Gerente nockGerente = new Gerente("José",1989,"111111111");
        nockGerente.setSalario(1000);
        Assertions.assertEquals(200, nockGerente.getBonus());
    }
    
}
