package br.com.fiap.exemploDummy;

import br.com.fiap.entities.Pessoa;
import br.com.fiap.exception.DummyChackedException;

public class Exemplo {

    public static String dummyTestException() {
        Pessoa pessoaNulo = null;
        try {
            pessoaNulo.getId();
            return "Ok";
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Dummy teste foi finalizado");
        }
    }

    public static void dummyExceptionPesonalizada() throws DummyChackedException {
        throw new DummyChackedException();
    }
}
