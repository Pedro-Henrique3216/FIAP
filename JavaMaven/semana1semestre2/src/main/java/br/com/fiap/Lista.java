package br.com.fiap;

import java.util.Arrays;

public class Lista {

    private int[] numeros = new int[0];

    public void add(int numero){
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = numero;
    }

    public void imprimirLista(){
        Arrays.stream(numeros).forEach(System.out::println);
    }

    public void ordenar(){
        int[] ordenado = new int[numeros.length];
        for (int i = 0; i < ordenado.length; i++){
            int menorNumero = numeros[0];
            for (int j = 1; j < numeros.length; j++){
                if (menorNumero > numeros[j]){
                    menorNumero = numeros[j];
                }
            }
            int[] outrosNumeros = new int[numeros.length - 1];
            int n = 0;
            for (int numero : numeros) {
                if (numero != menorNumero) {
                    outrosNumeros[n] = numero;
                    n++;
                }
            }
            numeros = outrosNumeros;
            ordenado[i] = menorNumero;
        }
        numeros = ordenado;
    }




}
