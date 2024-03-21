package Java.src.semana4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        //Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não
        // informará valores iguais

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Escreva outro numero inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("Escreva outro numero inteiro: ");
        int num3 = sc.nextInt();

        List<Integer> list = Arrays.asList(num1, num2, num3);

        int maior = 0;
        for(int i = 0; i < 3; i++){
            if(maior < list.get(i)){
                maior = list.get(i);
            }
        }

        System.out.println("O maior numero desses é: " + maior);

        sc.close();
    }
}
