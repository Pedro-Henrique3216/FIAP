package semana6;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Pedro", "12345678909", "Rua", "1156484131");
        ContaBancaria c = new ContaBancaria("05243", "0551", 2, pf);

        c.saque(500L);
        c.deposito(500L);
        c.saque(500L);
        c.deposito(0L);
        c.saque(0L);


    }
}
