package br.com.fiap;

import java.util.*;

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


        Queue<String> fila = new LinkedList<>();
        fila.add("Maria");
        fila.add("Pedro");
        fila.add("Joao");
        fila.add("Carlos");
        fila.add("Ana");

        //consulta para verificar quem é o proximo
        System.out.println(fila.peek());
        //chamar o proximo. Recupera e remove da fila
        System.out.println(fila.poll());
        System.out.println(fila.size());

        fila.remove("Carlos");
        System.out.println(fila.size());

        System.out.println();

        Stack<String> nomes = new Stack<>();
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Joao");
        nomes.add("Carlos");
        nomes.add("Ana");
        System.out.println(nomes.size());

        System.out.println(nomes.peek());

        System.out.println(nomes.size());

        System.out.println(nomes.pop());

        System.out.println(nomes.size());

        System.out.println();

        Queue<Pessoa> pessoas = new PriorityQueue<>();
        pessoas.add(new Pessoa("Pedro", 30, "12345"));
        pessoas.add(new Pessoa("Maria", 10, "13546"));
        pessoas.add(new Pessoa("Joao", 10, "13457"));
        pessoas.add(new Pessoa("Carlos", 15, "15648"));

        pessoas.poll();
        Pessoa proximaChamada = pessoas.peek();
        System.out.println(proximaChamada.getNome());

    }

    public static void printList(List<Integer> listaInteiros) {
        for (Integer inteiro : listaInteiros) {
            System.out.println(inteiro);
        }
        System.out.println();
    }
}