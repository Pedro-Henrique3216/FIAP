package br.com.fiap.infra;

import javax.xml.crypto.Data;
import java.net.URI;

final class DatabaseConfig {

    private DatabaseConfig() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static String getUrl(){
        return "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    }
    static String getUser(){
      return "pf1910";
    }
    static String getPass(){
      return "fiap24";
    }


}




