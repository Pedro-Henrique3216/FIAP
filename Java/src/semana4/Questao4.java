package Java.src.semana4;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        //As maçãs custam R$ 0,30 cada se forem compradas menos do que uma
        // dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
        // programa que leia o número de maçãs compradas, calcule e escreva o
        // valor total da compra.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs que deseja comprar: ");
        int quantidadeMacas = sc.nextInt();

        double totalCompra;
        if(quantidadeMacas < 12){
            totalCompra = 0.30 * quantidadeMacas;
        } else {
            totalCompra = 0.25 * quantidadeMacas;
        }

        System.out.println("O valor total de sua compra foi R$" + String.format("%.2f", totalCompra));

        sc.close();
    }
}
