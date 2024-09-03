package br.com.fiap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    public static final String USER = System.getenv("DB_USER_ORACLE");
    public static final String PASS = System.getenv("DB_PASSWORD_ORACLE");

    public static void main(String[] args) throws SQLException {
        Pessoa pessoa = new Pessoa(1L, "João", 25);

        DatabaseConfig db = new DatabaseConfig(URL, USER, PASS);
        Connection con = db.getConnection();

        String sql = "INSERT INTO PESSOA_1TDSPJ(id, name, idade) VALUES (22, 'carlos', 20)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.executeUpdate();
    }
}