package Semana2;

import java.util.Scanner;

public class LerConsole {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Ola, " + nome + "! Você tem " + idade + " anos de idade");

        sc.close();
    }
}
