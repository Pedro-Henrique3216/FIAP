package br.com.fiap;

import br.com.fiap.core.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new CarroFactory().createVeiculo();
        Veiculo veiculo2 = new MotoFactory().createVeiculo();

        List<Veiculo> veiculos = List.of(veiculo, veiculo2);

       //singleton
        Singleton singleton = Singleton.getInstance();
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Singleton singleton2 = Singleton.getInstance();
        singleton.printCrateAt();
        singleton2.printCrateAt();
    }
}