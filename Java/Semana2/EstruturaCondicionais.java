package Java.Semana2;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 17;

        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int dia = 5;

        switch (dia) {
            case 5:
                System.out.println("Dia de receber salário");
                break;
            case 10:
                System.out.println("Dia de pagar a luz");
                break;
            case 15:
                System.out.println("Dia de pagar a intenet");
                break;
            default:
                System.out.println("Dia sem obrigação financeira");
        }
    }
}
