package org.example.ex4;

public class Triangulo extends MinimoPoligono{

    public Triangulo(double l1, double l2, double l3) {
        super(l1, l2, l3);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
