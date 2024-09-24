package br.com.fiap.exemploDummy;

import java.io.FileWriter;
import java.io.IOException;

public class FlieWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("exemplo.txt")) {
            fw.write("Oi tudo bem");

        } catch (IOException e){
            System.out.println("Nada");
        }
    }

}
