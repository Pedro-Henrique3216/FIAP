package org.example;

import org.example.ex3.CalculaIntervaloEmDias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculaIntervaloEmDiasTest {

    @Test
    void se_dia_igual_a_11_5_2024_diferenca_igual_3() {
        Assertions.assertEquals(3, CalculaIntervaloEmDias.calculaIntevalo("11/05/2024"));
    }

    @Test
    void se_dia_igual_a_03_5_2024_diferenca_igual_2() {
        Assertions.assertEquals(2, CalculaIntervaloEmDias.calculaIntevalo("06/05/2024"));
    }
}