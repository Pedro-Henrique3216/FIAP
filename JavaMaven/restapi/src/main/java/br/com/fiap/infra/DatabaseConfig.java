package br.com.fiap.infra;

import java.net.URI;

public class DatabaseConfig {

    private final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1571:orcl";
    private final String USER = System.getenv("DB_USER_ORACLE");
    private final String PASS = System.getenv("DB_PASSWORD_ORACLE");


}




