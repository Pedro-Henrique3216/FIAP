package org.example;

public class Vendedor extends Empregado{

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, int codigoSetor) {
        super(nome, telefone, codigoSetor);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao / 100;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double valorVendasComissao(){
        return valorVendas + valorVendas * getComissao();
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorVendasComissao();
    }
}
