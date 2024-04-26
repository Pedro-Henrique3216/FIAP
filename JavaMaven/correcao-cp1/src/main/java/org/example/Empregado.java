package org.example;

public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String telefone, int codigoSetor) {
        super(nome, telefone);
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase <= 0){
            throw new RuntimeException("Erro, salario não pode ser abaixo ou igual a 0");
        }
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto / 100;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        return salarioBase - salarioBase * getImposto();
    }
}
