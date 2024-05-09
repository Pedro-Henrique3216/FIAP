package org.example.ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaIntervaloEmDias {

    public static Long calculaIntevalo(String date){
        LocalDate dateNow = LocalDate.now();
        try{
            return dateNow.datesUntil(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))).count();
        } catch (Exception e){
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")).datesUntil(dateNow).count();
        }
    }

}

