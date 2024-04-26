package org.example;

public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(String nome, String telefone, int codigoSetor) {
        super(nome, telefone, codigoSetor);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        if(ajudaDeCusto < 0){
            throw new RuntimeException("Ajuda de custo não pode ser menor que 0");
        }
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
