package br.com.fiap;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste {
    public static void main(String[] args) {

        var pessoa = new Pessoa("Jose", 13);
        var pessoa2 = new Pessoa("Jose", 13);

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        System.out.print("Set: ");
        pessoas.forEach(x -> System.out.print(x.toString() + " "));


        List<Pessoa> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(pessoa, pessoa2));
        System.out.print("\nArrayList: ");
        arrayList.forEach(x -> System.out.print(x.toString() + " "));

        List<Pessoa> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(pessoa, pessoa2));
        System.out.print("\nLinkedList: ");
        linkedList.forEach(x -> System.out.print(x.toString() + " "));

        Pessoa[] arr = {pessoa, pessoa2};
        System.out.print("\nArray: ");
        Arrays.stream(arr).forEach(x -> System.out.print(x.toString() + " "));




    }
}