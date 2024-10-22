package br.com.fiap.service;

import br.com.fiap.daos.PessoaDao;
import br.com.fiap.exceptions.PessoaInvalida;
import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.models.Pessoa;

import java.util.List;

final class PessoaServiceImpl implements PessoaService {

    private PessoaDao dao;

    @Override
    public List<Pessoa> listarTodos() {
        return this.dao.findAll();
    }

    @Override
    public Pessoa create(Pessoa pessoa) throws PessoaInvalida {
        if (pessoa.getId() != null){
            throw new PessoaInvalida();
        }
        this.dao.save(pessoa);
        return pessoa;
    }

    @Override
    public Pessoa update(Pessoa pessoa) throws PessoaNotFound {
        Pessoa pessoaParaAtualizar = this.dao.findById(pessoa.getId());
        pessoaParaAtualizar.setNome(pessoa.getNome());
        return this.dao.update(pessoaParaAtualizar);
    }

    @Override
    public void delete(Long id) throws PessoaNotFound {
        this.dao.deleteById(id);
    }
}
