package org.example.exercicios.domain;

import org.example.exercicios.interfaces.Veiculo;

public abstract class Automovel implements Veiculo {

    private String marca;
    private String modelo;
    private String cor;
    private int velocidade = 0;
    private int litrosDeGasolina = 0;

    public Automovel(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getLitrosDeGasolina() {
        return litrosDeGasolina;
    }

    protected void setLitrosDeGasolina(int litrosDeGasolina) {
        this.litrosDeGasolina = litrosDeGasolina;
    }
}
