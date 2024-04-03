package Semana2.exercicios;

import java.util.Scanner;

public class ConversaoUnidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a unidade: ");
        String unidade = sc.next().toUpperCase();

        while (!(unidade.equals("KM") || unidade.equals("M") || unidade.equals("CM"))){
            System.out.print("Unidade invalida! Digite outra: ");
            unidade = sc.next();
        }

        if(unidade.equals("KM")){
            System.out.println("Seu valor em Metros é " + comprimento * 1000);
            System.out.println("Seu valor em Centimetros é " + comprimento * 100000);
        } else if (unidade.equals("M")){
            System.out.println("Seu valor em Kilometros é " + comprimento / 1000);
            System.out.println("Seu valor em Centimetros é " + comprimento * 100);
        } else if (unidade.equals("CM")) {
            System.out.println("Seu valor em Metros é " + comprimento / 100);
            System.out.println("Seu valor em Kilometros é " + comprimento / 10000);
        } else {
            throw new IllegalArgumentException("Error");
        }
    }
}
