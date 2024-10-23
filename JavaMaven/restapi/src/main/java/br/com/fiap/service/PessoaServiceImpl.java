package br.com.fiap.service;

import br.com.fiap.daos.PessoaDao;
import br.com.fiap.exceptions.PessoaInvalida;
import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.exceptions.PessoaNotUpdate;
import br.com.fiap.infra.DatabaseConnectionFactory;
import br.com.fiap.models.Pessoa;

import java.sql.Connection;
import java.sql.SQLException;
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
        try (Connection conn = DatabaseConnectionFactory.create()){
            this.dao.save(pessoa, conn);
            conn.commit();
            return pessoa;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Pessoa update(Pessoa pessoa) throws PessoaNotFound, PessoaNotUpdate {
        try (Connection conn = DatabaseConnectionFactory.create()){
            Pessoa update = this.dao.update(pessoa, conn);
            conn.commit();
            return update;
        } catch (SQLException e) {
            throw new PessoaNotUpdate();
        }
    }

    @Override
    public void delete(Long id) throws PessoaNotFound {
        this.dao.deleteById(id);
    }
}
