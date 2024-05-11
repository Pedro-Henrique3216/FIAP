package org.example;

import org.example.ex3.CalculaIntervaloEmDias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;

class CalculaIntervaloEmDiasTest {

    @Test
    void se_dia_igual_a_hoje_mais_3_diferenca_igual_3() {
        String diaHojeMais3 = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Assertions.assertEquals(3, CalculaIntervaloEmDias.calculaIntevalo(diaHojeMais3));
    }

    @Test
    void se_dia_igual_menos_2_diferenca_igual_2() {
        String diaHojeMenos2 = LocalDate.now().minusDays(2).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Assertions.assertEquals(2, CalculaIntervaloEmDias.calculaIntevalo(diaHojeMenos2));
    }
}