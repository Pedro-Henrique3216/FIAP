package Java.Semana2.exercicios;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite um operador (+,-,*,/): ");
        String operador = sc.next();

        while (!(operador.equals("*") || operador.equals("-") || operador.equals("+") || operador.equals("/"))){
            System.out.print("Operador invalido! Digite outro: ");
            operador = sc.next();
        }

        switch (operador){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                throw new IllegalArgumentException("Error");

        }
    }
}
