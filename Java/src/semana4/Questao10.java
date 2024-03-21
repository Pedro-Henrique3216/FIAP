package Java.src.semana4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        //Leia o código de um determinado produto e mostre sua classificação. Utilize a seguinte tabela como
        //referência:

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto");
        int codigo = sc.nextInt();

        if(codigo == 1){
            System.out.println("Alimento não-perecível");
        } else if(codigo == 2){
            System.out.println("Alimento perecível");
        } else if(codigo == 3){
            System.out.println("Vestuário");
        } else if(codigo == 4){
            System.out.println("Higiene Pessoal");
        } else if(codigo >= 8 && codigo <= 15) {
            System.out.println("Limpeza e Utensílios Domésticos");
        } else {
            System.out.println("Código inválido");
        }

        sc.close();
    }
}
