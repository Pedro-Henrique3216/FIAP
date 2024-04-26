package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperarioTest {

    Operario operario = new Operario("Pedro", "11912345678", 1);

    @Test
    void teste_set_e_get_valor_producao_igual_100(){
        operario.setValorProducao(100);
        Assertions.assertEquals(100, operario.getValorProducao());
    }

    @Test
    void teste_set_e_get_comissao_igual_numero_divido_100(){
        operario.setComissao(50);
        Assertions.assertEquals(0.5, operario.getComissao());
    }

    @Test
    void teste_set_e_get_comissao_diferente_numero_divido_100(){
        operario.setComissao(50);
        Assertions.assertNotEquals(50, operario.getComissao());
    }

    @Test
    void testa_se_valor_producao_mais_comissao_igual_110(){
        operario.setComissao(10);
        operario.setValorProducao(100);
        Assertions.assertEquals(110, operario.valorTotalComissaoProducao());
    }

    @Test
    void testa_se_salario_igual_200(){
        operario.setSalarioBase(100);
        operario.setImposto(10);
        operario.setComissao(10);
        operario.setValorProducao(100);
        Assertions.assertEquals(200, operario.calcularSalario());
    }

}