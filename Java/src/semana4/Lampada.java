package semana4;

public class Lampada {

    private boolean status = false;


    public boolean getStatus(){
        return status;
    }
    public String ligar(){
        if(status){ return "A lâmpada ja esta ligada"; }
        status = true;
        return "Lâmpada ligada";
    }

    public String desligar(){
        if(!status){ return "A lâmpada ja esta desligada"; }
        status = false;
        return "Lâmpada desligada";
    }

}
