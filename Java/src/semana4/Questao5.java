package Java.src.semana4;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de lados do poligono regular: ");
        int quantidadeLados = sc.nextInt();

        System.out.println("Insira a medida do lado do poligono regular: ");
        int medidaLados = sc.nextInt();


        double area = calcularArea(quantidadeLados, medidaLados);
        String classificacao = classificarPoligono(quantidadeLados);
        System.out.printf("O poligono que tem essa quantidade de lados é o %s é sua área e de %.2f", classificacao, area);


        sc.close();
    }

    public static double calcularArea(int quantidadeLados, int medidaLados){
        double perimetro = quantidadeLados * medidaLados;
        double semiPerimetro = perimetro / 2;
        double apotema = medidaLados / (2 * Math.tan(Math.PI / quantidadeLados));

        double resultado = apotema * semiPerimetro;
        return resultado;
    }

    public static String classificarPoligono(int quantidadeLados){
        if(quantidadeLados == 3){
            return "TRIÂNGULO";
        } else if (quantidadeLados == 4) {
            return "QUADRADO";
        } else if(quantidadeLados == 5){
            return "PENTÁGONO";
        } else {
            throw new IllegalArgumentException("Quantidade de lados invalida");
        }
    }

}
