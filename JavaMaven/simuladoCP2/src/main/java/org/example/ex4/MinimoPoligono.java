package org.example.ex4;

public abstract class MinimoPoligono implements GeraisParaPoligonos{
        private double l1, l2, l3;

    public MinimoPoligono(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public abstract String getTipo();
}
