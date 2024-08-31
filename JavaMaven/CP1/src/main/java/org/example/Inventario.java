package org.example;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    public static Map<String, Integer> criarInventario(String[] nomes, Integer[] quantidade){
        Map<String, Integer> produto = new HashMap<>();
        for(int i = 0; i < nomes.length; i++){
            produto.put(nomes[i], quantidade[i]);
        }
        return produto;
    }
}
