package semana4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String conceito = sc.next().toUpperCase();

        Map<String, String> disciplina = new HashMap<>();

        disciplina.put("A", "Excelente");
        disciplina.put("B", "Ótimo");
        disciplina.put("C", "Bom");
        disciplina.put("D", "Regular");
        disciplina.put("E", "Ruim");
        disciplina.put("F", "Reprovado");

        if(disciplina.containsKey(conceito)){
            System.out.println(disciplina.get(conceito));
        } else {
            throw new IllegalArgumentException("conceito inexistente");
        }

        sc.close();
    }
}
