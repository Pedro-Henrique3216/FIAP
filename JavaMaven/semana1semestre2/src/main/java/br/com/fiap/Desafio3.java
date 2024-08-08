package br.com.fiap;

import java.util.Arrays;
import java.util.Random;

public class Desafio3 {

    public static void main(String[] args) {
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = new Random().nextInt(0, 1000);
        }

        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println("Menor numero: " + acharMenorNumero(numeros) + ", Maior numero: " +
                acharMaiorNumero(numeros));
    }

    private static int acharMenorNumero(int[] numeros){
        int menorNumero = numeros[0];
        for(int n : numeros) {
            if(n < menorNumero){
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    private static int acharMaiorNumero(int[] numeros){
        int maiorNumero = numeros[0];
        for(int n : numeros) {
            if(n > maiorNumero){
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }
}
