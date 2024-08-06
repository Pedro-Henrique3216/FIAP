package br.com.fiap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[4];

        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 2;
        vetor[3] = 3;

        int[] novoVetor = {2024, 2023, 2025, 2030};
        System.out.println(novoVetor[0]);
        novoVetor[0] = 2032;
        System.out.println(novoVetor[0]);
        System.out.println(novoVetor.length);

        for (int n : novoVetor) {
            System.out.println(n);
        }

        String[] alunos = new String[3];
        alunos[0] = "João";
        alunos[1] = "Pedro";
        alunos[2] = "Maria";

        String[] alunos2 = Arrays.copyOf(alunos, alunos.length + 1);
        System.out.println(alunos2[3]);

        int[] numerosInteiros = {4,2,1,7};
        int[] copiaNumeroInteiros = numerosInteiros.clone();

        numerosInteiros[0] = 1;

        copiaNumeroInteiros[0] = 2;
        for (int n : copiaNumeroInteiros) {
            System.out.println(n);
        }

        System.out.println();
        Lista lista = new Lista();
        lista.add(4);
        lista.add(2);
        lista.add(1);
        lista.add(7);
        lista.imprimirLista();
        System.out.println();
        lista.ordenar();
        lista.imprimirLista();
    }
}