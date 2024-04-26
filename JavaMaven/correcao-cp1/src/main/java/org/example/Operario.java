package org.example;

public class Operario extends Empregado{

    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, int codigoSetor) {
        super(nome, telefone, codigoSetor);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao / 100;
    }

    public void setComissao(double comisao) {
        this.comissao = comisao;
    }

    public double valorTotalComissaoProducao(){
        return valorProducao + valorProducao * getComissao();
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()+ valorTotalComissaoProducao();
    }


}
