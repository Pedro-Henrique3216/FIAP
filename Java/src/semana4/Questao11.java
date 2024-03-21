package Java.src.semana4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas voce vai digitar: ");
        int quantidadeNotas = sc.nextInt();

        List<Double> listaNota = new ArrayList<>();

        for(int i = 0; i < quantidadeNotas; i++){
            System.out.println("Nota " + (i + 1));
            System.out.println("Digite a sua nota: ");
            double nota = sc.nextDouble();
            listaNota.add(nota);
        }

        double sum = listaNota.stream().reduce(0.0, (x,y) -> x + y);

        double media = sum / quantidadeNotas;

        if(media <= 4.0){
            System.out.println("Reprovado");
        } else if (media <= 7.0){
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
