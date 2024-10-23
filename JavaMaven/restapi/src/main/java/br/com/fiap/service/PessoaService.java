package br.com.fiap.service;

import br.com.fiap.exceptions.PessoaInvalida;
import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.exceptions.PessoaNotUpdate;
import br.com.fiap.models.Pessoa;

import java.util.List;

public interface PessoaService {

    List<Pessoa> listarTodos();

    Pessoa create(Pessoa pessoa) throws PessoaInvalida;

    Pessoa update(Pessoa pessoa) throws PessoaNotFound, PessoaNotUpdate;

    void delete(Long id) throws PessoaNotFound;

}
