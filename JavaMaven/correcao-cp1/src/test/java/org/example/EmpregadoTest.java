package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    Empregado empregado = new Empregado("Pedro", "11912345678", 1);

    @Test
    void teste_set_e_get_codigo_setor_igual_2(){
        empregado.setCodigoSetor(2);
        Assertions.assertEquals(2, empregado.getCodigoSetor());
    }

    @Test
    void teste_set_e_get_salario_base_igual_500(){
        empregado.setSalarioBase(500);
        Assertions.assertEquals(500, empregado.getSalarioBase());
    }

    @Test
    void valida_se_set_salario_base_igual_0_retorna_RunTimeException(){
        Assertions.assertThrows(RuntimeException.class, () -> empregado.setSalarioBase(0));
    }

    @Test
    void valida_se_set_salario_base_menor_0_retorna_RunTimeException(){
        Assertions.assertThrows(RuntimeException.class, () -> empregado.setSalarioBase(-5));
    }

    @Test
    void teste_set_e_get_imposto_igual_numero_divido_100(){
        empregado.setImposto(50);
        Assertions.assertEquals(0.5, empregado.getImposto());
    }

    @Test
    void teste_set_e_get_imposto_diferente_numero_divido_100(){
        empregado.setImposto(50);
        Assertions.assertNotEquals(50, empregado.getImposto());
    }

    @Test
    void verifica_se_salario_igual_90() {
        empregado.setImposto(10);
        empregado.setSalarioBase(100);
        Assertions.assertEquals(90, empregado.calcularSalario());
    }
}