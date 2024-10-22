package br.com.fiap.service;

public class PessoaServiceFactory {

    private PessoaServiceFactory(){
        throw new UnsupportedOperationException("Classe factory");
    }

    public static PessoaService create(){
        return new PessoaServiceImpl();
    }
}
