package semana3;

import semana3.loja_de_carros.Carro;
import semana3.loja_de_carros.Cor;

public class SegundoMomento {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor(Cor.AZUL); //escrita
//      carro.marca = "Tesla";

        System.out.println(carro.getCor()); //leitura
    }
}
