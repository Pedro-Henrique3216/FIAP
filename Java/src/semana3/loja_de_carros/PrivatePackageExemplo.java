package semana3.loja_de_carros;

public class PrivatePackageExemplo {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor(Cor.AZUL);

        System.out.println(carro.getCor()); //leitura
    }
}
