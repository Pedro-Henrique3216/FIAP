package org.example.exercicios.domain;

public class Moto extends Automovel{

    public Moto(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    @Override
    public void dirigir() {
        setVelocidade(getVelocidade() + 1);
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 1);
    }

    @Override
    public void abastecer() {
        setLitrosDeGasolina(getLitrosDeGasolina() + 1);
    }
}
