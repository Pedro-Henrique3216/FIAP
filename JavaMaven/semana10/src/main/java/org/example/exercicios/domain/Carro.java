package org.example.exercicios.domain;

import org.example.exercicios.interfaces.Veiculo;

public class Carro extends Automovel {

    public Carro(String marca, String modelo, String cor) {
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
