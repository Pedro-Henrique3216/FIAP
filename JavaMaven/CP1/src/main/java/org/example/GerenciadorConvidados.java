package org.example;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorConvidados {

    private Set<String> convidados = new HashSet<>();

    public void adicionarConvidado(String nome){
        convidados.add(nome);
    }

    public void print(){
        System.out.println(convidados.toString());
    }

}
