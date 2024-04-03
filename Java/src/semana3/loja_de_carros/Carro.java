package semana3.loja_de_carros;

import java.util.List;

//Visibilidade dos atributos
public class Carro {

    //public = acesso de qualquer lugar (ok)
    //private = só consigo acessar dentro da propria classe (ok)
    //private package = privado para fora do package, ou seja, uso restrito dentro package que ele está (ok)
    //protected = dentro classe e dentro de subclass

    private int portas;
    private Cor cor;
    private int lugares;
    private String marca;
    private List<String> adicionais;
    private int velocidade;

    //metodos getters e setters
    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public int getLugares() {
        return lugares;
    }

    public String getMarca() {
        return marca;
    }

    public List<String> getAdicionais() {
        return adicionais;
    }

    public void addAdicionais(String adicional){
        adicionais.add(adicional);
    }

    public void deleteAdicionais(String adicional){
        //implementacao do metodo remover
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(){
        velocidade++;
    }

    public void frear(){
        if(velocidade > 0){
            velocidade--;
        }
    }

}

