package org.example.exercicios;

import org.example.exercicios.domain.Animal;
import org.example.exercicios.domain.Carro;
import org.example.exercicios.domain.Gato;
import org.example.exercicios.domain.Moto;
import org.example.exercicios.interfaces.Veiculo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Moto moto = new Moto("Honda", "Bis", "Azul");

        moto.abastecer();
        System.out.println(moto.getLitrosDeGasolina());

        moto.dirigir();
        System.out.println(moto.getVelocidade());
        moto.frear();
        System.out.println(moto.getVelocidade());

        Carro carro = new Carro("Tesla", "X", "Azul");

        carro.abastecer();
        System.out.println(carro.getLitrosDeGasolina());

        carro.dirigir();
        System.out.println(carro.getVelocidade());
        carro.frear();
        System.out.println(carro.getVelocidade());

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.addAll(Arrays.asList(carro, moto));

        for (Veiculo veiculo : veiculos){
            veiculo.abastecer();
        }

        System.out.println(moto.getLitrosDeGasolina());
        System.out.println(carro.getLitrosDeGasolina());

        Gato gato = new Gato("Bichano", 3);

        gato.comer();
        gato.dormir();

        List<Animal> animals = new ArrayList<>();
        animals.add(gato);
        for (Animal animal : animals){
            System.out.println(animal.getNome());
            System.out.println(animal.getIdade());
        }
    }
}
