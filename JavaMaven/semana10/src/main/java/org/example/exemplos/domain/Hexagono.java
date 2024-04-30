package org.example.exemplos.domain;

public class Hexagono extends MinimoPoligono {

    private double lado4, lado5, lado6;

    public Hexagono(double lado, double lado2, double lado3, double lado4, double lado5, double lado6) {
        super(lado, lado2, lado3);
        this.lado4 = lado4;
        this.lado5 = lado5;
        this.lado6 = lado6;
    }

    public double getLado4() {
        return lado4;
    }

    public double getLado5() {
        return lado5;
    }

    public double getLado6() {
        return lado6;
    }

    @Override
    public double getArea() {
        return 6;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
