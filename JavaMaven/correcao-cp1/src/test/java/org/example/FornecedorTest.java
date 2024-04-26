package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    Fornecedor fornecedor = new Fornecedor("Pedro", "AV. Paulista", "11912345678");

    @Test
    void teste_set_e_get_valor_credito_igual_200(){
        fornecedor.setValorCredito(200);
        Assertions.assertEquals(200, fornecedor.getValorCredito());
    }

    @Test
    void teste_set_e_get_valor_divida_igual_100(){
        fornecedor.setValorDivida(100);
        Assertions.assertEquals(100, fornecedor.getValorDivida());
    }

    @Test
    void teste_se_credito_200_e_divida_100_saldo_igual_100() {
        fornecedor.setValorCredito(200);
        fornecedor.setValorDivida(100);
        Assertions.assertEquals(100, fornecedor.obterSaldo());
    }

    @Test
    void teste_se_credito_100_e_divida_200_saldo_igual_100_negativo() {
        fornecedor.setValorCredito(100);
        fornecedor.setValorDivida(200);
        Assertions.assertEquals(-100, fornecedor.obterSaldo());
    }

}