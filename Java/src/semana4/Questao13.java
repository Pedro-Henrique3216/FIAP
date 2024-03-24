package Java.src.semana4;

public class Questao13 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println(lampada.getStatus());

        System.out.println(lampada.ligar());

        System.out.println(lampada.getStatus());

        System.out.println(lampada.ligar());

        System.out.println(lampada.desligar());

        System.out.println(lampada.getStatus());

        System.out.println(lampada.desligar());

    }
}
