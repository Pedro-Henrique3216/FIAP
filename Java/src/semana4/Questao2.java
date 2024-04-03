package semana4;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento para validarmos seu direito de voto: ");
        int anoDeNascimento = sc.nextInt();

        int idade = 2024 - anoDeNascimento;

        boolean podeVotar = idade >= 16;

        String validadacao = podeVotar ? "Você pode votar" : "Você não pode votar";

        System.out.println(validadacao);

        sc.close();
    }
}
