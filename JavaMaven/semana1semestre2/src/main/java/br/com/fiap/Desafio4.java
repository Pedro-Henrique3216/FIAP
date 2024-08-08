package br.com.fiap;

import java.util.Arrays;
import java.util.Random;

public class Desafio4 {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = new Random().nextInt(0, 10);
        }
        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println("Media: " + calcularMedia(numeros));
    }

    private static double calcularMedia(int[] numeros){
        int sum = Arrays.stream(numeros).sum();
        return (double) sum / numeros.length;
    }
}
