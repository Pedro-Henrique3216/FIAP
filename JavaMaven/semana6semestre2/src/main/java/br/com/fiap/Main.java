package br.com.fiap;

import br.com.fiap.dao.PessoaDao;
import br.com.fiap.dao.PessoaDaoImp;
import br.com.fiap.entities.Pessoa;

import java.sql.SQLException;

public class Main {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    public static final String USER = System.getenv("DB_USER_ORACLE");
    public static final String PASS = System.getenv("DB_PASSWORD_ORACLE");

    public static void main(String[] args) throws SQLException {
        Pessoa pessoa = new Pessoa(1L, "João", 25);

        DatabaseConfig db = new DatabaseConfig(URL, USER, PASS);

        PessoaDao pessoaDao = new PessoaDaoImp(db);

        pessoaDao.read().forEach(System.out::println);

        System.out.println();

        pessoa.setNome("Matheus");
        pessoa.setIdade(30);
        pessoa.setId(5);
        pessoaDao.update(pessoa);

        pessoaDao.delete(1L);
    }
}