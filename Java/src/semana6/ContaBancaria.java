package semana6;

public class ContaBancaria {

    private String agencia;
    private String contaBancaria;
    private Integer digitoConta;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private Long saldo;

    public ContaBancaria(String agencia, String contaBancaria, Integer digitoConta, PessoaFisica pessoaFisica) {
        try {
            validaCriacaoConta(agencia, contaBancaria, digitoConta, pessoaFisica);
            this.agencia = agencia;
            this.contaBancaria = contaBancaria;
            this.digitoConta = digitoConta;
            this.pessoaFisica = pessoaFisica;
            this.saldo = 0L;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public void saque(Long valor){
        try {
            validaValor(valor);
            if(valor > saldo){
                throw new IllegalArgumentException("Valor invalido");
            } else {
                saldo -= valor;
            }

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void deposito(Long valor){
        try {
            validaValor(valor);
            saldo += valor;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private void validaValor(Long valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor invalido");
        }
    }

    private void validaCriacaoConta(String agencia, String contaBancaria, Integer digitoConta, PessoaFisica pessoaFisica){
        if ((agencia == null && agencia.isEmpty()) || (contaBancaria == null && contaBancaria.isEmpty())
                || (digitoConta == null) || (pessoaFisica == null)){
            throw new IllegalArgumentException("Conta Invalida");
        }
    }
}
