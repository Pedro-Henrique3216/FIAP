package br.com.fiap.dao;

import br.com.fiap.Pessoa;

import java.sql.SQLException;
import java.util.List;

public interface PessoaDao {

    void create(Pessoa pessoa) throws SQLException;

    void update(Pessoa pessoa) throws SQLException;

    void delete(Long id) throws SQLException;

    List<Pessoa> read() throws SQLException;
}
