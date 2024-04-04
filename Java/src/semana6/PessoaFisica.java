package semana6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PessoaFisica {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public PessoaFisica(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        if(isCpfValido(cpf)){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF Invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private boolean isCpfValido(String cpf){
        if (cpf.length() != 11){
            return false;
        }
        String[] str = cpf.split("");

        List<Integer> listNumberCPF = new ArrayList<>();
        for (String s : str) {
            listNumberCPF.add(Integer.parseInt(s));
        }

        List<Integer> lastTwoCpf = new ArrayList<>();
        for (int i = listNumberCPF.size() - 2; i < listNumberCPF.size(); i++) {
            lastTwoCpf.add(listNumberCPF.get(i));
        }

        listNumberCPF.remove(10);
        listNumberCPF.remove(9);

        int sum = 0;
        for (int i = 0; i < listNumberCPF.size(); i++){
            sum += (listNumberCPF.get(i) * (i + 1));
        }

        int prymaryDigit;
        if(sum % 11 == 10){
            prymaryDigit = 0;
        } else {
            prymaryDigit = sum % 11;
        }

        listNumberCPF.add(prymaryDigit);
        sum = 0;
        for(int i = 0; i < listNumberCPF.size(); i++){
            sum += listNumberCPF.get(i) * i;
        }

        int secondDigit;
        if(sum % 11 == 10){
            secondDigit = 0;
        } else {
            secondDigit = sum % 11;
        }

        listNumberCPF.add(secondDigit);

        List<Integer> verificacao = Arrays.asList(prymaryDigit, secondDigit);

        return verificacao.equals(lastTwoCpf);
    }
}
