package Java.src.semana4;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Insira o segundo número inteiro: ");
        int num2 = sc.nextInt();

        int maiorNumero;

        if(num1 > num2){
            maiorNumero = num1;
        } else {
            maiorNumero = num2;
        }

        System.out.println("Maior numero é " + maiorNumero);

        sc.close();
    }
}
