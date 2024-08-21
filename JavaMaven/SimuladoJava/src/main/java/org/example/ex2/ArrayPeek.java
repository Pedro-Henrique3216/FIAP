package org.example.ex2;

import java.util.*;

public class ArrayPeek {

    private int[] arr = new int[0];

    public ArrayPeek() {
    }

    public ArrayPeek(int[] arr){
        for (int j : arr) {
            add(j);
        }
    }

    public void add(int i) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[indexUltimoElemento()] = i;
    }

    public int peek(){
       if (arr.length != 0){
           return arr[indexUltimoElemento()];
       }
        throw new IndexOutOfBoundsException("Tamanho da lista deve ser maior que 0");
    }

    public int pop() {
        try {
            int numero = arr[indexUltimoElemento()];
            arr = Arrays.copyOf(arr, arr.length - 1);
            return numero;
        } catch (IndexOutOfBoundsException e){
            throw new RuntimeException("Lista esta vazia");
        }
    }

    private int indexUltimoElemento(){
        return arr.length - 1;
    }

    private int[] toArray(){
        return arr;
    }

    public int popFirst(){
        if (arr.length == 0){
            throw new IndexOutOfBoundsException("Tamanho da lista deve ser maior que 0");
        }

        int primerioELemento = arr[0];
        ArrayPeek newArr = new ArrayPeek();
        for(int numero : arr){
            if(numero != primerioELemento){
                newArr.add(numero);
            }
        }
        arr = newArr.toArray();
        return primerioELemento;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
