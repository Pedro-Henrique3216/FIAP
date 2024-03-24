package Java.src.semana4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite qual termo da sequência de Fibonacci você irá querer: ");
        int termoSequencia = sc.nextInt() - 1;

        System.out.println(calculaSequenciaFibonacci(termoSequencia));
    }

    private static int calculaSequenciaFibonacci(int termoSequencia){

        List<Integer> sequenciaFibonacci = new ArrayList<>();
        sequenciaFibonacci.add(0);
        sequenciaFibonacci.add(1);

        int num = 1;
        for(int i = 1; i < termoSequencia; i++){
            sequenciaFibonacci.add(num);
            num = sequenciaFibonacci.get(i) + num;
        }

        return sequenciaFibonacci.get(termoSequencia);
    }
}
