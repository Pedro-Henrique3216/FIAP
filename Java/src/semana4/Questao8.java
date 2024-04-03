package semana4;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        //Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero,
        //Isósceles ou Escaleno. Sendo que: − Triângulo Equilátero: possui os 3 lados iguais. − Triângulo Isóscele:
        //possui 2 lados iguais. − Triângulo Escaleno: possui 3 lados diferentes.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as medidas de cada lado do triângulo");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
            System.out.println("Esse Triângulo é um Triângulo Equilátero");
        } else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Esse Triângulo é um Triângulo Isóscele");
        } else {
            System.out.println("Esse Triângulo é um Triângulo Escaleno");
        }

        sc.close();
    }
}
