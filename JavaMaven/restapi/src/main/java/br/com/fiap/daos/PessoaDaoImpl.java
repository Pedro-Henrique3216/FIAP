package br.com.fiap.daos;

import br.com.fiap.exceptions.PessoaNotFound;
import br.com.fiap.infra.DatabaseConnectionFactory;
import br.com.fiap.models.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class PessoaDaoImpl implements PessoaDao {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    private final String FIND_ALL = "select * from Pessoa";

    private final String FIND_BY_ID = "select * from Pessoa where id = ?";

    private final String SAVE = "insert into Pessoa(nome) values (?)";

    private final String UPDATE = "update Pessoa set nome = ? where id = ?";

    @Override
    public List<Pessoa> findAll() {
        List<Pessoa> all = new ArrayList<Pessoa>();
        try (Connection conn = DatabaseConnectionFactory.create()) {
            try(Statement stmt = conn.createStatement()) {
                stmt.executeQuery(FIND_ALL);
                try (ResultSet rs = stmt.getResultSet()) {
                    while (rs.next()) {
                        all.add(new Pessoa(rs.getLong("id"),
                                rs.getString("nome")));
                    }
                }
            }

        } catch (SQLException e) {
            this.log.warning("Não foi possivel realizar a consulta no banco de dados");
        }
        return all;
    }

    @Override
    public void save(Pessoa pessoa, Connection conn) {
        try (PreparedStatement stmt = conn.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, pessoa.getNome());
            int rows = stmt.executeUpdate();
            if (rows == 1) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        pessoa.setId(rs.getLong(1));
                    }
                }
            }
        } catch (SQLException e) {
            this.log.warning("Não foi possivel inserir pessoa no Banco de dados");
        }

    }

    @Override
    public Pessoa update(Pessoa pessoa, Connection conn) throws PessoaNotFound {
        try (PreparedStatement stmt = conn.prepareStatement(UPDATE)) {
            stmt.setString(1, pessoa.getNome());
            stmt.setLong(2, pessoa.getId());
            int rows = stmt.executeUpdate();
            if (rows == 0) {
                throw new PessoaNotFound("id invalido");
            }
        } catch (SQLException e) {
            this.log.warning("Não foi possivel inserir pessoa no Banco de dados");
        }
        return pessoa;
    }

    @Override
    public void deleteById(Long id) throws PessoaNotFound {

    }

    @Override
    public Pessoa findById(Long id) throws PessoaNotFound {
        try(Connection conn = DatabaseConnectionFactory.create()) {
            try(PreparedStatement preparedStatement = conn.prepareStatement(FIND_BY_ID)) {
                preparedStatement.setLong(1, id);
                preparedStatement.executeQuery();
                try(ResultSet resultSet = preparedStatement.getResultSet()) {
                    if (resultSet.next()){
                        return new Pessoa(resultSet.getLong("id"),
                                resultSet.getString("nome"));
                    }
                }
            }
        } catch (SQLException e) {
            log.warning("teste");
        }
        throw new PessoaNotFound("id invalido");
    }
}
