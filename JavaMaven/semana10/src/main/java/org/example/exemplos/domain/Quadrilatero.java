package org.example.exemplos.domain;

public class Quadrilatero extends MinimoPoligono {

    private double lado4;

    public Quadrilatero(double lado, double lado2, double lado3, double lado4) {
        super(lado, lado2, lado3);
        this.lado4 = lado4;
    }

    public double getLado4() {
        return lado4;
    }

    @Override
    public double getArea() {
        return 4;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
