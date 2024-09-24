package br.com.fiap.exemploDummy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExemplo {

    public static void main(String[] args) {
        File file =new File("exemplo.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Ja exste");
        }

        if (file.isFile()){
            System.out.println("E um arquivo");
        } else {
            System.out.println("E um diretorio");
        }

    }
}
