package br.com.fiap.dao;

import br.com.fiap.DatabaseConfig;
import br.com.fiap.entities.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDaoImp implements PessoaDao{

    private final DatabaseConfig db;

    public PessoaDaoImp(DatabaseConfig db) {
        this.db = db;
    }


    @Override
    public void create(Pessoa pessoa){
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement("""
                                    insert into PESSOA_1TDSPJ(id, name, idade) values (?, ?, ?)
                                """);

            ps.setLong(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setInt(3, pessoa.getIdade());

            int rowsAffected = ps.executeUpdate();

            if(rowsAffected < 0){
                conn.close();
                throw new RuntimeException("Erro ao inserir pessoa");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir pessoa", e);
        }


    }

    @Override
    public void update(Pessoa pessoa) {
        try {
            Connection conn = db.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("""
                                        update PESSOA_1TDSPJ set name = ?, idade = ? where id = ?
                                    """);
            ps.setString(1, pessoa.getNome());
            ps.setInt(2, pessoa.getIdade());
            ps.setLong(3, pessoa.getId());
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected < 0){
                conn.close();
                throw new RuntimeException("Erro ao atualizar pessoa");
            } else if(rowsAffected > 1){
                conn.rollback();
            } else {
                conn.commit();
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar pessoa" + e);
        }


    }

    @Override
    public void delete(Long id) {
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement("""
                                        delete PESSOA_1TDSPJ where id = ?
                                    """);
            ps.setLong(1, id);

            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar pessoa " + e);
        }
    }

    @Override
    public List<Pessoa> read() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "select * from PESSOA_1TDSPJ";
        try {
            Connection conn = db.getConnection();
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()){
                Pessoa p = new Pessoa(rs.getLong(1), rs.getString(2), rs.getInt(3));
                pessoas.add(p);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar pessoas");
        }

        return pessoas;
    }
}
