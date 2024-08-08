package br.com.fiap;

import java.util.Random;

public class Desafio1 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = new Random().nextInt(0, 1000);
        }
        int[] resposta = acharNumerosPares(numeros);
        System.out.println("Pares: " + resposta[0] + " - Impares: " + resposta[1]);
    }

    private static int[] acharNumerosPares(int[] numeros){
        int numerosPares = 0;
        int numerosImpares = 0;

        for(int n : numeros){
            if(n % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        return new int[]{numerosPares, numerosImpares};
    }


}
