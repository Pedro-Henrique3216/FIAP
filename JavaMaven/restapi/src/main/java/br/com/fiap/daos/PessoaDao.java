package br.com.fiap.daos;

import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.models.Pessoa;

import java.sql.Connection;
import java.util.List;

public interface PessoaDao {

    List<Pessoa> findAll();

    void save(Pessoa pessoa, Connection con);

    Pessoa update(Pessoa pessoa, Connection con) throws PessoaNotFound;

    void deleteById(Long id) throws PessoaNotFound;

    Pessoa findById(Long id) throws PessoaNotFound;

}
