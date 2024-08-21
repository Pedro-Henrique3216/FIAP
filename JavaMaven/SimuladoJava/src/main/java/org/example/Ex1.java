package org.example;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 4, 10, 6, 20, 8, 9, 10};

        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] arrayC = retornaSomaDeCadaElemento(array1, array2);

        Arrays.stream(arrayC).forEach(System.out::println);
    }

    private static int[] retornaSomaDeCadaElemento(int[] arrA, int[]arrB){
        int[] c = new int[arrA.length];

        for(int i = 0; i < c.length; i++){
            c[i] = arrA[i] + arrB[i];
        }

        return c;
    }
}
