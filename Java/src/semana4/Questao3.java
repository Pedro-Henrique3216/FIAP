package Java.src.semana4;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senhaValida = "1234";

        System.out.print("Insira a senha: ");
        String senha = sc.next();

        if(senhaValida.equals(senha)){
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        sc.close();
    }
}
