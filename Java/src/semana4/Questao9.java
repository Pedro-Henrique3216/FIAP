package Java.src.semana4;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        //Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
        //Retângulo ou Obtusângulo. Sendo que: − Triângulo Retângulo: possui um ângulo reto. (igual a 90º) −
        //Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º) − Triângulo Acutângulo: possui três
        //ângulos agudos. (menor que 90º) Observação: Os somatório dos ângulos internos de um triângulo é sempre
        //180º

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as medidas de cada ângulo do triângulo");
        double angulo1 = sc.nextDouble();
        double angulo2 = sc.nextDouble();
        double angulo3 = sc.nextDouble();

        if(angulo1 + angulo2 + angulo3 != 180){
            System.out.println("Isso não é um triângulo");

        } else {
            if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
                System.out.println("Esse triângulo é o Triângulo Retângulo");
            } else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
                System.out.println("Esse triângulo é o Triângulo Obtusângulo");
            } else if(angulo1 < 90 && angulo2 < 90 && angulo3 < 90){
                System.out.println("Esse triângulo é o Triângulo Acutângulo");
            }
        }

        sc.close();
    }
}
