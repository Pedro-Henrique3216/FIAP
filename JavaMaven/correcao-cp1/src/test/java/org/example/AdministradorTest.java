package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    Administrador administrador = new Administrador("Pedro", "11912345678", 1);

    @Test
    void teste_set_e_get_ajuda_custo_igual_100(){
        administrador.setAjudaDeCusto(100);
        Assertions.assertEquals(100, administrador.getAjudaDeCusto());
    }

    @Test
    void valida_se_ajuda_custo_menor_que_0(){
        Assertions.assertThrows(RuntimeException.class, () -> administrador.setAjudaDeCusto(-1));
    }

    @Test
    void testa_se_salario_igual_290(){
        administrador.setSalarioBase(100);
        administrador.setImposto(10);
        administrador.setAjudaDeCusto(200);
        Assertions.assertEquals(290, administrador.calcularSalario());
    }

}