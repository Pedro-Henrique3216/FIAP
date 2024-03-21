package Java.src.semana4;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        //Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. − Caso o número de
        // lados seja inferior a 3 escrever NÃO É UM POLÍGONO. − Caso o número de lados seja superior a 5 escrever
        // POLÍGONO NÃO IDENTIFICADO.

        Scanner sc = new Scanner(System.in);


        System.out.println("Insira o numero de lados do poligono regular: ");
        int quantidadeLados = sc.nextInt();

        System.out.println("Insira a medida do lado do poligono regular: ");
        int medidaLados = sc.nextInt();

        if(quantidadeLados > 5){
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        } else if(quantidadeLados < 3){
            System.out.println("NÃO É UM POLÍGONO");
        } else {
            double area = Questao5.calcularArea(quantidadeLados, medidaLados);
            String classificacao = Questao5.classificarPoligono(quantidadeLados);
            System.out.printf("O poligono que tem essa quantidade de lados é o %s é sua área e de %.2f", classificacao, area);
        }

        sc.close();
    }
}
