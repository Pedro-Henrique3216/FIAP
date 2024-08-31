package org.example;

import java.util.Arrays;

public class Questao1 {

    public static void main(String[] args) {
        int[] arrA = {5, 2, 3, 8, 5, 4, 3, 4, 6, 7};
        int[] arrB = {10, 2, 8, 6, 5, 2, 3, 4, 5, 5};

        boolean[] arrC = verificaQuaisNumerosPares(arrA, arrB);
        System.out.println(Arrays.toString(arrC));
    }

    public static boolean[] verificaQuaisNumerosPares(int[] arrA, int[] arrB) {
        boolean[] arrC = new boolean[arrA.length];
        for (int i = 0; i < arrC.length; i++) {
            arrC[i] = (arrA[i] * arrB[i]) % 2 == 0;
        }

        return arrC;
    }
}
