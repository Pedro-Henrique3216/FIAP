package br.com.fiap.exemploDummy;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderExample {
    public static void main(String[] args) {
        String teste = "";
        try (FileReader fr = new FileReader("exemplo.txt")) {
            int character;
            while ((character = fr.read()) != -1){
                System.out.print((char) character);
                teste += (char) character;
            }

            List<String> lista = Arrays.stream(teste.split(" ")).toList();
            List<String> ads = new ArrayList<>();
            System.out.println(lista);
        } catch (IOException e){
            System.out.println("Erro");
        }
    }
}
