package org.example;

import java.time.LocalDate;

public class Pessoa {
    //atributos
    private String nome;
    private Integer anoNascimento;
    private String cpf;

    //construtores

    public Pessoa(String nome, Integer anoNascimento, String cpf) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }

    //metodos

    //sempre nomear metodos de acordo com o que ele esta fazendo
    public boolean isMaiorIdade(){
        return getIdade() >= 18;
    }

    public int getIdade() {
        return LocalDate.now().getYear() - anoNascimento;
    }


    public String getNome() {
        return nome;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        if(nome.length() >= 4){
            this.nome = nome;
        } else {
            throw new RuntimeException("Número de caracteres inválido.");
        }
    }

}
