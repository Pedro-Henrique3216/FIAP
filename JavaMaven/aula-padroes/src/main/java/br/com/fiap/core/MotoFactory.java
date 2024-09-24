package br.com.fiap.core;

public class MotoFactory implements FactoryVeiculo {
    @Override
    public Veiculo createVeiculo() {
        return new Moto();
    }
}
