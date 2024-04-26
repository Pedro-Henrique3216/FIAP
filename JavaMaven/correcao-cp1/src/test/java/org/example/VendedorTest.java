package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    Vendedor vendedor = new Vendedor("Pedro", "11912345678", 1);

    @Test
    void teste_set_e_get_valor_vendas_igual_100(){
        vendedor.setValorVendas(100);
        Assertions.assertEquals(100, vendedor.getValorVendas());
    }

    @Test
    void teste_set_e_get_comissao_igual_numero_divido_100(){
        vendedor.setComissao(50);
        Assertions.assertEquals(0.5, vendedor.getComissao());
    }

    @Test
    void teste_set_e_get_comissao_diferente_numero_divido_100(){
        vendedor.setComissao(50);
        Assertions.assertNotEquals(50, vendedor.getComissao());
    }

    @Test
    void testa_se_venda_mais_comissao_igual_110(){
        vendedor.setValorVendas(100);
        vendedor.setComissao(10);
        Assertions.assertEquals(110, vendedor.valorVendasComissao());
    }

    @Test
    void testa_se_salario_igual_200(){
        vendedor.setSalarioBase(100);
        vendedor.setImposto(10);
        vendedor.setComissao(10);
        vendedor.setValorVendas(100);
        Assertions.assertEquals(200, vendedor.calcularSalario());
    }

}