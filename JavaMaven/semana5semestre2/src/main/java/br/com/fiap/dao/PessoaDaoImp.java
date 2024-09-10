package br.com.fiap.dao;

import br.com.fiap.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDaoImp implements PessoaDao{

    private final Connection conn;

    public PessoaDaoImp(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void create(Pessoa pessoa) throws SQLException{
        conn.setAutoCommit(true);
        PreparedStatement ps = conn.prepareStatement("""
                                    insert into PESSOA_1TDSPJ(id, name, idade) values (?, ?, ?)
                                """);

        ps.setLong(1, pessoa.getId());
        ps.setString(2, pessoa.getNome());
        ps.setInt(3, pessoa.getIdade());

        int rowsAffected = ps.executeUpdate();

        if(rowsAffected < 0){
            throw new RuntimeException("Erro ao inserir pessoa");
        }
    }

    @Override
    public void update(Pessoa pessoa) throws SQLException {
        conn.setAutoCommit(false);
        PreparedStatement ps = conn.prepareStatement("""
                                        update PESSOA_1TDSPJ set name = ?, idade = ? where id = ?
                                    """);
        ps.setString(1, pessoa.getNome());
        ps.setInt(2, pessoa.getIdade());
        ps.setLong(3, pessoa.getId());
        int rowsAffected = ps.executeUpdate();
        if(rowsAffected < 0){
            throw new RuntimeException("Erro ao atualizar pessoa");
        } else if(rowsAffected > 1){
            conn.rollback();
        } else {
            conn.commit();
        }

    }

    @Override
    public void delete(Long id) throws SQLException {
        conn.setAutoCommit(true);
        PreparedStatement ps = conn.prepareStatement("""
                                                          delete PESSOA_1TDSPJ where id = ?
                                                      """);
        ps.setLong(1, id);

        ps.executeUpdate();
    }

    @Override
    public List<Pessoa> read() throws SQLException{
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "select * from PESSOA_1TDSPJ";
        Statement ps = conn.createStatement();
        ResultSet rs = ps.executeQuery(sql);
        while (rs.next()){
            Pessoa p = new Pessoa(rs.getLong(1), rs.getString(2), rs.getInt(3));
            pessoas.add(p);
        }
        return pessoas;
    }
}
