package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(4);

        System.out.println(listaInteiros.size());

        System.out.println();

        printList(listaInteiros);

        System.out.println(listaInteiros.getLast());
        System.out.println(listaInteiros.getFirst());

        listaInteiros.add(30);

        System.out.println();

        printList(listaInteiros);

        System.out.println(listaInteiros.getLast());

        System.out.println();

        listaInteiros.removeLast();

        printList(listaInteiros);
    }

    public static void printList(List<Integer> listaInteiros) {
        for (Integer inteiro : listaInteiros) {
            System.out.println(inteiro);
        }
        System.out.println();
    }
}