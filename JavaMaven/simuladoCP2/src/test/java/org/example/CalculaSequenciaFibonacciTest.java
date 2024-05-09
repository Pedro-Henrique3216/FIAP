package org.example;

import org.example.ex2.CalculaSequenciaFibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculaSequenciaFibonacciTest {

    @Test
    void se_elemenro_11_numero_sequencia_igual_89() {
        Assertions.assertEquals(89, CalculaSequenciaFibonacci.elementoSequencia(11));
    }
}