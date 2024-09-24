package br.com.fiap.entities;

import br.com.fiap.exception.IdadeInvalida;

public class Pessoa {

    private long id;
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        setIdade(idade);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(isMaiorDeIdade(idade)){
            this.idade = idade;
        } else {
            throw new IdadeInvalida(String.valueOf(idade));
        }
    }

    private boolean isMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
