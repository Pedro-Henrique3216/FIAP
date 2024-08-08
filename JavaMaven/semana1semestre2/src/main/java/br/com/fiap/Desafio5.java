package br.com.fiap;

import java.util.Arrays;
import java.util.Random;

public class Desafio5 {

    public static void main(String[] args) {
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = new Random().nextInt(0, 1000);
        }
        System.out.println("É polidromo: " + isPolindromo(numeros));

        int[] numeroPolindromo = {1, 3, 5, 5, 3, 1};
        System.out.println("É polidromo: " + isPolindromo(numeroPolindromo));
    }

    private static boolean isPolindromo(int[] numeros) {
        int[] numerosInvertido = Desafio2.inverteValor(numeros);
        return Arrays.equals(numeros, numerosInvertido);
    }
}
