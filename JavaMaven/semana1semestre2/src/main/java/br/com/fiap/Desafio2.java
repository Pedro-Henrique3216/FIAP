package br.com.fiap;

import java.util.Arrays;

public class Desafio2 {

    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 6, 7};
        System.out.print("Lista fina: ");
        Arrays.stream(inverteValor(numeros)).forEach(x -> System.out.print(x + ", "));
    }

    public static int[] inverteValor(int[] numeros){
        int[] resp = new int[numeros.length];
        int n = 0;
        for(int i = numeros.length - 1; i >= 0; i--){
            resp[n] = numeros[i];
            n++;
        }

        return resp;
    }

}
