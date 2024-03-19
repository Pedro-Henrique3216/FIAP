package Java.src.semana3;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        boolean validCPF = pessoa.isCPFValid("12345678909");

        String resultado = validCPF ? "CPF Valido" : "CPF invalido";

        System.out.println(resultado);
    }
}
