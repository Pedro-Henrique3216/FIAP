package semana4;

public class ContaCorrente {

    private long numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(long numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void saque(double valor){
        if(saldo >= valor && limite >= valor){
            saldo -= valor;
            limite -= valor;
        } else {
            throw new IllegalArgumentException("Saque invalido o valor inserido deve ser menor ou igual ao saldo e menor ou igual ao limite");
        }
    }

    public void deposito(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Deposito invalido o valor inserido deve ser maior que 0");
        }

    }

    public void aumentoLimite(double limite){
        if(limite > 0){
            this.limite += limite;
        } else {
            throw new IllegalArgumentException("Aumento de limite invalido, o limite inserido deve ser maior que 0");
        }
    }
}
