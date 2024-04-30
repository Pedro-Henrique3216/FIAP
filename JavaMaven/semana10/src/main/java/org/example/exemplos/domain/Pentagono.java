package org.example.exemplos.domain;

public class Pentagono extends MinimoPoligono {

    private double lado4, lado5;
    public Pentagono(double lado, double lado2, double lado3, double lado4, double lado5) {
        super(lado, lado2, lado3);
        this.lado4 = lado4;
        this.lado5 = lado5;
    }

    public double getLado4() {
        return lado4;
    }

    public double getLado5() {
        return lado5;
    }

    @Override
    public double getArea() {
        return 5;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
