package Java.src.semana4;

public class Questao15 {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1234, 1200, true, 800.00);

        cc.saque(600);

        System.out.println(cc.getSaldo());

        cc.deposito(500);

        System.out.println(cc.getSaldo());

        System.out.println(cc.isEspecial());

        cc.aumentoLimite(200);

        System.out.println(cc.getLimite());
    }
}
