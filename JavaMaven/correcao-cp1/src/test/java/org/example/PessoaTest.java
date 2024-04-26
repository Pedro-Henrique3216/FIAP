package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void teste_set_e_get_nome(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        Assertions.assertEquals("João", pessoa.getNome());
    }

    @Test
    void teste_set_e_get_endereco(){
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco("AV. Paulista");
        Assertions.assertEquals("AV. Paulista", pessoa.getEndereco());
    }

    @Test
    void teste_set_e_get_telefone(){
        Pessoa pessoa = new Pessoa();
        pessoa.setTelefone("11912345678");
        Assertions.assertEquals("11912345678", pessoa.getTelefone());
    }

}