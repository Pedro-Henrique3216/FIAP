package semana3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String cpf = "12345678909";

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


        System.out.println(listNumberCPF);

        System.out.println(lastTwoCpf);

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

        System.out.println(prymaryDigit
        );

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

        System.out.println(secondDigit);

        List<Integer> verificacao = Arrays.asList(prymaryDigit, secondDigit);

        if(verificacao.equals(lastTwoCpf)){
            System.out.println("Vallido");
        } else {
            System.out.println("Invalido");
        }

    }

}
