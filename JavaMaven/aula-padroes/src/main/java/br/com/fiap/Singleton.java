package br.com.fiap;

import java.time.LocalDateTime;

public class Singleton {

    private static Singleton instance;

    private LocalDateTime crateAt;

    private Singleton() {
       this.crateAt = LocalDateTime.now();
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printCrateAt(){
        System.out.println(this.crateAt);
    }
}
