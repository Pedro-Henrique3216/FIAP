package org.example;

public class Questao2 {

    public static void main(String[] args) {

        GerenciadorConvidados gerenciadorConvidados = new GerenciadorConvidados();

        gerenciadorConvidados.adicionarConvidado("Pedro");
        gerenciadorConvidados.adicionarConvidado("João");
        gerenciadorConvidados.adicionarConvidado("Paulo");
        gerenciadorConvidados.adicionarConvidado("Pedro");
        gerenciadorConvidados.adicionarConvidado("Carlos");
        gerenciadorConvidados.adicionarConvidado("Paulo");

        gerenciadorConvidados.print();


    }

}
