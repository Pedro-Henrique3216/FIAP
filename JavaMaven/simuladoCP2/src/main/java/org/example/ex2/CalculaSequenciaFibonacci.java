package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculaSequenciaFibonacci {

    public static int elementoSequencia(int n){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
        for(int i = 2; i < n; i++){
            int soma = list.get(i - 1) + list.get(i - 2);
            list.add(soma);
        }
        return list.get(list.size() - 1);
    }

}
