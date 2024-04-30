package org.example.exemplos.domain;

import org.example.exemplos.interfaces.FiguraGeometrica;

public abstract class MinimoPoligono implements FiguraGeometrica {

    private double lado, lado2, lado3;
    /*
    private String lado1;
    private String lado2;
    private String lado3;*/

    //outra maneira de cria atributo que possui a mesma visibilidade e tipo
    public MinimoPoligono(double lado, double lado2, double lado3) {
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado() {
        return lado;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }


}
