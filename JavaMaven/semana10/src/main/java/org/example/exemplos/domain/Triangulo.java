package org.example.exemplos.domain;

public class Triangulo extends MinimoPoligono {

    public Triangulo(double lado1, double lado2, double lado3){
        super(lado1, lado2, lado3);
    }

    @Override
    public double getArea() {
        return 3;
    }

    @Override
    public String getTipo() {
        return "";
    }
}
