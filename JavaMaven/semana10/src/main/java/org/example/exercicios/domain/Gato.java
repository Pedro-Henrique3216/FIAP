package org.example.exercicios.domain;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void comer() {
        System.out.println("Estou comendando");
    }

    @Override
    public void dormir() {
        System.out.println("Estou dormindo");
    }
}
