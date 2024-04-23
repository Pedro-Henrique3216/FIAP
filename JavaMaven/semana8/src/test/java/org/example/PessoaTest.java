package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    Pessoa pessoa = new Pessoa("Maria", LocalDate.now().getYear(), "111111111");

    @Test
    void validar_nascido_em_1989_is_maior_idade_true() {
        Pessoa pessoa = new Pessoa("José",1989,"111111111");
        Assertions.assertTrue(pessoa.isMaiorIdade());
    }

    @Test
    void validar_nascido_em_ano_atual_is_maior_idade_false(){
        Assertions.assertFalse(pessoa.isMaiorIdade());
    }

    @Test
    void validar_se_lanca_erro_quando_chamar_setNome_e_nome_menor_4_caracteres(){
        Assertions.assertThrows(RuntimeException.class,() -> pessoa.setNome("Ma"));
    }

    @Test
    void valida_nao_lanca_erro_quando_chamar_setNome_e_nome_igual_4_caracteres(){
        Assertions.assertDoesNotThrow(() -> pessoa.setNome("Mari"));
    }
}
