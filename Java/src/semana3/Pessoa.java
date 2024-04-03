package semana3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isCPFValid(String cpf){

        String[] str = cpf.split("");

        List<Integer> listNumberCPF = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            listNumberCPF.add(Integer.parseInt(str[i]));
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
