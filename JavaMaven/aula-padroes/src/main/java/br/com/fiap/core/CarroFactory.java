package br.com.fiap.core;

public class CarroFactory implements FactoryVeiculo{
    @Override
    public Veiculo createVeiculo() {
        return new Carro();
    }
}
