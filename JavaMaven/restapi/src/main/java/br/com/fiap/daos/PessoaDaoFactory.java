package br.com.fiap.daos;

public final class PessoaDaoFactory {

    private PessoaDaoFactory() {
        throw new UnsupportedOperationException();
    }

    public static PessoaDao getPessoaDao() {
        return new PessoaDaoImpl();
    }
}
