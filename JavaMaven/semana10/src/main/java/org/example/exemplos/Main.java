package org.example.exemplos;

import org.example.exemplos.domain.*;
import org.example.exemplos.interfaces.FiguraGeometrica;

public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(2, 2, 2);
        Quadrilatero quadrilatero = new Quadrilatero(2, 2, 2,2);
        Pentagono pentagono = new Pentagono(2, 2, 2,2 ,2);
        Hexagono hexagono = new Hexagono(2 ,2, 2, 2,2 ,2);

        FiguraGeometrica figuraGeometrica = new Quadrilatero(3, 3, 3, 3);
        FiguraGeometrica figuraGeometrica2 = new Triangulo(3, 3, 3);

        MinimoPoligono minimoPoligono = new Quadrilatero(3 ,3 ,3 ,3);

        System.out.println(triangulo.getArea());
        System.out.println(quadrilatero.getArea());
        System.out.println(pentagono.getArea());
        System.out.println(hexagono.getArea());

    }
}
