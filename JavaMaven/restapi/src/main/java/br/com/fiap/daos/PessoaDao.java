package br.com.fiap.daos;

import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.models.Pessoa;

import java.util.List;

public interface PessoaDao {

    List<Pessoa> findAll();

    void save(Pessoa pessoa);

    Pessoa update(Pessoa pessoa);

    void deleteById(Long id) throws PessoaNotFound;

    Pessoa findById(Long id) throws PessoaNotFound;

}
